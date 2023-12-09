package observer.solucao.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorDoOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorDoOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorDoOrcamento = valorDoOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorDoOrcamento() {
        return valorDoOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
