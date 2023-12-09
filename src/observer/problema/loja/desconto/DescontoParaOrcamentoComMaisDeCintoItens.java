package observer.problema.loja.desconto;

import observer.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCintoItens extends Desconto {
    public DescontoParaOrcamentoComMaisDeCintoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() >= 5;
    }

}
