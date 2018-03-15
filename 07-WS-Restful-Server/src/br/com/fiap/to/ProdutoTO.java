package br.com.fiap.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="T_PRODUTO")
@SequenceGenerator(name="produto", sequenceName="SQ_T_PRODUTO", allocationSize=1)
public class ProdutoTO {
	
	@Id
	@GeneratedValue(generator="produto", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_produto")
	private String nome;
	
	@Column(name="ds_produto")
	private String descricao;
	
	@Column(name="pc_preco")
	private double preco;
	
	@Column(name="fl_disponivel")
	private boolean disponivel;
	
	public ProdutoTO() {
		super();
	}

	public ProdutoTO(String nome, String descricao, double preco, boolean disponivel) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.disponivel = disponivel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
