package observer.problema.loja;

import observer.problema.loja.desconto.CalculadoraDeDesconto;
import observer.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        BigDecimal primeiroDesconto = calculadora.calcular(primeiroOrcamento);
        System.out.println(primeiroDesconto);

        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
        BigDecimal segundoDesconto = calculadora.calcular(segundoOrcamento);
        System.out.println(segundoDesconto);

        Orcamento terceiroOrcamento = new Orcamento(new BigDecimal("100"), 1);
        BigDecimal terceiroDesconto = calculadora.calcular(terceiroOrcamento);
        System.out.println(terceiroDesconto);

    }
}
