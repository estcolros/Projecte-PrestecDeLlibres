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

import es.http.service.dto.Prestamo;
import es.http.service.service.PrestamoServiceImpl;

@RestController
@RequestMapping(value="/api", method= { RequestMethod.POST, RequestMethod.PUT})
public class PrestamoController {
	@Autowired
	PrestamoServiceImpl PrestamoServiceImpl;

	@GetMapping("/prestamos")
	public List<Prestamo> listarPrestamo() {
		return PrestamoServiceImpl.listarPrestamo();
	}

	@PostMapping("/prestamos")
	public Prestamo salvarPrestamo(@RequestBody Prestamo Prestamo) {

		return PrestamoServiceImpl.guardarPrestamo(Prestamo);
	}

	@GetMapping("/prestamos/{id}")
	public Prestamo PrestamoXID(@PathVariable(name = "id") int id) {

		Prestamo Prestamo_xid = new Prestamo();

		Prestamo_xid = PrestamoServiceImpl.PrestamoXID(id);

		// System.out.println("Equipo XID: "+Prestamo_xid);

		return Prestamo_xid;
	}

	@PutMapping("/prestamo/{id}")
	public Prestamo actualizarPrestamo(@PathVariable(name = "id") int id, @RequestBody Prestamo Prestamo) {

		Prestamo Prestamo_seleccionado = new Prestamo();
		Prestamo Prestamo_actualizado = new Prestamo();

		Prestamo_seleccionado = PrestamoServiceImpl.PrestamoXID(id);

		Prestamo_seleccionado.setFechaalta(Prestamo.getFechaalta());
		Prestamo_seleccionado.setFechacaducidad(Prestamo.getFechacaducidad());
		Prestamo_seleccionado.setFechadevolucion(Prestamo.getFechadevolucion());
		Prestamo_seleccionado.setNotificacion(Prestamo.getNotificacion());
		Prestamo_seleccionado.setId(Prestamo.getId());
		Prestamo_seleccionado.setVoto(Prestamo.getVoto());

		Prestamo_actualizado = PrestamoServiceImpl.actualizarPrestamo(Prestamo_seleccionado);

		// System.out.println("El Equipo actualizado es: "+ Equipo_actualizado);

		return Prestamo_actualizado;
	}

	@DeleteMapping("/prestamo/{id}")
	public void eleiminarPrestamo(@PathVariable(name = "id") int id) {
		PrestamoServiceImpl.eliminarPrestamo(id);
	}

}
