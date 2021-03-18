package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Nos centramos en la tabla "Notificacion"
@Entity
@Table(name = "Notificacion")

public class Notificacion {

	// Atributos de Notificacion
	@Id
	@Column(name = "cod_notificacion")
	private int id;
	@Column(name = "mensaje")
	private String mensaje;
	@Column(name = "leido")
	private int leido;

	@ManyToOne
	@JoinColumn(name = "cod_trabajador")
	private Trabajador trabajador;
	@ManyToOne(targetEntity=es.http.service.dto.Prestamo.class)
	@JoinColumn(name= "cod_prestamo")
	private Prestamo Prestamo;

	// Constructores
	/**
	 * 
	 */
	public Notificacion() {
		
	}

	/**
	 * @param id
	 * @param mensaje
	 * @param leido
	 * @param trabajador
	 */
	

	// Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public Notificacion(int id, String mensaje, int leido, Trabajador trabajador,
			Prestamo prestamo) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.leido = leido;
		this.trabajador = trabajador;
		Prestamo = prestamo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the leido
	 */
	public int getLeido() {
		return leido;
	}

	/**
	 * @param leido the leido to set
	 */
	public void setLeido(int leido) {
		this.leido = leido;
	}

	/**
	 * @return the trabajador
	 */
	
	public Trabajador getTrabajador() {
		return trabajador;
	}

	/**
	 * @param trabajador the trabajador to set
	 */
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	

	public Prestamo getPrestamo() {
		return Prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		Prestamo = prestamo;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Notificacion [id=" + id + ", mensaje=" + mensaje + ", leido=" + leido + 
				 "]";
	}

}
