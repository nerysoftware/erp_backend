package br.com.erp.nerysoftware.config.validacao;

public class ErroDeFormularioDTO {

	//Essa classe representa o erro de validação.
	private String campo;
	private String erro;

	public ErroDeFormularioDTO(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}

}
