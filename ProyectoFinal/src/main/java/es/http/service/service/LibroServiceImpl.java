package es.http.service.service;

import org.springframework.beans.factory.annotation.Autowired;

import es.http.service.dao.ILibroDAO;
import es.http.service.dto.Libro;

public class LibroServiceImpl implements ILibroService {

	@Autowired
	ILibroDAO iLibroDAO;

	@Override
	public java.util.List<Libro> listarLibro() {
		// TODO Auto-generated method stub
		return iLibroDAO.findAll();

	}

	@Override
	public Libro guardarLibro(Libro Libro) {
		// TODO Auto-generated method stub
		return iLibroDAO.save(Libro);
	}

	@Override
	public Libro LibroXID(int id) {
		// TODO Auto-generated method stub
		return iLibroDAO.findById(id).get();
	}

	@Override
	public Libro actualizarLibro(Libro Libro) {
		// TODO Auto-generated method stub
		return iLibroDAO.save(Libro);
	}

	@Override
	public void eliminarLibro(int id) {
		// TODO Auto-generated method stub
		iLibroDAO.deleteById(id);

	}

}
