package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Jogador;
import br.com.fiap.jpa.dao.JogadorDAO;

public class JogadorDAOImp extends GenericDAOImpl<Jogador, Integer> implements JogadorDAO {

	public JogadorDAOImp(EntityManager em) {
		super(em);
	}

}
