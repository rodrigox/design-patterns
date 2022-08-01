package loja.pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	
	// construtor com depencdency inection: repository, service ....
	
	public void execute (GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email co dados do novo pedido");
		
	}

}