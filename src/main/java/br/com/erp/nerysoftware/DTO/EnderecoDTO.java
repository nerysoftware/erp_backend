package br.com.erp.nerysoftware.DTO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.erp.nerysoftware.model.Endereco;

public class EnderecoDTO {

	private Long id;
	private String logradouro;
	private String cidade;
	
	public EnderecoDTO(Endereco endereco) {
		this.id = endereco.getId();
		this.logradouro = endereco.getLogradouro();
		this.cidade = endereco.getCidade();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public static List<EnderecoDTO> converter(List<Endereco> enderecos) {

		return enderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList());
	}


}
