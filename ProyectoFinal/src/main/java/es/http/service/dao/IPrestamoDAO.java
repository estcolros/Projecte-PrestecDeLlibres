package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Prestamo;

public interface IPrestamoDAO extends JpaRepository<Prestamo, Integer> {

}