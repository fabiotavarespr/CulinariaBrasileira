package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class QuartaPergunta  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pergunta = "Qual é a bebida tipica da região Sul do Brasil que tem um gosto mais ou menos amargo, que usa erva-mate e água quente e é bebida em uma cuia?";
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
