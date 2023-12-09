package observer.solucao.loja;

import observer.solucao.loja.pedido.GeraPedido;
import observer.solucao.loja.pedido.GeraPedidoHandler;
import observer.solucao.loja.pedido.acao.EnviarEmailPedido;
import observer.solucao.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Ana Maria";
        BigDecimal valorDoOrcamento = new BigDecimal("600");
        int quantidadeItens = 5;

        GeraPedido gerador = new GeraPedido(cliente,valorDoOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.execute(gerador);

        
    }

}
