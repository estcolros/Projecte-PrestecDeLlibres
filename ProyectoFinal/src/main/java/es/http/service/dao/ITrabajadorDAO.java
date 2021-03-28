package es.http.service.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import es.http.service.dto.Trabajador;
import javassist.tools.reflect.Sample;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Integer>, CrudRepository<Trabajador, Integer> {

	Trabajador findByUsername(String username);

}