package br.com.fiap.produtos.mvc.service;

import java.util.List;

import br.com.fiap.produtos.mvc.dto.Produto;

public interface ProdutoService {
	List<Produto>listaProdutos();
	Produto salvarProduto(Produto produto);
	Produto editarProduto(Long id);
	void excluirProduto(Long id);
}
