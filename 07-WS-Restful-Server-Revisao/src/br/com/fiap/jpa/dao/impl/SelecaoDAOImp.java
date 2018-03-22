package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Selecao;
import br.com.fiap.jpa.dao.GenericDAO;
import br.com.fiap.jpa.dao.SelecaoDAO;

public class SelecaoDAOImp extends GenericDAOImpl<Selecao, Integer> implements SelecaoDAO {

	public SelecaoDAOImp(EntityManager em) {
		super(em);

	}

}
