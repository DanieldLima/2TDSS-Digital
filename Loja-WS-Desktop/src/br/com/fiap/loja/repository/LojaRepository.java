package br.com.fiap.loja.repository;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.fiap.loja.EstoqueBOStub;
import com.fiap.loja.EstoqueBOStub.ConsultarProduto;
import com.fiap.loja.EstoqueBOStub.ConsultarProdutoResponse;
import com.fiap.loja.EstoqueBOStub.ProdutoTO;

public class LojaRepository {

	private EstoqueBOStub stub;

	public LojaRepository() throws AxisFault {
		this.stub = new EstoqueBOStub();
	}
	
	public ProdutoTO buscarProduto(int codigo) throws RemoteException {
		
		ConsultarProduto consulta = new ConsultarProduto();	
		consulta.setCodigo(codigo);	
		ConsultarProdutoResponse resp = stub.consultarProduto(consulta);
		
		ProdutoTO to = resp.get_return();		
		return to;
		
	}

}
