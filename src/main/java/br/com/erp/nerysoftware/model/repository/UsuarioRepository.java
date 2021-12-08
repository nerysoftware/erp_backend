package br.com.erp.nerysoftware.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erp.nerysoftware.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
