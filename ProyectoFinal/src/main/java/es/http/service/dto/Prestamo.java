package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Prestamo")

public class Prestamo {
	// Nos centramos en la tabla "Prestamo"

	// Atributos de Prestamo
	@Id
	@Column(name = "cod_prestamo")
	private int id;
	@Column(name = "FechaCaducidad")
	private String fechacaducidad;
	@Column(name = "FechaAlta")
	private String fechaalta;
	@Column(name = "FechaDevolucion")
	private String fechadevolucion;

	@OneToMany
	@JoinColumn(name = "cod_notificacion")
	private List<Notificacion> notificacion;

	/**
	 * 
	 */
	public Prestamo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param fechacaducidad
	 * @param fechaalta
	 * @param fechadevolucion
	 * @param notificacion
	 */
	public Prestamo(int id, String fechacaducidad, String fechaalta, String fechadevolucion,
			List<Notificacion> notificacion) {
		super();
		this.id = id;
		this.fechacaducidad = fechacaducidad;
		this.fechaalta = fechaalta;
		this.fechadevolucion = fechadevolucion;
		this.notificacion = notificacion;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fechacaducidad
	 */
	public String getFechacaducidad() {
		return fechacaducidad;
	}

	/**
	 * @param fechacaducidad the fechacaducidad to set
	 */
	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	/**
	 * @return the fechaalta
	 */
	public String getFechaalta() {
		return fechaalta;
	}

	/**
	 * @param fechaalta the fechaalta to set
	 */
	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

	/**
	 * @return the fechadevolucion
	 */
	public String getFechadevolucion() {
		return fechadevolucion;
	}

	/**
	 * @param fechadevolucion the fechadevolucion to set
	 */
	public void setFechadevolucion(String fechadevolucion) {
		this.fechadevolucion = fechadevolucion;
	}

	/**
	 * @return the notificacion
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Notificacion")
	public List<Notificacion> getNotificacion() {
		return notificacion;
	}

	/**
	 * @param notificacion the notificacion to set
	 */
	public void setNotificacion(List<Notificacion> notificacion) {
		this.notificacion = notificacion;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", fechacaducidad=" + fechacaducidad + ", fechaalta=" + fechaalta
				+ ", fechadevolucion=" + fechadevolucion + ", notificacion=" + notificacion + "]";
	}

}
