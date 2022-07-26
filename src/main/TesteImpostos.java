package main;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento( new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
