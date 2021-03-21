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

import es.http.service.dto.Autor;
import es.http.service.service.AutorServiceImpl;

@RestController
@RequestMapping("/api")
public class AutorController {

	@Autowired
	AutorServiceImpl AutorServiceImpl;

	@GetMapping("/autores")
	public List<Autor> listarAutor() {
		return AutorServiceImpl.listarAutor();
	}

	@PostMapping("/autores")

	public Autor salvarAutor(@RequestBody Autor Autor) {

		return AutorServiceImpl.guardarAutor(Autor);
	}

	@GetMapping("/autor/{id}")
	public Autor AutorXID(@PathVariable(name = "id") int id) {

		Autor Autor_xid = new Autor();

		Autor_xid = AutorServiceImpl.AutorXID(id);

		System.out.println("Autor XID: " + Autor_xid);

		return Autor_xid;
	}

	@PutMapping("/autor/{id}")
	public Autor actualizarAutor(@PathVariable(name = "id") int id, @RequestBody Autor Autor) {

		Autor Autor_seleccionado = new Autor();
		Autor Autor_actualizado = new Autor();
		Autor_seleccionado = AutorServiceImpl.AutorXID(id);
		Autor_seleccionado.setNombre(Autor.getNombre());
		Autor_seleccionado.setApellido(Autor.getApellido());
		Autor_seleccionado.setLibro(Autor.getLibro());
		Autor_actualizado = AutorServiceImpl.actualizarAutor(Autor_seleccionado);

		System.out.println("El Autor actualizado es: " + Autor_actualizado);

		return Autor_actualizado;
	}

	@DeleteMapping("/autor/{id}")
	public void eleiminarAutor(@PathVariable(name = "id") int id) {
		AutorServiceImpl.eliminarAutor(id);
	}
}
