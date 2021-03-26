package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Idioma;

public interface IIdiomaDAO extends JpaRepository<Idioma, Integer> {

}