package main;

import java.math.BigDecimal;

import loja.http.JavaHttpClient;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		registroDeOrcamento.registrar(orcamento);
		
	}
}
