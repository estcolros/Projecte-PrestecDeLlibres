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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Ejemplar;
import es.http.service.service.EjemplarServiceImpl;

@RestController
@RequestMapping(value="/api")
public class EjemplarController {

	@Autowired
	EjemplarServiceImpl EjemplarServiceImpl;

	@GetMapping("/ejemplares")
	public List<Ejemplar> listarEjemplar() {
		return EjemplarServiceImpl.listarEjemplar();
	}

	@PostMapping("/ejemplares")
	public Ejemplar salvarEjemplar(@RequestBody Ejemplar Ejemplar) {

		return EjemplarServiceImpl.guardarEjemplar(Ejemplar);
	}

	@GetMapping("/ejemplar/{id}")
	public Ejemplar EjemplarXID(@PathVariable(name = "id") int id) {

		Ejemplar Ejemplar_xid = new Ejemplar();

		Ejemplar_xid = EjemplarServiceImpl.EjemplarXID(id);

//		System.out.println("Ejemplar XID: " + Ejemplar_xid);

		return Ejemplar_xid;
	}

	@PutMapping("/ejemplar/{id}")
	public Ejemplar actualizarEjemplar(@PathVariable(name = "id") int id, @RequestBody Ejemplar ejemplar) {

		Ejemplar Ejemplar_seleccionado = new Ejemplar();
		Ejemplar Ejemplar_actualizado = new Ejemplar();

		Ejemplar_seleccionado = EjemplarServiceImpl.EjemplarXID(id);
		Ejemplar_seleccionado.setEstado(ejemplar.getEstado());
		Ejemplar_seleccionado.setCod_libro(ejemplar.getCod_libro());
//		Ejemplar_seleccionado.setCod_prestamo(ejemplar.getCod_prestamo());
		Ejemplar_seleccionado.setCod_sede(ejemplar.getCod_sede());
		Ejemplar_actualizado = EjemplarServiceImpl.actualizarEjemplar(Ejemplar_seleccionado);

//		System.out.println("El Ejemplar actualizado es: " + Ejemplar_actualizado);

		return Ejemplar_actualizado;
	}

	@DeleteMapping("/ejemplar/{id}")
	public void eleiminarEjemplar(@PathVariable(name = "id") int id) {
		EjemplarServiceImpl.eliminarEjemplar(id);
	}
}