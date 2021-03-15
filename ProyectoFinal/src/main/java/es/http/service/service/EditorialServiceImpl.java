package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.http.service.dto.Editorial;
import es.http.service.dao.IEditorialDAO;

//Implementamos los métodos del service.
public class EditorialServiceImpl implements IEditorialService {
	@Autowired
	IEditorialDAO IEditorialDAO;

	@Override
	public List<Editorial> listarEditorial() {
		return IEditorialDAO.findAll();
	}

	@Override
	public Editorial guardarEditorial(Editorial Editorial) {
		return IEditorialDAO.save(Editorial);
	}

	@Override
	public Editorial EditorialXID(int id) {
		return IEditorialDAO.findById(id).get();
	}

	@Override
	public Editorial actualizarEditorial(Editorial Editorial) {
		return IEditorialDAO.save(Editorial);
	}

	@Override
	public void eliminarEditorial(int id) {
		IEditorialDAO.deleteById(id);
	}

}