package observer.solucao.loja.imposto;

import observer.solucao.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    /*
    Aqui criamos a interface com o método calcular, a forma de calcular vai ser definida
    na classe que implementar esta interface;
    */
    BigDecimal calcular(Orcamento orcamento);
}
