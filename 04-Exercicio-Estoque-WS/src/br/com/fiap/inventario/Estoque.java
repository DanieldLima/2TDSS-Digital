package br.com.fiap.inventario;

import org.apache.axis2.AxisFault;

import com.fiap.loja.EstoqueBO;
import com.fiap.loja.to.ProdutoTO;

public class Estoque {
	
	
	public ProdutoTO buscarProduto(int codProduto) {

		EstoqueBO estoqBO = new EstoqueBO();
		ProdutoTO prod2 = new ProdutoTO();
		try {
			prod2 = estoqBO.consultarProduto(codProduto);
			if (prod2 == null) {
				throw new AxisFault("Produto não encontrado");
			}
			
		} catch (AxisFault e) {
			e.printStackTrace();
		}		
		return prod2;
	}

}
