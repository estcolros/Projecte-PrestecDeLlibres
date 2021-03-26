package es.http.service.service;

import java.util.List;

import es.http.service.dto.Trabajador;

public interface ITrabajadorService {
	
	// Metodos del CRUD
	public List<Trabajador> listarTrabajador(); // Listar All

	public Trabajador guardarTrabajador(Trabajador Trabajador); // Guarda un AsignadoA CREATE

	public Trabajador TrabajadorXID(int id); // Leer datos de un AsignadoA READ

	public Trabajador actualizarTrabajador(Trabajador Trabajador); // Actualiza datos del AsignadoA UPDATE

	public void eliminarTrabajador(int id);// Elimina el AsignadoA DELETE

}