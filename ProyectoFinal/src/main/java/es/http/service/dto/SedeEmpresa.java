package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Nos centramos en la tabla SedeEmpresa
@Entity
@Table(name = "sedeempresa")
public class SedeEmpresa {

	// Atributos de SedeEmpresa
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="cod_sede")
	private int id;

	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@Column(name = "localidad") // no hace falta si se llama igual
	private String localidad;

	@OneToMany
	@JoinColumn(name = "cod_ejemplar")
	private List<Ejemplar> Ejemplar;

	// Constructores
	public SedeEmpresa() {
	}

	public SedeEmpresa(int id, String nombre, String localidad, List<Ejemplar> ejemplar) {
		this.id = id;
		this.nombre = nombre;
		this.localidad = localidad;
		Ejemplar = ejemplar;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ejemplar")
	public List<Ejemplar> getEjemplar() {
		return Ejemplar;
	}

	public void setEjemplar(List<Ejemplar> ejemplar) {
		Ejemplar = ejemplar;
	}

	// Método ToString
	@Override
	public String toString() {
		return "SedeEmpresa [id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + "]";
	}

}