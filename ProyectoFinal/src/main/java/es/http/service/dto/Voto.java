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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Nos centramos en la tabla Voto
@Entity
@Table(name = "voto")
public class Voto {

	// Atributos de Voto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="cod_voto")
	private int id;

	@Column(name = "opinion") // no hace falta si se llama igual
	private String opinion;
	@Column(name = "calificacion") // no hace falta si se llama igual
	private int calificacion;

	@OneToMany
	@JoinColumn(name="cod_sede")
	private List<SedeEmpresa> sedeEmpresa;

	@OneToMany
	@JoinColumn(name="cod_prestamo")
	private List<Prestamo> prestamo;

//	@ManyToOne
//	@JoinColumn(name = "cod_ejemplar")
//	private Ejemplar codigoEjemplar;
//	
	
	// Constructores
	
	public Voto() {
		
	}

	/**
	 * @param id
	 * @param opinion
	 * @param calificacion
	 * @param prestamo
	 * @param codigoEjemplar
	 */


	// Getters y Setters
	
	public int getId() {
		return id;
	}

	public Voto(int id, String opinion, int calificacion, List<Prestamo> prestamo,List<SedeEmpresa> sedeEmpresa
			) {
		
		this.id = id;
		this.opinion = opinion;
		this.calificacion = calificacion;
		this.prestamo = prestamo;
//		this.codigoEjemplar = codigoEjemplar;
		this.sedeEmpresa =sedeEmpresa;
		
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
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prestamo")
	public List<Prestamo>  getPrestamo() {
		return prestamo;
	}

	/**
	 * @param prestamo the prestamo to set
	 */
	public void setPrestamo(List<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	/**
	 * @return the codigoEjemplar
	 */
//	public Ejemplar getCodigoEjemplar() {
//		return codigoEjemplar;
//	}
//
//	/**
//	 * @param codigoEjemplar the codigoEjemplar to set
//	 */
//	public void setCodigoEjemplar(Ejemplar codigoEjemplar) {
//		this.codigoEjemplar = codigoEjemplar;
//	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cod_sede")
public List<SedeEmpresa> getSedeEmpresa() {
		return sedeEmpresa;
	}

	public void setSedeEmpresa(List<SedeEmpresa> sedeEmpresa) {
		this.sedeEmpresa = sedeEmpresa;
	}

	

	// Método ToString
	@Override
	public String toString() {
		return "Voto [id=" + id + ", opinion=" + opinion + ", calificacion=" + calificacion +"]";
	}

	

	

	

}