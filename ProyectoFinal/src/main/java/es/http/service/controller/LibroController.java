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

import es.http.service.service.LibroServiceImpl;

import es.http.service.dto.Libro;

@RestController
@RequestMapping("/api")

public class LibroController {

	@Autowired
	LibroServiceImpl libroServiceImpl;

	@GetMapping("/libros")
	public List<Libro> listarLibro() {
		return libroServiceImpl.listarLibro();
	}

	@PostMapping("/libros")
	public Libro salvarLibro(@RequestBody Libro Libro) {

		return libroServiceImpl.guardarLibro(Libro);
	}

	@GetMapping("/libros/{id}")
	public Libro LibroXID(@PathVariable(name = "id") int id) {

		Libro Libro_xid = new Libro();

		Libro_xid = libroServiceImpl.LibroXID(id);

		// System.out.println("Equipo XID: "+Libro_xid);

		return Libro_xid;
	}

	@PutMapping("/libro/{id}")
	public Libro actualizarLibro(@PathVariable(name = "id") int id, @RequestBody Libro libro) {

		Libro Libro_seleccionado = new Libro();
		Libro Libro_actualizado = new Libro();

		Libro_seleccionado = libroServiceImpl.LibroXID(id);

		Libro_seleccionado.setTitulo(libro.getTitulo());
		Libro_seleccionado.setGenero(libro.getGenero());
		Libro_seleccionado.setFecha(libro.getFecha());
		Libro_seleccionado.setIsbn(libro.getIsbn());
		Libro_seleccionado.setEjemplar(libro.getEjemplar());

		Libro_actualizado = libroServiceImpl.actualizarLibro(Libro_seleccionado);

		// System.out.println("El Equipo actualizado es: "+ Equipo_actualizado);

		return Libro_actualizado;
	}

	@DeleteMapping("/libro/{id}")
	public void eleiminarLibro(@PathVariable(name = "id") int id) {
		libroServiceImpl.eliminarLibro(id);
	}
}
