package es.http.service.service;

import java.util.List;

import es.http.service.dto.Voto;

public interface IVotoService {
	
	// Metodos del CRUD
	public List<Voto> listarVoto(); // Listar All

	public Voto guardarVoto(Voto Voto); // Guarda un Voto CREATE

	public Voto VotoXID(int id); // Leer datos de un Voto READ

	public Voto actualizarVoto(Voto Voto); // Actualiza datos del Voto UPDATE

	public void eliminarVoto(int id);// Elimina el Voto DELETE

}