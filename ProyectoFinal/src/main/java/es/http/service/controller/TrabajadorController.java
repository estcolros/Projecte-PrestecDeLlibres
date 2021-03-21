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

import es.http.service.dto.Trabajador;
import es.http.service.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {

	@Autowired
	TrabajadorServiceImpl TrabajadorServiceImpl;

	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajador() {
		return TrabajadorServiceImpl.listarTrabajador();
	}

	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {

		return TrabajadorServiceImpl.guardarTrabajador(trabajador);
	}

	@GetMapping("/trabajador/{id}")
	public Trabajador TrabajadorXID(@PathVariable(name = "id") int id) {

		Trabajador Trabajador_xid = new Trabajador();

		Trabajador_xid = TrabajadorServiceImpl.TrabajadorXID(id);

//				System.out.println("Trabajador XID: "+Trabajador_xid);

		return Trabajador_xid;
	}

	@PutMapping("/trabajador/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name = "id") int id, @RequestBody Trabajador trabajador) {

		Trabajador Trabajador_seleccionado = new Trabajador();
		Trabajador Trabajador_actualizado = new Trabajador();

		Trabajador_seleccionado = TrabajadorServiceImpl.TrabajadorXID(id);

		Trabajador_seleccionado.setNombre(trabajador.getNombre());
		Trabajador_seleccionado.setApellido1(trabajador.getApellido1());
		Trabajador_seleccionado.setApellido2(trabajador.getApellido2());
		Trabajador_seleccionado.setCorreo(trabajador.getCorreo());
		Trabajador_seleccionado.setDni(trabajador.getDni());
		Trabajador_seleccionado.setNotificacion(trabajador.getNotificacion());
		Trabajador_seleccionado.setPassword(trabajador.getPassword());
		Trabajador_seleccionado.setTelefono(trabajador.getTelefono());
		Trabajador_seleccionado.setUser(trabajador.getUser());

		Trabajador_actualizado = TrabajadorServiceImpl.actualizarTrabajador(Trabajador_seleccionado);

//				System.out.println("El Trabajador actualizado es: "+ Trabajador_actualizado);

		return Trabajador_actualizado;
	}

	@DeleteMapping("/trabajador/{id}")
	public void eleiminarTrabajador(@PathVariable(name = "id") int id) {
		TrabajadorServiceImpl.eliminarTrabajador(id);
	}

}