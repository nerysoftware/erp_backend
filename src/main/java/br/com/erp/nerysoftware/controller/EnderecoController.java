package br.com.erp.nerysoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.erp.nerysoftware.DTO.EnderecoDTO;
import br.com.erp.nerysoftware.model.Endereco;
import br.com.erp.nerysoftware.model.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<EnderecoDTO> listar(){
		List<Endereco> enderecos = enderecoRepository.findAll();
		return EnderecoDTO.converter(enderecos);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@Validated @RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}
