package br.com.erp.nerysoftware.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erp.nerysoftware.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
