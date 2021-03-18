package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dto.Ejemplar;
import es.http.service.dao.IEjemplarDAO;

//Implementamos los métodos del service.
@Service
public class EjemplarServiceImpl implements IEjemplarService {
	@Autowired
	IEjemplarDAO IEjemplarDAO;

	@Override
	public List<Ejemplar> listarEjemplar() {
		return IEjemplarDAO.findAll();
	}

	@Override
	public Ejemplar guardarEjemplar(Ejemplar Ejemplar) {
		return IEjemplarDAO.save(Ejemplar);
	}

	@Override
	public Ejemplar EjemplarXID(int id) {
		return IEjemplarDAO.findById(id).get();
	}

	@Override
	public Ejemplar actualizarEjemplar(Ejemplar Ejemplar) {
		return IEjemplarDAO.save(Ejemplar);
	}

	@Override
	public void eliminarEjemplar(int id) {
		IEjemplarDAO.deleteById(id);
	}

}