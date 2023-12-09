package state.solucao.loja.desconto;

import state.solucao.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCintoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
