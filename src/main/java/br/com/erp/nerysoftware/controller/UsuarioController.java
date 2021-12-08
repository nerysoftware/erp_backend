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

import br.com.erp.nerysoftware.DTO.UsuarioDTO;
import br.com.erp.nerysoftware.model.Usuario;
import br.com.erp.nerysoftware.model.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public List<UsuarioDTO> listar() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return UsuarioDTO.converter(usuarios);

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionar(@Validated @RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);

	}

}
