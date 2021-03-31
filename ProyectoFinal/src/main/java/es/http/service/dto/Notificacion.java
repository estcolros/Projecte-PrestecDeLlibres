package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
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

	@ManyToOne(targetEntity=es.http.service.dto.Trabajador.class)
	@JoinColumn(name= "trabajador_recibe")
	private Trabajador trabajadorrecibe;
	
	// Constructores
	
	public Notificacion() {
		
	}


	// Getters y Setters
	
	public int getId() {
		return id;
	}


	public Notificacion(int id, String mensaje, int leido, Trabajador trabajador, es.http.service.dto.Prestamo prestamo,Trabajador trabajadorrecibe) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.leido = leido;
		this.trabajador = trabajador;
		Prestamo = prestamo;
		this.trabajadorrecibe = trabajadorrecibe;
	}


	//Getters y Setters
	
	public void setId(int id) {
		this.id = id;
	}


	public String getMensaje() {
		return mensaje;
	}

	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public int getLeido() {
		return leido;
	}

	
	public void setLeido(int leido) {
		this.leido = leido;
	}


	
	public Trabajador getTrabajador() {
		return trabajador;
	}


	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	

	public Prestamo getPrestamo() {
		return Prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		Prestamo = prestamo;
		
	}
	

	public Trabajador getTrabajadorrecibe() {
		return trabajadorrecibe;
	}


	public void setTrabajadorrecibe(Trabajador trabajadorrecibe) {
		this.trabajadorrecibe = trabajadorrecibe;
	}


	// Método ToString
	@Override
	public String toString() {
		return "Notificacion [id=" + id + ", mensaje=" + mensaje + ", leido=" + leido + ", trabajador=" + trabajador
				+ ", trabajadorrecibe=" + trabajadorrecibe + "]";
	}



	

}
