package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class PrimeiraPergunta implements Serializable{
    private static final long serialVersionUID = 1L;

    private String pergunta = "Além do queijo, qual é o outro componente que leva o doce Romeu e Julieta?";
    private String opcaoA = "Doce de leite";
    private String opcaoB = "Goiabada";
    private String opcaoC = "Marmelada";
    private String opcaoD = "Sorvete";
    private String opcaoE = "Leite Condensado";
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

