package strategy.solucao.loja.imposto;

import java.math.BigDecimal;

public class ISS implements Imposto {

    /*
    Aqui extraimos um dos algoritmos e implementamos a interface Imposto,
    Para que a assinatura do método seja a mesma.
     */
    @Override
    public BigDecimal calcular(strategy.solucao.loja.orcamento.Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
