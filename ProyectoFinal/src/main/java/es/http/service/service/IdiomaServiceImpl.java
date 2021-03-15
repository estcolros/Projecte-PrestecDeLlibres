package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.http.service.dto.Idioma;
import es.http.service.dao.IIdiomaDAO;

//Implementamos los métodos del service.
public class IdiomaServiceImpl implements IIdiomaService {
	@Autowired
	IIdiomaDAO IIdiomaDAO;

	@Override
	public List<Idioma> listarIdioma() {
		return IIdiomaDAO.findAll();
	}

	@Override
	public Idioma guardarIdioma(Idioma Idioma) {
		return IIdiomaDAO.save(Idioma);
	}

	@Override
	public Idioma IdiomaXID(int id) {
		return IIdiomaDAO.findById(id).get();
	}

	@Override
	public Idioma actualizarIdioma(Idioma Idioma) {
		return IIdiomaDAO.save(Idioma);
	}

	@Override
	public void eliminarIdioma(int id) {
		IIdiomaDAO.deleteById(id);

	}

}