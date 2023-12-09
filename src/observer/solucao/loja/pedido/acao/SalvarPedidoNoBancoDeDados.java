package observer.solucao.loja.pedido.acao;

import observer.solucao.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }


}
