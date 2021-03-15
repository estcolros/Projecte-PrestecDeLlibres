package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.http.service.dao.ISedeEmpresaDAO;
import es.http.service.dto.SedeEmpresa;

//Implementamos los métodos del service.
public class SedeEmpresaServiceImpl implements ISedeEmpresaService {

	@Autowired
	ISedeEmpresaDAO ISedeEmpresaDAO;

	@Override
	public List<SedeEmpresa> listarSedeEmpresa() {
		// TODO Auto-generated method stub
		return ISedeEmpresaDAO.findAll();
	}

	@Override
	public SedeEmpresa guardarSedeEmpresa(SedeEmpresa SedeEmpresa) {
		// TODO Auto-generated method stub
		return ISedeEmpresaDAO.save(SedeEmpresa);
	}

	@Override
	public SedeEmpresa SedeEmpresaXID(int id) {
		// TODO Auto-generated method stub
		return ISedeEmpresaDAO.findById(id).get();
	}

	@Override
	public SedeEmpresa actualizarSedeEmpresa(SedeEmpresa SedeEmpresa) {
		// TODO Auto-generated method stub
		return ISedeEmpresaDAO.save(SedeEmpresa);
	}

	@Override
	public void eliminarSedeEmpresa(int id) {
		// TODO Auto-generated method stub
		ISedeEmpresaDAO.deleteById(id);

	}

}
