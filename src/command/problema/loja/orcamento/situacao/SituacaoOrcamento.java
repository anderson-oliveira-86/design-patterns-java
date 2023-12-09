package command.problema.loja.orcamento.situacao;

import command.problema.loja.DomainException;
import command.problema.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado!");
    }
}
