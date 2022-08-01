package loja.deconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeidaDeDescontos = 
				new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
				new SemDesconto()));
		
		return cadeidaDeDescontos.calcular(orcamento);
	}
}
