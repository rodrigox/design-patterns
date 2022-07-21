package main;

import java.math.BigDecimal;

import deconto.CalculadoraDeDescontos;
import loja.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento1 = new Orcamento(new BigDecimal("200"),6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento1));
		System.out.println(calculadora.calcular(orcamento2));

	}

}
