package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ITrabajadorDAO;
import es.http.service.dto.Trabajador;

//Implementamos los métodos del service.
@Service
public class TrabajadorServiceImpl implements ITrabajadorService {

	@Autowired
	ITrabajadorDAO ITrabajadorDAO;

	@Override
	public List<Trabajador> listarTrabajador() {
		// TODO Auto-generated method stub
		return ITrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador Trabajador) {
		// TODO Auto-generated method stub
		return ITrabajadorDAO.save(Trabajador);
	}

	@Override
	public Trabajador TrabajadorXID(int id) {
		// TODO Auto-generated method stub
		return ITrabajadorDAO.findById(id).get();
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador Trabajador) {
		// TODO Auto-generated method stub
		return ITrabajadorDAO.save(Trabajador);
	}

	@Override
	public void eliminarTrabajador(int id) {
		// TODO Auto-generated method stub
		ITrabajadorDAO.deleteById(id);
	}

}