package adapter.solucao.loja.orcamento;

import adapter.solucao.loja.DomainException;
import adapter.solucao.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados =Map.of(
                "valor",orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens());
        httpAdapter.post(url,dados);
    }
}
