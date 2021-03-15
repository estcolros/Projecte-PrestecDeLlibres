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
	private String leido;

	@OneToMany
	@JoinColumn(name = "cod_notificacion")
	private List<Trabajador> trabajador;

	// Constructores
	/**
	 * 
	 */
	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param mensaje
	 * @param leido
	 * @param trabajador
	 */
	public Notificacion(int id, String mensaje, String leido, List<Trabajador> trabajador) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.leido = leido;
		this.trabajador = trabajador;
	}

	// Getters y Setters
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
	public String getLeido() {
		return leido;
	}

	/**
	 * @param leido the leido to set
	 */
	public void setLeido(String leido) {
		this.leido = leido;
	}

	/**
	 * @return the trabajador
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Trabajador")
	public List<Trabajador> getTrabajador() {
		return trabajador;
	}

	/**
	 * @param trabajador the trabajador to set
	 */
	public void setTrabajador(List<Trabajador> trabajador) {
		this.trabajador = trabajador;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Notificacion [id=" + id + ", mensaje=" + mensaje + ", leido=" + leido + ", trabajador=" + trabajador
				+ "]";
	}

}
