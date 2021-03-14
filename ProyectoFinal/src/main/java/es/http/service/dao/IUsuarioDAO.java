package es.http.service.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
