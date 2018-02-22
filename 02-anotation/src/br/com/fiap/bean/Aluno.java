package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

@Tabela(nome = "T_PESSOA")
public class Aluno {
	
	@Coluna(nome = "nm_aluno")
	private String nome;
	
	@Coluna(nome = "nm_turma")
	private String turma;
	
	@Coluna(nome = "nr_idade")
	private int idade;
	
	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
