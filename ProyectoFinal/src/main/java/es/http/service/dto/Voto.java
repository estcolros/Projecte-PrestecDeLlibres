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

import com.fasterxml.jackson.annotation.JsonIgnore;;

@Entity
@Table(name="Trabajador")
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "opinion")//no hace falta si se llama igual
	private String opinion;
	@Column(name = "calificacion")//no hace falta si se llama igual
	private int calificacion;
	//PREGUNTAR DEBILES A JOSE!!!!!
	
	
	@OneToMany
	@JoinColumn(name="id")
    private List<Prestamo> Prestamo;
	
	@ManyToOne
    @JoinColumn(name = "id")
    Ejemplar codigoEjemplar;


	



}
