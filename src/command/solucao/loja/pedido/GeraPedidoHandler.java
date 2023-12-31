package command.solucao.loja.pedido;

import state.solucao.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependências: repository, service, etc.
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorDoOrcamento(),dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }

}
