package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Voto;

public interface IVotoDAO extends JpaRepository<Voto, Integer> {

}