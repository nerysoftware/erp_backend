package br.com.erp.nerysoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.erp.nerysoftware.DTO.ClienteDTO;
import br.com.erp.nerysoftware.model.Cliente;
import br.com.erp.nerysoftware.model.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<ClienteDTO> listar() {
		List<Cliente> clientes = clienteRepository.findAll();
		return ClienteDTO.converter(clientes);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@Validated @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
