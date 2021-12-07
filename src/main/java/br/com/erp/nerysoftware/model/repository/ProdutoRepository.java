package br.com.erp.nerysoftware.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erp.nerysoftware.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
