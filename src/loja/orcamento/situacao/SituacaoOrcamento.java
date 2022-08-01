package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.DomainException;
import loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar (Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser aprovado!");
	}
	
	public void reprovar (Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser reprovado!");
	}
	
	public void finalizar (Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser finalizado!");
	}
}
