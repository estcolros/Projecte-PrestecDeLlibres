package es.http.service.service;

import java.util.List;

import es.http.service.dto.Autor;

public interface IAutorService {

	// Metodos del CRUD
	public List<Autor> listarAutor(); // Listar All

	public Autor guardarAutor(Autor Autor); // Guarda un Autor CREATE

	public Autor AutorXID(int id); // Leer datos de un Autor READ

	public Autor actualizarAutor(Autor Autor); // Actualiza datos del Autor UPDATE

	public void eliminarAutor(int id);// Elimina el Autor DELETE

}