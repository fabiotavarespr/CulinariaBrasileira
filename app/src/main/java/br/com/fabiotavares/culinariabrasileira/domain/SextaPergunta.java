package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class SextaPergunta  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pergunta = "Qual ou quaís são os outro nomes conhecido pelo Brasil para a fruta chamada Tangerina?";
    private String opcaoA = "Banana";
    private String opcaoB = "Mexerica";
    private String opcaoC = "Maça";
    private String opcaoD = "Acabaxi";
    private String opcaoE = "Bergamota";
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

    public String getOpcaoC() {
        return opcaoC;
    }

    public void setOpcaoC(String opcaoC) {
        this.opcaoC = opcaoC;
    }

    public String getOpcaoD() {
        return opcaoD;
    }

    public void setOpcaoD(String opcaoD) {
        this.opcaoD = opcaoD;
    }

    public String getOpcaoE() {
        return opcaoE;
    }

    public void setOpcaoE(String opcaoE) {
        this.opcaoE = opcaoE;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
