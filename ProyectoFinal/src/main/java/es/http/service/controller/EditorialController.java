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

import es.http.service.dto.Editorial;
import es.http.service.service.EditorialServiceImpl;

@RestController
@RequestMapping("/api")
public class EditorialController {
	
	@Autowired
	EditorialServiceImpl EditorialServiceImpl;
	
	@GetMapping("/Editoriales")
	public List<Editorial> listarEditorial(){
		return EditorialServiceImpl.listarEditorial();
	}
	
	
	@PostMapping("/Editoriales")
	public Editorial salvarEditorial(@RequestBody Editorial Editorial) {
		
		return EditorialServiceImpl.guardarEditorial(Editorial);
	}
	
	
	@GetMapping("/Editoriales/{id}")
	public Editorial EditorialXID(@PathVariable(name="id") int id) {
		
		Editorial Editorial_xid= new Editorial();
		
		Editorial_xid=EditorialServiceImpl.EditorialXID(id);
		
		System.out.println("Editorial XID: "+Editorial_xid);
		
		return Editorial_xid;
	}
	
	@PutMapping("/Editorial/{id}")
	public Editorial actualizarEditorial(@PathVariable(name="id")int id,@RequestBody Editorial Editorial) {
		
		Editorial Editorial_seleccionado= new Editorial();
		Editorial Editorial_actualizado= new Editorial();
		
		Editorial_seleccionado= EditorialServiceImpl.EditorialXID(id);
		Editorial_seleccionado.setNombre(Editorial.getNombre());
		Editorial_seleccionado.setLibro(Editorial.getLibro());
		Editorial_actualizado =	EditorialServiceImpl.actualizarEditorial(Editorial_seleccionado);
		
		System.out.println("El Editorial actualizado es: "+ Editorial_actualizado);
		
		return Editorial_actualizado;
	}
	
	@DeleteMapping("/Editorials/{id}")
	public void eleiminarEditorial(@PathVariable(name="id")int id) {
		EditorialServiceImpl.eliminarEditorial(id);
	}
}