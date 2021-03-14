package es.http.service.service;

import java.util.List;

import es.http.service.dao.INotificacionDAO;
import es.http.service.dto.Notificacion;

public class NotificacionServiceImpl implements INotificacionService {

	INotificacionDAO iNotificacionDAO;
	@Override
	public List<Notificacion> listarNotificacion() {
		// TODO Auto-generated method stub
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
