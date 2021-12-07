package br.com.erp.nerysoftware.DTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.erp.nerysoftware.model.Produto;

public class ProdutoDTO {

	private Long id;
	private BigDecimal eanProduto;
	private String nomeProduto;
	private String tipoProduto;
	private String marcaProduto;
	private BigDecimal valorVenda;
	private BigDecimal valorCompra;
	private BigDecimal estoqueInicial;
	private BigDecimal margemLucro;

	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.eanProduto = produto.getEanProduto();
		this.nomeProduto = produto.getNomeProduto();
		this.tipoProduto = produto.getTipoProduto();
		this.marcaProduto = produto.getMarcaProduto();
		this.valorVenda = produto.getValorVenda();
		this.valorCompra = produto.getValorCompra();
		this.estoqueInicial = produto.getEstoqueInicial();
		this.margemLucro = produto.getMargemLucro();
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getEanProduto() {
		return eanProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public BigDecimal getEstoqueInicial() {
		return estoqueInicial;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public static List<ProdutoDTO> converter(List<Produto> produtos) {

		return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}

}
