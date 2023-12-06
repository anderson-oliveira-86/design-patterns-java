package strategy.problema.loja;

import strategy.problema.loja.imposto.CalculadoraDeImpostos;
import strategy.problema.loja.imposto.TipoImposto;
import strategy.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        BigDecimal calcular = calculadora.calcular(orcamento, TipoImposto.ICMS);
        System.out.println(calcular);
    }
}
