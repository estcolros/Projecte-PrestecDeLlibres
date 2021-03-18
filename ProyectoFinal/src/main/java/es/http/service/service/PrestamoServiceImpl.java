package es.http.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.http.service.dao.IPrestamoDAO;
import es.http.service.dto.Prestamo;

//Implementamos los métodos del service.
@Service
public class PrestamoServiceImpl implements IPrestamoService {

	IPrestamoDAO iPrestamoDAO;

	@Override
	public List<Prestamo> listarPrestamo() {
		// TODO Auto-generated method stub
		return iPrestamoDAO.findAll();
	}

	@Override
	public Prestamo guardarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.save(prestamo);
	}

	@Override
	public Prestamo PrestamoXID(int id) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.findById(id).get();
	}

	@Override
	public Prestamo actualizarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return iPrestamoDAO.save(prestamo);
	}

	@Override
	public void eliminarPrestamo(int id) {
		// TODO Auto-generated method stub
		iPrestamoDAO.deleteById(id);
	}

}
