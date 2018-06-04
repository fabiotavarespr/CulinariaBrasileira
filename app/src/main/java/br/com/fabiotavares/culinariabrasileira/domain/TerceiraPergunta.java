package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class TerceiraPergunta  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pergunta = "O acarajé foi inventado no Maranhão. Verdadeiro ou falso?";
    private String opcaoA = "Verdadeiro";
    private String opcaoB = "Falso";
    private String resposta = new String();

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpcaoA() {
        return opcaoA;
    }

    public void setOpcaoA(String opcaoA) {
        this.opcaoA = opcaoA;
    }

    public String getOpcaoB() {
        return opcaoB;
    }

    public void setOpcaoB(String opcaoB) {
        this.opcaoB = opcaoB;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
