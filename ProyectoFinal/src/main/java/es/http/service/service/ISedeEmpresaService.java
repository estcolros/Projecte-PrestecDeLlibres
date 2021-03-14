package es.http.service.service;

import java.util.List;

import es.http.service.dto.SedeEmpresa;

public interface ISedeEmpresaService {

	//Metodos del CRUD
	public List<SedeEmpresa> listarSedeEmpresa(); //Listar All 
	
	public SedeEmpresa guardarSedeEmpresa(SedeEmpresa SedeEmpresa);	//Guarda un AsignadoA CREATE
	
	public SedeEmpresa SedeEmpresaXID(int id); //Leer datos de un AsignadoA READ
	
	public SedeEmpresa actualizarSedeEmpresa(SedeEmpresa SedeEmpresa); //Actualiza datos del AsignadoA UPDATE
	
	public void eliminarSedeEmpresa(int id);// Elimina el AsignadoA DELETE

}
