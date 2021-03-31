package es.http.service.service;

import java.util.List;

import es.http.service.dto.Trabajador;

public interface ITrabajadorService {
	
	// Metodos del CRUD
	public List<Trabajador> listarTrabajador(); // Listar All

	public Trabajador guardarTrabajador(Trabajador Trabajador); // Guarda un Trabajador CREATE

	public Trabajador TrabajadorXID(int id); // Leer datos de un Trabajador READ
	
	public Trabajador TrabajadorXuser(String user); //Leer datos de un trabajador por username
	

	public Trabajador actualizarTrabajador(Trabajador Trabajador); // Actualiza datos del Trabajador UPDATE

	public void eliminarTrabajador(int id);// Elimina el Trabajador DELETE

}