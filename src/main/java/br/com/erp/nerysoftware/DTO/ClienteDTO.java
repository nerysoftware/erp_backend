package br.com.erp.nerysoftware.DTO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.erp.nerysoftware.model.Cliente;
import br.com.erp.nerysoftware.model.Endereco;

public class ClienteDTO {

	private Long id;
	private String nomeCliente;
	private Long cpfCliente;
	private Long cnpjCliente;
	private String tipoCliente;
	private String telefoneCliente;
	private Endereco enderecoCliente;

	private ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nomeCliente = cliente.getNomeCliente();
		this.cpfCliente = cliente.getCpfCliente();
		this.cnpjCliente = cliente.getCnpjCliente();
		this.tipoCliente = cliente.getTipoCliente();
		this.telefoneCliente = cliente.getTelefoneCliente();
		this.enderecoCliente = cliente.getEndereco();

	}

	public Long getId() {
		return id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public Long getCpfCliente() {
		return cpfCliente;
	}

	public Long getCnpjCliente() {
		return cnpjCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public Endereco getEnderecoCliente() {
		return enderecoCliente;
	}

	public static List<ClienteDTO> converter(List<Cliente> clientes) {

		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
