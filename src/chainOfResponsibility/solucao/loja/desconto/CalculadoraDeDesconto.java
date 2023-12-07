package chainOfResponsibility.solucao.loja.desconto;

import chainOfResponsibility.solucao.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCintoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
