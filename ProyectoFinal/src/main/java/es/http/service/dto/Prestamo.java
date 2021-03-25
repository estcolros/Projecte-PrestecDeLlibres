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
@Table(name = "Prestamo")

public class Prestamo {
	// Nos centramos en la tabla "Prestamo"

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

	@OneToMany
	@JoinColumn(name = "cod_notificacion")
	private List<Notificacion> notificacion;

//	@ManyToOne(targetEntity=es.http.service.dto.Voto.class)
//	@JoinColumn(name="cod_voto")
//	private Voto voto;
	
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
	/**
	 * 
	 */
	public Prestamo() {
	
	}

	/**
	 * @param id
	 * @param fechacaducidad
	 * @param fechaalta
	 * @param fechadevolucion
	 * @param notificacion
	 */


	// Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	

	public Prestamo(int id, String fechacaducidad, String fechaalta, String fechadevolucion,
			List<Notificacion> notificacion, Trabajador trabajadorrecibe, Trabajador trabajadorpresta,
			Ejemplar ejemplar) {
		super();
		this.id = id;
		this.fechacaducidad = fechacaducidad;
		this.fechaalta = fechaalta;
		this.fechadevolucion = fechadevolucion;
		this.notificacion = notificacion;
//		this.voto = voto;
		this.trabajadorrecibe = trabajadorrecibe;
		this.trabajadorpresta = trabajadorpresta;
		this.ejemplar = ejemplar;
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

	
//
//	public Voto getVoto() {
//		return voto;
//	}
//
//	public void setVoto(Voto voto) {
//		this.voto = voto;
//	}


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

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", fechacaducidad=" + fechacaducidad + ", fechaalta=" + fechaalta
				+ ", fechadevolucion=" + fechadevolucion + ", notificacion=" + notificacion 
				+ ", trabajadorrecibe=" + trabajadorrecibe + ", trabajadorpresta=" + trabajadorpresta + ", ejemplar="
				+ ejemplar + "]";
	}

	


	
}
