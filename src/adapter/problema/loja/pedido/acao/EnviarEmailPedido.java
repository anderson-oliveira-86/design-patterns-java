package adapter.problema.loja.pedido.acao;

import adapter.problema.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
    }
}
