package adapter.solucao.loja;

import adapter.solucao.loja.http.JavaHttpClient;
import adapter.solucao.loja.orcamento.Orcamento;
import adapter.solucao.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        orcamento.aprovar();
        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
