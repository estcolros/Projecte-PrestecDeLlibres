package es.http.service.service;

import java.util.List;

import es.http.service.dto.SedeEmpresa;

public interface ISedeEmpresaService {

	// Metodos del CRUD
	public List<SedeEmpresa> listarSedeEmpresa(); // Listar All

	public SedeEmpresa guardarSedeEmpresa(SedeEmpresa SedeEmpresa); // Guarda una SedeEmpresa CREATE

	public SedeEmpresa SedeEmpresaXID(int id); // Leer datos de una SedeEmpresa READ

	public SedeEmpresa actualizarSedeEmpresa(SedeEmpresa SedeEmpresa); // Actualiza datos de la SedeEmpresa UPDATE

	public void eliminarSedeEmpresa(int id);// Elimina la SedeEmpresa DELETE

}