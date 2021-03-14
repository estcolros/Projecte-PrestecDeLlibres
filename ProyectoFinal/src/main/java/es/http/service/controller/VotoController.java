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

import es.http.service.dto.Voto;
import es.http.service.service.VotoServiceImpl;

@RestController
@RequestMapping("/api")
public class VotoController {

	@Autowired
	VotoServiceImpl VotoServiceImpl;
	
	@GetMapping("/voto")
	public List<Voto> listarVoto(){
		return VotoServiceImpl.listarVoto();
	}
	
	
	@PostMapping("/votos")
	public Voto salvarVoto(@RequestBody Voto voto) {
		
		return VotoServiceImpl.guardarVoto(voto);
	}
	
	
	@GetMapping("/votos/{id}")
	public Voto VotoXID(@PathVariable(name="id") int id) {
		
		Voto Voto_xid= new Voto();
		
		Voto_xid=VotoServiceImpl.VotoXID(id);
		
		System.out.println("Voto XID: "+Voto_xid);
		
		return Voto_xid;
	}
	
	@PutMapping("/voto/{id}")
	public Voto actualizarVoto(@PathVariable(name="id")int id,@RequestBody Voto voto) {
		
		Voto Voto_seleccionado= new Voto();
		Voto Voto_actualizado= new Voto();
		
		Voto_seleccionado= VotoServiceImpl.VotoXID(id);
		
		Voto_seleccionado.setNombre(voto.getNombre());
		Voto_actualizado = VotoServiceImpl.actualizarVoto(Voto_seleccionado);
		
		System.out.println("El Voto actualizado es: "+ Voto_actualizado);
		
		return Voto_actualizado;
	}
	
	@DeleteMapping("/voto/{id}")
	public void eleiminarVoto(@PathVariable(name="id")int id) {
		VotoServiceImpl.eliminarVoto(id);
	}
	




	
}
