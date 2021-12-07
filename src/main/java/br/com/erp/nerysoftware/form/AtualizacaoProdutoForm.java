package br.com.erp.nerysoftware.form;

import java.math.BigDecimal;

import br.com.erp.nerysoftware.model.Produto;
import br.com.erp.nerysoftware.model.repository.ProdutoRepository;

public class AtualizacaoProdutoForm {
	
	
	private BigDecimal eanProduto;
	private String nomeProduto;
	private String tipoProduto;
	private String marcaProduto;
	private BigDecimal valorVenda;
	private BigDecimal valorCompra;
	private BigDecimal estoqueInicial;
	private BigDecimal margemLucro;
	
	
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
	
	
	public Produto atualizar(Long id, ProdutoRepository marcaRepository) {
		@SuppressWarnings("deprecation")
		Produto produto = marcaRepository.getOne(id);

		produto.setEanProduto(this.eanProduto);
		produto.setNomeProduto(this.nomeProduto);
		produto.setTipoProduto(this.tipoProduto);
		produto.setMarcaProduto(this.marcaProduto);
		produto.setValorVenda(this.valorVenda);
		produto.setValorCompra(this.valorCompra);
		produto.setEstoqueInicial(this.estoqueInicial);
		produto.setMargemLucro(this.margemLucro);
		
		return produto;

	}
	
	

}
