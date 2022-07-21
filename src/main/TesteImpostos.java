package main;

import java.math.BigDecimal;

import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import loja.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}

}
