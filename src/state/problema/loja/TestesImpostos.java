package state.problema.loja;

import state.problema.loja.imposto.CalculadoraDeImpostos;
import state.problema.loja.imposto.ICMS;
import state.problema.loja.imposto.ISS;
import state.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora1 = new CalculadoraDeImpostos();
        BigDecimal calcular1 = calculadora1.calcular(orcamento1, new ICMS());
        System.out.println(calcular1);

        Orcamento orcamento2 = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora2 = new CalculadoraDeImpostos();
        BigDecimal calcular2 = calculadora2.calcular(orcamento2, new ISS());
        System.out.println(calcular2);

    }
}
