package chainOfResponsibility.problema.loja.desconto;

import chainOfResponsibility.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() >= 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }
}
