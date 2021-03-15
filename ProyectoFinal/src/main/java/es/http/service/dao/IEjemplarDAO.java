package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Ejemplar;

public interface IEjemplarDAO extends JpaRepository<Ejemplar, Integer> {

}