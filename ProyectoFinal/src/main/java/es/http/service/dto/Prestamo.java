package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Prestamo")// Nos centramos en la tabla "Prestamo"

public class Prestamo {
	

	// Atributos de Prestamo
	@Id
	@Column(name = "cod_prestamo")
	private int id;
	@Column(name = "fecha_caducidad")
	private String fechacaducidad;
	@Column(name = "fecha_alta")
	private String fechaalta;
	@Column(name = "fecha_devolucion")
	private String fechadevolucion;

	
	@ManyToOne(targetEntity=es.http.service.dto.Trabajador.class)
	@JoinColumn(name="trabajador_recibe")
	private Trabajador trabajadorrecibe;
	@ManyToOne(targetEntity=es.http.service.dto.Trabajador.class)
	@JoinColumn(name="trabajador_presta")
	private Trabajador trabajadorpresta;
	
	@ManyToOne(targetEntity=es.http.service.dto.Ejemplar.class)
	@JoinColumn(name="cod_ejemplar")
	private Ejemplar ejemplar;
	// Constructores
	
	public Prestamo() {
	
	}

	
	public Prestamo(int id, String fechacaducidad, String fechaalta, String fechadevolucion,Trabajador trabajadorrecibe, Trabajador trabajadorpresta,Ejemplar ejemplar) {
		this.id = id;
		this.fechacaducidad = fechacaducidad;
		this.fechaalta = fechaalta;
		this.fechadevolucion = fechadevolucion;
		this.trabajadorrecibe = trabajadorrecibe;
		this.trabajadorpresta = trabajadorpresta;
		this.ejemplar = ejemplar;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getFechacaducidad() {
		return fechacaducidad;
	}

	
	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	
	public String getFechaalta() {
		return fechaalta;
	}

	
	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

	
	public String getFechadevolucion() {
		return fechadevolucion;
	}

	public void setFechadevolucion(String fechadevolucion) {
		this.fechadevolucion = fechadevolucion;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	public Trabajador getTrabajadorrecibe() {
		return trabajadorrecibe;
	}

	public void setTrabajadorrecibe(Trabajador trabajadorrecibe) {
		this.trabajadorrecibe = trabajadorrecibe;
	}

	public Trabajador getTrabajadorpresta() {
		return trabajadorpresta;
	}

	public void setTrabajadorpresta(Trabajador trabajadorpresta) {
		this.trabajadorpresta = trabajadorpresta;
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", fechacaducidad=" + fechacaducidad + ", fechaalta=" + fechaalta
				+ ", fechadevolucion=" + fechadevolucion 
				+ ", trabajadorrecibe=" + trabajadorrecibe + ", trabajadorpresta=" + trabajadorpresta + ", ejemplar="
				+ ejemplar + "]";
	}

	


	
}
