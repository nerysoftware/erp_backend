package br.com.erp.nerysoftware.DTO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.erp.nerysoftware.model.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String senha;
	private String tipo;

	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.senha = usuario.getSenha();
		this.tipo = usuario.getTipo();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getTipo() {
		return tipo;
	}

	public static List<UsuarioDTO> converter(List<Usuario> usuarios) {

		return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
	}

}
