package observer.solucao.loja.pedido;

import observer.solucao.loja.orcamento.Orcamento;
import observer.solucao.loja.pedido.acao.AcaoAposGerarPedido;
import observer.solucao.loja.pedido.acao.EnviarEmailPedido;
import observer.solucao.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorDoOrcamento(),dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }

}
