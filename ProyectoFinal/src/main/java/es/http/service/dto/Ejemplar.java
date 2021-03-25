package es.http.service.dto;

import java.util.List;
import java.util.Set;

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

//Nos centramos en la tabla Ejemplar
@Entity
@Table(name = "ejemplar")

public class Ejemplar {

	// Atributos de Ejemplar
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	@Column(name = "cod_ejemplar")
	private int id;
	@Column(name = "estado")
	private int estado;
	
	
	@ManyToOne(targetEntity=es.http.service.dto.Libro.class)
	@JoinColumn(name = "cod_libro")
	private Libro cod_libro;
//	@OneToMany
//	@JoinColumn(name = "cod_prestamo") 
//	private List<Prestamo> cod_prestamo;
	@ManyToOne(targetEntity=es.http.service.dto.SedeEmpresa.class)
	@JoinColumn(name = "cod_sede")
	private SedeEmpresa cod_sede;
	
	@ManyToOne(targetEntity=es.http.service.dto.Trabajador.class)
	@JoinColumn(name="trabajador_presta")
	private Trabajador trabajador_presta;
	
	
//	
//	@OneToMany
//	@JoinColumn(name="cod_voto")
//	private Set<Voto> voto;
	
	

	public Ejemplar() {
	}


	public Ejemplar(int id, int estado, Libro cod_libro, SedeEmpresa cod_sede, Trabajador trabajador_presta) {
		super();
		this.id = id;
		this.estado = estado;
		this.cod_libro = cod_libro;
//		this.cod_prestamo = cod_prestamo;
		this.cod_sede = cod_sede;
//		this.voto=voto;
		this.trabajador_presta= trabajador_presta;
	
	}





	// Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Libro getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(Libro cod_libro) {
		this.cod_libro = cod_libro;
	}

//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Prestamo")
//	public List<Prestamo> getCod_prestamo() {
//		return cod_prestamo;
//	}
//
//	public void setCod_prestamo(List<Prestamo> cod_prestamo) {
//		this.cod_prestamo = cod_prestamo;
//	}

	public SedeEmpresa getCod_sede() {
		return cod_sede;
	}

	public void setCod_sede(SedeEmpresa cod_sede) {
		this.cod_sede = cod_sede;
	}

	
	





public Trabajador getTrabajador_presta() {
		return trabajador_presta;
	}


	public void setTrabajador_presta(Trabajador trabajador_presta) {
		this.trabajador_presta = trabajador_presta;
	}


////	//	@JsonIgnore
//	@OneToMany
//	public Set<Voto> getVoto() {
//		return voto;
//	}
//
//
//	public void setVoto(Set<Voto> voto) {
//		this.voto = voto;
//	}


	// Método ToString
	@Override
	public String toString() {
		return "Ejemplar [id=" + id + ", estado=" + estado  +  "]";
	}

}