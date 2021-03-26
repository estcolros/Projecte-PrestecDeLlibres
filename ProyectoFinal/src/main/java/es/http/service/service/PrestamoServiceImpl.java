package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IPrestamoDAO;
import es.http.service.dto.Prestamo;

//Implementamos los métodos del service.
@Service
public class PrestamoServiceImpl implements IPrestamoService {

	@Autowired
	IPrestamoDAO iPrestamoDAO;

	@Override
	public List<Prestamo> listarPrestamo() {
		
		return iPrestamoDAO.findAll();
	}

	@Override
	public Prestamo guardarPrestamo(Prestamo prestamo) {
		
		return iPrestamoDAO.save(prestamo);
	}

	@Override
	public Prestamo PrestamoXID(int id) {
		
		return iPrestamoDAO.findById(id).get();
	}

	@Override
	public Prestamo actualizarPrestamo(Prestamo prestamo) {
	
		return iPrestamoDAO.save(prestamo);
	}

	@Override
	public void eliminarPrestamo(int id) {
	
		iPrestamoDAO.deleteById(id);
	}

}
