package imposto;

import java.math.BigDecimal;

import loja.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular (Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
