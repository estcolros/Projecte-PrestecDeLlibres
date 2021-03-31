package es.http.service.service;

import java.util.List;

import es.http.service.dto.Libro;

public interface ILibroService {

	// Metodos del CRUD
	public List<Libro> listarLibro(); // Listar All

	public Libro guardarLibro(Libro Libro); // Guarda un libro CREATE

	public Libro LibroXID(int id); // Leer datos de un libro READ

	public Libro actualizarLibro(Libro libro); // Actualiza datos del libro UPDATE

	public void eliminarLibro(int id);// Elimina el libro DELETE

}
