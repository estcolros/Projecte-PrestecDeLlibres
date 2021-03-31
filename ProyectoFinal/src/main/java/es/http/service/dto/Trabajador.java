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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Nos centramos en la tabla Trabajador
@Entity
@Table(name = "Trabajador")
public class Trabajador {

	// Atributos de Trabajador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	@Column(name="cod_trabajador")
	private int id;

	@Column(name = "nombre") 
	private String nombre;
	@Column(name = "apellido1") 
	private String apellido1;
	@Column(name = "apellido2") 
	private String apellido2;
	@Column(name = "telefono") 
	private String telefono;
	@Column(name = "correo") 
	private String correo;
	@Column(name = "DNI") 
	private String dni;
	@Column(name = "user") 
	private String username;
	@Column(name = "password") 
	private String password;
	
	

	

	// Constructores
	public Trabajador() {
	}

	public Trabajador(int id, String nombre, String apellido1, String apellido2, String telefono, String correo, String dni, String user, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.correo = correo;
		this.dni = dni;
		this.username = user;
		this.password = password;

		
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	// Método ToString
	
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", telefono=" + telefono + ", correo=" + correo + ", dni=" + dni + ", user=" + username + ", password="
				+ password + "]";
	}

	
	

}