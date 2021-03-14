package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import es.http.service.dao.IAutorDAO;
import es.http.service.dto.Autor;

//Implementamos los métodos del service.
public class AutorServiceImpl implements IAutorService {

	@Autowired
	IAutorDAO IAutorDAO;
	@Override
	public List<Autor> listarAutor() {
		return IAutorDAO.findAll();
	}

	@Override
	public Autor guardarAutor(Autor Autor) {
		return IAutorDAO.save(Autor);
	}

	@Override
	public Autor AutorXID(int id) {
		return IAutorDAO.findById(id).get();
	}

	@Override
	public Autor actualizarAutor(Autor Autor) {
		return IAutorDAO.save(Autor);
	}

	@Override
	public void eliminarAutor(int id) {
		IAutorDAO.deleteById(id);
	}
	


}
