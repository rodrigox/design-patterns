package loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.Finalizado;
import loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;;

	public Orcamento() {
		super();
		this.itens = new ArrayList<>();
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
	}

	public void aplicarDesontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return itens.size();
	}

	public void setSituacao(SituacaoOrcamento situacaoOrcamento) {
		this.situacao = situacaoOrcamento;
	}

	public SituacaoOrcamento getSituacao(SituacaoOrcamento situacao) {
		return situacao;
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}

	
}
