package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Editorial;

public interface IEditorialDAO extends JpaRepository<Editorial, Integer>  {

}
