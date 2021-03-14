package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Trabajador;

public interface ITrabajadorDAO  extends JpaRepository<Trabajador, Integer>{

}
