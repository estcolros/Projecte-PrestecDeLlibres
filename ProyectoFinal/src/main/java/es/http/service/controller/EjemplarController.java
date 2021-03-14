package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Ejemplar;
import es.http.service.service.EjemplarServiceImpl;

@RestController
@RequestMapping("/api")
public class EjemplarController {
	
	@Autowired
	EjemplarServiceImpl EjemplarServiceImpl;
	
	@GetMapping("/Ejemplares")
	public List<Ejemplar> listarEjemplar(){
		return EjemplarServiceImpl.listarEjemplar();
	}
	
	
	@PostMapping("/Ejemplares")
	public Ejemplar salvarEjemplar(@RequestBody Ejemplar Ejemplar) {
		
		return EjemplarServiceImpl.guardarEjemplar(Ejemplar);
	}
	
	
	@GetMapping("/Ejemplares/{id}")
	public Ejemplar EjemplarXID(@PathVariable(name="id") int id) {
		
		Ejemplar Ejemplar_xid= new Ejemplar();
		
		Ejemplar_xid=EjemplarServiceImpl.EjemplarXID(id);
		
		System.out.println("Ejemplar XID: "+Ejemplar_xid);
		
		return Ejemplar_xid;
	}
	
	@PutMapping("/Ejemplar/{id}")
	public Ejemplar actualizarEjemplar(@PathVariable(name="id")int id,@RequestBody Ejemplar Ejemplar) {
		
		Ejemplar Ejemplar_seleccionado= new Ejemplar();
		Ejemplar Ejemplar_actualizado= new Ejemplar();
		
		Ejemplar_seleccionado= EjemplarServiceImpl.EjemplarXID(id);
		Ejemplar_seleccionado.setEstado(Ejemplar.getEstado());
		Ejemplar_seleccionado.setCod_libro(Ejemplar.getCod_libro());
		Ejemplar_seleccionado.setCod_prestamo(Ejemplar.getCod_prestamo());
		Ejemplar_seleccionado.setCod_sede(Ejemplar.getCod_sede());
		Ejemplar_actualizado =	EjemplarServiceImpl.actualizarEjemplar(Ejemplar_seleccionado);
		
		System.out.println("El Ejemplar actualizado es: "+ Ejemplar_actualizado);
		
		return Ejemplar_actualizado;
	}
	
	@DeleteMapping("/Ejemplars/{id}")
	public void eleiminarEjemplar(@PathVariable(name="id")int id) {
		EjemplarServiceImpl.eliminarEjemplar(id);
	}
}
