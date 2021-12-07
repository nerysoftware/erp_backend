package br.com.erp.nerysoftware.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "prodean")
	private BigDecimal eanProduto;
	
	@NotNull
	@Column(name = "prodnome")
	private String nomeProduto;
	
	@NotNull
	@Column(name = "prodtipo")
	private String tipoProduto;
	
	@NotNull
	@Column(name = "prodmarca")
	private String marcaProduto;
	
	@NotNull
	@Column(name = "vendvalor")
	private BigDecimal valorVenda;
	
	@NotNull
	@Column(name = "compvalor")
	private BigDecimal valorCompra;
	
	@NotNull
	@Column(name = "inicestoque")
	private BigDecimal estoqueInicial;
	
	@NotNull
	@Column(name = "lucrmargem")
	private BigDecimal margemLucro;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public BigDecimal getEanProduto() {
		return eanProduto;
	}

	public void setEanProduto(BigDecimal eanProduto) {
		this.eanProduto = eanProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public BigDecimal getEstoqueInicial() {
		return estoqueInicial;
	}

	public void setEstoqueInicial(BigDecimal estoqueInicial) {
		this.estoqueInicial = estoqueInicial;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	


}
