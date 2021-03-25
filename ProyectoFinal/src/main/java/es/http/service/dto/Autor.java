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
@Table(name = "Autor")

public class Autor {
	// Atributos de Autor
	@Id
	@Column(name = "cod_autor")
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;

	@OneToMany
	@JoinColumn(name = "cod_libro")
	private List<Libro> libro;

	// Constructor por defecto
	public Autor() {
	}

	// Constructor con todos los atributos
	public Autor(int id, String nombre, String apellido, List<Libro> libro) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.libro = libro;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Libro")
	public List<Libro> getLibro() {
		return libro;
	}

	public void setLibro(List<Libro> libro) {
		this.libro = libro;
	}

	// Método ToString
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libro=" + libro + "]";
	}

}