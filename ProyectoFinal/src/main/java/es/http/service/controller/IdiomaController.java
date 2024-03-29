package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Idioma;
import es.http.service.service.IdiomaServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api")
public class IdiomaController {

	@Autowired
	IdiomaServiceImpl IdiomaServiceImpl;

	@GetMapping("/idiomas")
	public List<Idioma> listarIdioma() {
		return IdiomaServiceImpl.listarIdioma();
	}

	@PostMapping("/idiomas")
	public Idioma salvarIdioma(@RequestBody Idioma Idioma) {

		return IdiomaServiceImpl.guardarIdioma(Idioma);
	}

	@GetMapping("/idioma/{id}")
	public Idioma IdiomaXID(@PathVariable(name = "id") int id) {

		Idioma Idioma_xid = new Idioma();

		Idioma_xid = IdiomaServiceImpl.IdiomaXID(id);

		return Idioma_xid;
	}

	@PutMapping("/idioma/{id}")
	public Idioma actualizarIdioma(@PathVariable(name = "id") int id, @RequestBody Idioma Idioma) {

		Idioma Idioma_seleccionado = new Idioma();
		Idioma Idioma_actualizado = new Idioma();

		Idioma_seleccionado = IdiomaServiceImpl.IdiomaXID(id);
		Idioma_seleccionado.setNombre(Idioma.getNombre());
	
		Idioma_actualizado = IdiomaServiceImpl.actualizarIdioma(Idioma_seleccionado);

		return Idioma_actualizado;
	}

	@DeleteMapping("/idioma/{id}")
	public void eleiminarIdioma(@PathVariable(name = "id") int id) {
		IdiomaServiceImpl.eliminarIdioma(id);
	}
}