package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne(targetEntity=es.http.service.dto.Editorial.class)
	@JoinColumn(name = "cod_editorial")
	private Editorial editorial;
	
	@ManyToOne(targetEntity=es.http.service.dto.Autor.class)
	@JoinColumn(name="cod_autor")
	private Autor autor;
	
	@ManyToOne(targetEntity=es.http.service.dto.Idioma.class)
	@JoinColumn(name="cod_idioma")
	private Idioma idioma;

	
	// Constructores
	
	
	public Libro() {
	}


	public Libro(int id, String genero, String titulo, String fecha, int isbn, Editorial editorial,Autor autor, Idioma idioma) {
		this.id = id;
		this.genero = genero;
		this.titulo = titulo;
		this.fecha = fecha;
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
		this.idioma = idioma;
	}

	//Getters y Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public Editorial getEditorial() {
		return editorial;
	}


	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Idioma getIdioma() {
		return idioma;
	}


	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}


	//Método toString
	@Override
	public String toString() {
		return "Libro [id=" + id + ", genero=" + genero + ", titulo=" + titulo + ", fecha="
				+ fecha + ", isbn=" + isbn + ", editorial=" + editorial + ", idioma=" + idioma
				+ "]";
	}
	

	
	
	
}
