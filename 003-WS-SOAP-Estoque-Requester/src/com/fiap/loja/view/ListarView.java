package com.fiap.loja.view;

import java.util.Arrays;
import java.util.List;

import com.fiap.loja.EstoqueBOStub;
import com.fiap.loja.EstoqueBOStub.Listar;
import com.fiap.loja.EstoqueBOStub.ProdutoTO;

public class ListarView {
	
	public static void main(String[] args) {
		
		try {
			EstoqueBOStub req = new EstoqueBOStub();
			
			Listar params = new Listar();
			EstoqueBOStub.ListarResponse res = req.listar(params);
			
			ProdutoTO[] produtos = res.get_return();
			List<ProdutoTO> lista = Arrays.asList(produtos);
			
			for (ProdutoTO produto : produtos) {
				System.out.println("Nome do produto: " + produto.getNome());
				System.out.println("Descrição do produto: " + produto.getDescricao());
				System.out.println("Preço do produto: " + produto.getPreco());
				System.out.println("\n***********************\n");
			}
			
			
		} catch (Exception e) {
			System.err.println("Erro!");
			e.printStackTrace();
		}
		
	}

}
