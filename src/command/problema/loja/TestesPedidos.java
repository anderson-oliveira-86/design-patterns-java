package command.problema.loja;

import command.problema.loja.pedido.Pedido;
import command.solucao.loja.pedido.GeraPedido;
import command.solucao.loja.pedido.GeraPedidoHandler;
import org.w3c.dom.ls.LSOutput;
import state.solucao.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorDoOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente,valorDoOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias: repository, service, etc*/);
        handler.execute(gerador);
    }

}
