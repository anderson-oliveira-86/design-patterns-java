package state.solucao.loja.orcamento.situacao;

import state.solucao.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}