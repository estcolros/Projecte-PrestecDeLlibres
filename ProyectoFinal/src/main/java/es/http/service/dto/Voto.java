package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Nos centramos en la tabla Voto
@Entity
@Table(name = "Voto")
public class Voto {

	// Atributos de Voto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "opinion") // no hace falta si se llama igual
	private String opinion;
	@Column(name = "calificacion") // no hace falta si se llama igual
	private int calificacion;

	// PREGUNTAR DEBILES A JOSE!!!!!

	@OneToMany
	@JoinColumn(name = "cod_prestamo")
	private List<Prestamo> Prestamo;

	@ManyToOne
	@JoinColumn(name = "cod_ejemplar")
	Ejemplar codigoEjemplar;

	// Constructores
	/**
	 * 
	 */
	public Voto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param opinion
	 * @param calificacion
	 * @param prestamo
	 * @param codigoEjemplar
	 */
	public Voto(int id, String opinion, int calificacion, List<es.http.service.dto.Prestamo> prestamo,
			Ejemplar codigoEjemplar) {
		super();
		this.id = id;
		this.opinion = opinion;
		this.calificacion = calificacion;
		Prestamo = prestamo;
		this.codigoEjemplar = codigoEjemplar;
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
	 * @return the opinion
	 */
	public String getOpinion() {
		return opinion;
	}

	/**
	 * @param opinion the opinion to set
	 */
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	/**
	 * @return the calificacion
	 */
	public int getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the prestamo
	 */
	public List<Prestamo> getPrestamo() {
		return Prestamo;
	}

	/**
	 * @param prestamo the prestamo to set
	 */
	public void setPrestamo(List<Prestamo> prestamo) {
		Prestamo = prestamo;
	}

	/**
	 * @return the codigoEjemplar
	 */
	public Ejemplar getCodigoEjemplar() {
		return codigoEjemplar;
	}

	/**
	 * @param codigoEjemplar the codigoEjemplar to set
	 */
	public void setCodigoEjemplar(Ejemplar codigoEjemplar) {
		this.codigoEjemplar = codigoEjemplar;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Voto [id=" + id + ", opinion=" + opinion + ", calificacion=" + calificacion + ", Prestamo=" + Prestamo
				+ ", codigoEjemplar=" + codigoEjemplar + "]";
	}

}