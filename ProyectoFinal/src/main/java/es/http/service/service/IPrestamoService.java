package es.http.service.service;

import java.util.List;

import es.http.service.dto.Prestamo;

public interface IPrestamoService {
	
	// Metodos del CRUD
	public List<Prestamo> listarPrestamo(); // Listar All

	public Prestamo guardarPrestamo(Prestamo prestamo); // Guarda un Prestamo CREATE

	public Prestamo PrestamoXID(int id); // Leer datos de un Prestamo READ

	public Prestamo actualizarPrestamo(Prestamo prestamo); // Actualiza datos del Prestamo UPDATE

	public void eliminarPrestamo(int id);// Elimina el Prestamo DELETE

}
