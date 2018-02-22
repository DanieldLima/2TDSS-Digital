package br.com.fiap.teste;

import java.lang.reflect.Field;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Aluno;

public class AnnotatioTesteTabela {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		// API Reflection
		String classe = aluno.getClass().getName();
		System.out.println(classe);
		
		Tabela anotacaoAluno = aluno.getClass().getAnnotation(Tabela.class);
		System.out.println("Select * from " + anotacaoAluno.nome());
	}

}
