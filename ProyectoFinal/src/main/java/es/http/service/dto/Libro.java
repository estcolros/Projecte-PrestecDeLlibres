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

// Nos centramos en la tabla "Libro"
@Entity
@Table(name = "Libro")

public class Libro {

	// Atributos de Libro
	@Id
	@Column(name = "cod_libro")
	private int id;
	@Column(name = "genero")
	private String genero;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "isbn")
	private int isbn;

	@OneToMany
	@JoinColumn(name = "cod_ejemplar")
	private List<Ejemplar> ejemplar;

	/**
	 * 
	 */
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param genero
	 * @param titulo
	 * @param fecha
	 * @param isbn
	 * @param ejemplar
	 */
	public Libro(int id, String genero, String titulo, String fecha, int isbn, List<Ejemplar> ejemplar) {
		super();
		this.id = id;
		this.genero = genero;
		this.titulo = titulo;
		this.fecha = fecha;
		this.isbn = isbn;
		this.ejemplar = ejemplar;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/**
	 * @param ejemplar the ejemplar to set
	 */
	public void setEjemplar(List<Ejemplar> ejemplar) {
		this.ejemplar = ejemplar;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @return the ejemplar
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ejemplar")
	public List<Ejemplar> getEjemplar() {
		return ejemplar;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", genero=" + genero + ", titulo=" + titulo + ", fecha=" + fecha + ", isbn=" + isbn
				+ ", ejemplar=" + ejemplar + "]";
	}

}
