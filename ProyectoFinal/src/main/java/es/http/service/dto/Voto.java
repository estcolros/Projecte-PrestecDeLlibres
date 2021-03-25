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
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	@Column (name="cod_voto")
	private int id;

	@Column(name = "opinion") 
	private String opinion;
	@Column(name = "calificacion") 
	private int calificacion;


	@ManyToOne
	@JoinColumn(name = "cod_ejemplar")
	private Ejemplar codigoEjemplar;

	
	// Constructores
	

	
	public Voto() {
		
	}

	public Voto(int id, String opinion, int calificacion, Ejemplar codigoEjemplar) {
		this.id = id;
			this.opinion = opinion;
			this.calificacion = calificacion;
		
		}


	// Getters y Setters
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getOpinion() {
		return opinion;
	}


	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	Ejemplar getCodigoEjemplar() {
		return codigoEjemplar;
	}

	
	public void setCodigoEjemplar(Ejemplar codigoEjemplar) {
		this.codigoEjemplar = codigoEjemplar;
	}


	// Método ToString
	@Override
	public String toString() {
		return "Voto [id=" + id + ", opinion=" + opinion + ", calificacion=" + calificacion +"]";
	}

	

	

	

}