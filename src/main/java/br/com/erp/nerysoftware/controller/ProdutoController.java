package br.com.erp.nerysoftware.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.erp.nerysoftware.DTO.ProdutoDTO;
import br.com.erp.nerysoftware.form.AtualizacaoProdutoForm;
import br.com.erp.nerysoftware.model.Produto;
import br.com.erp.nerysoftware.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public List<ProdutoDTO> listar() {
		System.out.println("GET CHAMADO");
		List<Produto> produtos = produtoRepository.findAll();
		System.out.println("GET Execultado" + produtos);
		return ProdutoDTO.converter(produtos);
	

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adicionar(@Validated @RequestBody Produto produto) {
		return produtoRepository.save(produto);

	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ProdutoDTO> atualiza(@PathVariable("id") Long id, @RequestBody AtualizacaoProdutoForm form) {
		Optional<Produto> optional = produtoRepository.findById(id);
		if (optional.isPresent()) {
			Produto produto = form.atualizar(id, produtoRepository);
			return ResponseEntity.ok(new ProdutoDTO(produto));
		}

		return ResponseEntity.notFound().build();

	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable("id") Long id) {
		Optional<Produto> optional = produtoRepository.findById(id);
		if (optional.isPresent()) {
			produtoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();

	}

}
