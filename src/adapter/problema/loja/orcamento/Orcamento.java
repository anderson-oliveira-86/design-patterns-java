package adapter.problema.loja.orcamento;

import adapter.problema.loja.orcamento.situacao.EmAnalise;
import adapter.problema.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.setSituacao(new EmAnalise());
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.getSituacao().calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.getSituacao().aprovar(this);
    }

    public void reprovar(){
        this.getSituacao().reprovar(this);
    }

    public void finalizar(){
        this.getSituacao().finalizar(this);
    }
    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }


}
