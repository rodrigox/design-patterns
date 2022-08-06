package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

private List<AcaoAposGerarPedido> acoes;	
	
	public void execute (GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		acoes.forEach(a ->a.executarAcao(pedido));
		
	}

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}

	
	
}