package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.loja.to.ProdutoTO;

import br.com.fiap.config.PropertySingleton;

public class TerminalConsulta {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Recuperar a data do sistema e formata
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		// Formata 
		DecimalFormat df = new DecimalFormat("R$ #,###.00");
		int opcao;
		EstoqueBO bo = new EstoqueBO();
		String nome = PropertySingleton.getInstance().getProperty("organizacao");
		
		do{
			Calendar calendar = Calendar.getInstance();
			String navBar = "\n" + nome + "          " + sdf.format(calendar.getTime());		
			
			System.out.println(navBar);			
			List<String> addAsterisco = new ArrayList<>();			
			for (int i = 0; i < navBar.length(); i++) {
				addAsterisco.add("*");
			}
			
			for (int i = 0; i < addAsterisco.size(); i++) {				
				System.out.print(addAsterisco.get(i));
			}
			
			System.out.println("\n\n1 - Pesquisar");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.print("Código do produto: ");
				int codigo = sc.nextInt();
				ProdutoTO prod = bo.consultarProduto(codigo);
				if (prod == null) {
					System.out.println("\nProduto não cadastrado");
				} else {
					System.out.println("\nProduto: " + prod.getNome());
					System.out.println("Descrição: " + prod.getDescricao());
					System.out.println("Preço: " + df.format(prod.getPreco()));
				}
			}
		}while(opcao != 0);
		sc.close();
	}
	
}