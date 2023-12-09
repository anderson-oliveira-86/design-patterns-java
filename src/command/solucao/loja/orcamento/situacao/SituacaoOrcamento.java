package command.solucao.loja.orcamento.situacao;

import command.solucao.loja.DomainException;
import command.solucao.loja.orcamento.Orcamento;

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
