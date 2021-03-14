package es.http.service.service;

import java.util.List;

import es.http.service.dto.Editorial;

public interface IEditorialService {
	public List<Editorial> listarEditorial(); //Listar All 
	
	public Editorial guardarEditorial(Editorial Editorial);	//Guarda un AsignadoA CREATE
	
	public Editorial EditorialXID(int id); //Leer datos de un AsignadoA READ
	
	public Editorial actualizarEditorial(Editorial Editorial); //Actualiza datos del AsignadoA UPDATE
	
	public void eliminarEditorial(int id);// Elimina el AsignadoA DELETE


}
