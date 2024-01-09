package adapter.problema.loja.imposto;

import adapter.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    /*
    Já utilizando o padrão Strategy, o calculo vai depender do objeto Imposto recebido.
    mudando o Imposto, ele muda o algoritmo.
    */
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
