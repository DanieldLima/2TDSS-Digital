package br.com.fiap.loja.repository;

import org.apache.axis2.AxisFault;

import com.fiap.loja.EstoqueBOStub;
import com.fiap.loja.EstoqueBOStub.ProdutoTO;

public class LojaRepository {

	private EstoqueBOStub stub;

	public LojaRepository() throws AxisFault {
		this.stub = new EstoqueBOStub();
	}
	
	public ProdutoTO buscarProduto(int codigo) {
		
		
		
	}

}
