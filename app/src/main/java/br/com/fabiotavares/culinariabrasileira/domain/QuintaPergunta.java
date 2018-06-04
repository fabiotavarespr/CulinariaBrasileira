package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class QuintaPergunta  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pergunta = "A Caipirinha é uma das bebidas brasileiras mais conhecidas nacionalmente e internacionalmente. A Caipirinha tem origem de qual estado brasileiro?";
    private String opcaoA = "Acre";
    private String opcaoB = "Pernambuco";
    private String opcaoC = "Espírito Santo";
    private String opcaoD = "São Paulo";
    private String opcaoE = "Mato Grosso do Sul";
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
