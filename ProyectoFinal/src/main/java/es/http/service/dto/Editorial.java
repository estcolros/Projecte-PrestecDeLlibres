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

//Nos centramos en la tabla Editorial
@Entity
@Table(name = "Editorial")
public class Editorial {

	// Atributos de Editorial
	@Id
	@Column(name = "cod_editorial")
	private int id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "cod_libro")
	private List<Libro> libro;

	// Constructores
	public Editorial() {
	}

	public Editorial(int id, String nombre, List<Libro> libro) {
		super();
		this.id = id;
		this.nombre = nombre;
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
		return "Editorial [id=" + id + ", nombre=" + nombre + "]";
	}

}