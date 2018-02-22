package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;

public class Pessoa {
	
	@Coluna(nome = "nm_pessoa")
	private String nome;
	
	@Coluna(nome = "nr_idade")
	private int idade;

	public Pessoa() {
		super();
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
