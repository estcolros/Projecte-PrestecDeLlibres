package es.http.service.service;

import java.util.List;

import es.http.service.dto.Notificacion;

public interface INotificacionService {

	// Metodos del CRUD
	public List<Notificacion> listarNotificacion(); // Listar All

	public Notificacion guardarNotificacion(Notificacion notificacion); // Guarda un notificacion CREATE

	public Notificacion NotificacionXID(int id); // Leer datos de un notificacion READ

	public Notificacion actualizarNotificacion(Notificacion notificacion); // Actualiza datos del notificacion UPDATE

	public void eliminarNotificacion(int id);// Elimina el notificacion DELETE

}


