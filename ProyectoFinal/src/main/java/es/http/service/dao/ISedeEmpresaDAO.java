package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.SedeEmpresa;

public interface ISedeEmpresaDAO extends JpaRepository<SedeEmpresa, Integer>{

}
