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

import es.http.service.dto.Notificacion;
import es.http.service.service.NotificacionServiceImpl;

@RestController
@RequestMapping("/api")
public class NotificacionController {

	@Autowired
	NotificacionServiceImpl NotificacionServiceImpl;

	@GetMapping("/notificaciones")
	public List<Notificacion> listarNotificacion() {
		return NotificacionServiceImpl.listarNotificacion();
	}

	@PostMapping("/notificaciones")
	public Notificacion salvarNotificacion(@RequestBody Notificacion Notificacion) {

		return NotificacionServiceImpl.guardarNotificacion(Notificacion);
	}

	@GetMapping("/notificacion/{id}")
	public Notificacion NotificacionXID(@PathVariable(name = "id") int id) {

		Notificacion Notificacion_xid = new Notificacion();

		Notificacion_xid = NotificacionServiceImpl.NotificacionXID(id);

		return Notificacion_xid;
	}

	@PutMapping("/notificacion/{id}")
	public Notificacion actualizarNotificacion(@PathVariable(name = "id") int id, @RequestBody Notificacion Notificacion) {

		Notificacion Notificacion_seleccionado = new Notificacion();
		Notificacion Notificacion_actualizado = new Notificacion();

		Notificacion_seleccionado = NotificacionServiceImpl.NotificacionXID(id);

		Notificacion_seleccionado.setTrabajador(Notificacion.getTrabajador());
		Notificacion_seleccionado.setLeido(Notificacion.getLeido());
		Notificacion_seleccionado.setMensaje(Notificacion.getMensaje());
		Notificacion_seleccionado.setPrestamo(Notificacion.getPrestamo());
		Notificacion_seleccionado.setTrabajadorrecibe(Notificacion.getTrabajadorrecibe());

		Notificacion_actualizado = NotificacionServiceImpl.actualizarNotificacion(Notificacion_seleccionado);

		return Notificacion_actualizado;
	}

	@DeleteMapping("/notificacion/{id}")
	public void eleiminarNotificacion(@PathVariable(name = "id") int id) {
		NotificacionServiceImpl.eliminarNotificacion(id);
	}
}
