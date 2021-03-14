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
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

//Nos centramos en la tabla Idioma
@Entity
@Table (name="Idioma")
public class Idioma {
	
	//Atributos de Iidoma
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column (name="cod_idioma")
	private int cod_idioma;
	@Column (name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn (name="cod_libro")
	private List<Libro> cod_libro;

	//Constructores
	public Idioma() {
	}

	public Idioma(int cod_idioma, String nombre, List<Libro> cod_libro) {
		super();
		this.cod_idioma = cod_idioma;
		this.nombre = nombre;
		this.cod_libro = cod_libro;
	}

	//Getters y Setters
	public int getCod_idioma() {
		return cod_idioma;
	}

	
	public void setCod_idioma(int cod_idioma) {
		this.cod_idioma = cod_idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Libro")
	public List<Libro> getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(List<Libro> cod_libro) {
		this.cod_libro = cod_libro;
	}

	//Método ToString
	@Override
	public String toString() {
		return "Idioma [cod_idioma=" + cod_idioma + ", nombre=" + nombre + ", cod_libro=" + cod_libro + "]";
	}
	
	
	
	
	

	
}
