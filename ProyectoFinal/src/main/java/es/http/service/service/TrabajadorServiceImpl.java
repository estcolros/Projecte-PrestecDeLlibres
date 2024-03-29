package es.http.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ITrabajadorDAO;
import es.http.service.dto.Trabajador;
import javassist.tools.reflect.Sample;

//Implementamos los métodos del service.
@Service
public class TrabajadorServiceImpl implements ITrabajadorService {

	@Autowired
	ITrabajadorDAO ITrabajadorDAO;

	@Override
	public List<Trabajador> listarTrabajador() {
	
		return ITrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador Trabajador) {
		
		return ITrabajadorDAO.save(Trabajador);
	}

	@Override
	public Trabajador TrabajadorXID(int id) {
	
		return ITrabajadorDAO.findById(id).get();
	}

	@Override
	public Trabajador TrabajadorXuser(String user) {
				
		return ITrabajadorDAO.findByUsername(user);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador Trabajador) {
		
		return ITrabajadorDAO.save(Trabajador);
	}

	@Override
	public void eliminarTrabajador(int id) {
	
		ITrabajadorDAO.deleteById(id);
	}

}