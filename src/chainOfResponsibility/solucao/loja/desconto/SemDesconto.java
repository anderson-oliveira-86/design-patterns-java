package chainOfResponsibility.solucao.loja.desconto;

import chainOfResponsibility.solucao.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

}
