package es.http.service.service;

import java.util.List;

import es.http.service.dto.Editorial;

public interface IEditorialService {

	// Metodos del CRUD
	public List<Editorial> listarEditorial(); // Listar All

	public Editorial guardarEditorial(Editorial Editorial); // Guarda un Autor CREATE

	public Editorial EditorialXID(int id); // Leer datos de un Autor READ

	public Editorial actualizarEditorial(Editorial Editorial); // Actualiza datos del Autor UPDATE

	public void eliminarEditorial(int id);// Elimina el Autor DELETE

}
