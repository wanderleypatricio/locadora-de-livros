package com.br.java.locadora.locadoraLivrosApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.java.locadora.locadoraLivrosApi.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("select u from Usuario u where u.login = ?1")
	Usuario findUserByLogin(String login);
}
