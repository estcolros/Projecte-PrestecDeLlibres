package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.INotificacionDAO;
import es.http.service.dto.Notificacion;

//Implementamos los métodos del service.
@Service
public class NotificacionServiceImpl implements INotificacionService {
	
	@Autowired
	INotificacionDAO iNotificacionDAO;

	@Override
	public List<Notificacion> listarNotificacion() {
		
		return iNotificacionDAO.findAll();
	}

	@Override
	public Notificacion guardarNotificacion(Notificacion notificacion) {
		// TODO Auto-generated method stub
		return iNotificacionDAO.save(notificacion);

	}

	@Override
	public Notificacion NotificacionXID(int id) {
		// TODO Auto-generated method stub
		return iNotificacionDAO.findById(id).get();
	}

	@Override
	public Notificacion actualizarNotificacion(Notificacion notificacion) {
		// TODO Auto-generated method stub
		return iNotificacionDAO.save(notificacion);
	}

	@Override
	public void eliminarNotificacion(int id) {
		// TODO Auto-generated method stub
		iNotificacionDAO.deleteById(id);
	}

}
