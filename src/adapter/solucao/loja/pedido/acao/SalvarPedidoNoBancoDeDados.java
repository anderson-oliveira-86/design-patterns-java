package adapter.solucao.loja.pedido.acao;

import adapter.solucao.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }


}
