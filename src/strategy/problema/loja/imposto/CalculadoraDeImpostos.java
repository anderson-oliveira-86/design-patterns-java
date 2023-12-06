package strategy.problema.loja.imposto;

import strategy.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){

        /*
        Utilizamos o design pattern Strategy quando temos um algoritmo que muda de acordo com um parâmetro
        No exemplo a baixo, conforme varia o tipo do imposto, adotamos algoritmos diferentes.
         */

        switch (tipoImposto){
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
