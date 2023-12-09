package observer.solucao.loja.pedido.acao;

import observer.solucao.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
    }
}
