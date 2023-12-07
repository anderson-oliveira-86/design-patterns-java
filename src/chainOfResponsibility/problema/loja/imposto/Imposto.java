package chainOfResponsibility.problema.loja.imposto;

import chainOfResponsibility.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    /*
    Aqui criamos a interface com o método calcular, a forma de calcular vai ser definida
    na classe que implementar esta interface;
    */
    BigDecimal calcular(Orcamento orcamento);
}