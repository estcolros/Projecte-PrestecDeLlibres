package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IVotoDAO;
import es.http.service.dto.Voto;

//Implementamos los métodos del service.
@Service
public class VotoServiceImpl implements IVotoService {
	@Autowired
	IVotoDAO IVotoDAO;

	@Override
	public List<Voto> listarVoto() {
		
		return IVotoDAO.findAll();
	}

	@Override
	public Voto guardarVoto(Voto Voto) {
		
		return IVotoDAO.save(Voto);
	}

	@Override
	public Voto VotoXID(int id) {
		
		return IVotoDAO.findById(id).get();
	}

	@Override
	public Voto actualizarVoto(Voto Voto) {
		
		return IVotoDAO.save(Voto);
	}

	@Override
	public void eliminarVoto(int id) {
		
		IVotoDAO.deleteById(id);
	}

}