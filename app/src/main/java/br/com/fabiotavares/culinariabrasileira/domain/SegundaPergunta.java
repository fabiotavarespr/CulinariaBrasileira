package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class SegundaPergunta  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pergunta = "O arroz carreteiro é comum em qual região brasileira?";
    private String resposta = new String();

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
