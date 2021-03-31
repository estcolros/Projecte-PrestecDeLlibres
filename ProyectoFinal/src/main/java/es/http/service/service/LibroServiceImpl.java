package es.http.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ILibroDAO;
import es.http.service.dto.Libro;

//Implementamos los métodos del service.
@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	ILibroDAO iLibroDAO;

	@Override
	public java.util.List<Libro> listarLibro() {

		return iLibroDAO.findAll();

	}

	@Override
	public Libro guardarLibro(Libro Libro) {

		return iLibroDAO.save(Libro);
	}

	@Override
	public Libro LibroXID(int id) {
		
		return iLibroDAO.findById(id).get();
	}

	@Override
	public Libro actualizarLibro(Libro Libro) {
	
		return iLibroDAO.save(Libro);
	}

	@Override
	public void eliminarLibro(int id) {
		
		iLibroDAO.deleteById(id);

	}

}
