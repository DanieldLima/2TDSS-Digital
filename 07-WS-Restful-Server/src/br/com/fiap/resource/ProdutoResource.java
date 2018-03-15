package br.com.fiap.resource;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.jpa.dao.ProdutoDAO;
import br.com.fiap.jpa.dao.impl.ProdutoDAOImpl;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;
import br.com.fiap.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {
	
	private ProdutoDAO dao;	

	public ProdutoResource() {
		//Inicializar o DAO no construtor
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new ProdutoDAOImpl(em);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> listar() {
		return new ProdutoTO(1, 
			"Garfo", "Garfo de prata", 50, true);
	}
	
	
}


