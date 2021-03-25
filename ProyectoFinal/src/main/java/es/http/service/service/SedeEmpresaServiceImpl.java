package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISedeEmpresaDAO;
import es.http.service.dto.SedeEmpresa;

//Implementamos los métodos del service.
@Service
public class SedeEmpresaServiceImpl implements ISedeEmpresaService {

	@Autowired
	ISedeEmpresaDAO ISedeEmpresaDAO;

	@Override
	public List<SedeEmpresa> listarSedeEmpresa() {
		
		return ISedeEmpresaDAO.findAll();
	}

	@Override
	public SedeEmpresa guardarSedeEmpresa(SedeEmpresa SedeEmpresa) {
		
		return ISedeEmpresaDAO.save(SedeEmpresa);
	}

	@Override
	public SedeEmpresa SedeEmpresaXID(int id) {
		
		return ISedeEmpresaDAO.findById(id).get();
	}

	@Override
	public SedeEmpresa actualizarSedeEmpresa(SedeEmpresa SedeEmpresa) {

		return ISedeEmpresaDAO.save(SedeEmpresa);
	}

	@Override
	public void eliminarSedeEmpresa(int id) {
	
		ISedeEmpresaDAO.deleteById(id);

	}

}
