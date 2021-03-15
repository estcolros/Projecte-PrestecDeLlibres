package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Autor;

public interface IAutorDAO extends JpaRepository<Autor, Integer> {

}