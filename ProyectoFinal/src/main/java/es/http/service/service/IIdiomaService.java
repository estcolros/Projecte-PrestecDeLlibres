package es.http.service.service;

import java.util.List;

import es.http.service.dto.Idioma;

public interface IIdiomaService {

	// Metodos del CRUD
	public List<Idioma> listarIdioma(); // Listar All

	public Idioma guardarIdioma(Idioma Idioma); // Guarda un Idioma CREATE

	public Idioma IdiomaXID(int id); // Leer datos de un Idioma READ

	public Idioma actualizarIdioma(Idioma Idioma); // Actualiza datos del Idioma UPDATE

	public void eliminarIdioma(int id);// Elimina el Idioma DELETE

}