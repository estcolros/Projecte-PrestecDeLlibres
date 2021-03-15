package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.http.service.dao.IVotoDAO;
import es.http.service.dto.Voto;

//Implementamos los métodos del service.
public class VotoServiceImpl implements IVotoService {
	@Autowired
	IVotoDAO IVotoDAO;

	@Override
	public List<Voto> listarVoto() {
		// TODO Auto-generated method stub
		return IVotoDAO.findAll();
	}

	@Override
	public Voto guardarVoto(Voto Voto) {
		// TODO Auto-generated method stub
		return IVotoDAO.save(Voto);
	}

	@Override
	public Voto VotoXID(int id) {
		// TODO Auto-generated method stub
		return IVotoDAO.findById(id).get();
	}

	@Override
	public Voto actualizarVoto(Voto Voto) {
		// TODO Auto-generated method stub
		return IVotoDAO.save(Voto);
	}

	@Override
	public void eliminarVoto(int id) {
		// TODO Auto-generated method stub
		IVotoDAO.deleteById(id);
	}

}