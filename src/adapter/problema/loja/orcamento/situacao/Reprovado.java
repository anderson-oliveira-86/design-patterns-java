package adapter.problema.loja.orcamento.situacao;

import adapter.problema.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}