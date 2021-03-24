package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.SedeEmpresa;
import es.http.service.service.SedeEmpresaServiceImpl;

@RestController
@RequestMapping("/api")
public class SedeEmpresaController {

	@Autowired
	SedeEmpresaServiceImpl SedeEmpresaServiceImpl;

	@GetMapping("/sedeEmpresas")
	public List<SedeEmpresa> listarSedeEmpresa() {
		return SedeEmpresaServiceImpl.listarSedeEmpresa();
	}

	@PostMapping("/sedeEmpresas")
	public SedeEmpresa salvarSedeEmpresa(@RequestBody SedeEmpresa sedeEmpresa) {

		return SedeEmpresaServiceImpl.guardarSedeEmpresa(sedeEmpresa);
	}

	@GetMapping("/sedeEmpresa/{id}")
	public SedeEmpresa SedeEmpresaXID(@PathVariable(name = "id") int id) {

		SedeEmpresa SedeEmpresa_xid = new SedeEmpresa();

		SedeEmpresa_xid = SedeEmpresaServiceImpl.SedeEmpresaXID(id);

//			System.out.println("SedeEmpresa XID: "+SedeEmpresa_xid);

		return SedeEmpresa_xid;
	}

	@PutMapping("/sedeEmpresa/{id}")
	public SedeEmpresa actualizarSedeEmpresa(@PathVariable(name = "id") int id, @RequestBody SedeEmpresa sedeEmpresa) {

		SedeEmpresa SedeEmpresa_seleccionado = new SedeEmpresa();
		SedeEmpresa SedeEmpresa_actualizado = new SedeEmpresa();

		SedeEmpresa_seleccionado = SedeEmpresaServiceImpl.SedeEmpresaXID(id);

		SedeEmpresa_seleccionado.setNombre(sedeEmpresa.getNombre());
		
		SedeEmpresa_seleccionado.setLocalidad(sedeEmpresa.getLocalidad());
		SedeEmpresa_actualizado = SedeEmpresaServiceImpl.actualizarSedeEmpresa(SedeEmpresa_seleccionado);

//			System.out.println("El SedeEmpresa actualizado es: "+ SedeEmpresa_actualizado);

		return SedeEmpresa_actualizado;
	}

	@DeleteMapping("/sedeEmpresa/{id}")
	public void eleiminarSedeEmpresa(@PathVariable(name = "id") int id) {
		SedeEmpresaServiceImpl.eliminarSedeEmpresa(id);
	}

}