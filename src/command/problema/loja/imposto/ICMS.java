package command.problema.loja.imposto;

import command.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    /*
    Aqui extraimos um dos algoritmos e implementamos a interface Imposto,
    Para que a assinatura do método seja a mesma.
     */
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
