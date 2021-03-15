package es.http.service.service;

import java.util.List;

import es.http.service.dto.Ejemplar;

public interface IEjemplarService {

	// Metodos del CRUD
	public List<Ejemplar> listarEjemplar(); // Listar All

	public Ejemplar guardarEjemplar(Ejemplar Ejemplar); // Guarda un AsignadoA CREATE

	public Ejemplar EjemplarXID(int id); // Leer datos de un AsignadoA READ

	public Ejemplar actualizarEjemplar(Ejemplar Ejemplar); // Actualiza datos del AsignadoA UPDATE

	public void eliminarEjemplar(int id);// Elimina el AsignadoA DELETE

}