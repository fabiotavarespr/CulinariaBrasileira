package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class Gabarito implements Serializable {
    private static final long serialVersionUID = 1L;

    private String primeiraPergunta = "Goiabada";
    private String segundaPergunta = "Sul";
    private String terceiraPergunta = "Verdadeiro";
    private String quartaPergunta = "Chimarrão";
    private String quintaPergunta = "São Paulo";
    private String sextaPergunta = "Mexerica - Bergamota";

    public String getPrimeiraPergunta() {
        return primeiraPergunta;
    }

    public void setPrimeiraPergunta(String primeiraPergunta) {
        this.primeiraPergunta = primeiraPergunta;
    }

    public String getSegundaPergunta() {
        return segundaPergunta;
    }

    public void setSegundaPergunta(String segundaPergunta) {
        this.segundaPergunta = segundaPergunta;
    }

    public String getTerceiraPergunta() {
        return terceiraPergunta;
    }

    public void setTerceiraPergunta(String terceiraPergunta) {
        this.terceiraPergunta = terceiraPergunta;
    }

    public String getQuartaPergunta() {
        return quartaPergunta;
    }

    public void setQuartaPergunta(String quartaPergunta) {
        this.quartaPergunta = quartaPergunta;
    }

    public String getQuintaPergunta() {
        return quintaPergunta;
    }

    public void setQuintaPergunta(String quintaPergunta) {
        this.quintaPergunta = quintaPergunta;
    }

    public String getSextaPergunta() {
        return sextaPergunta;
    }

    public void setSextaPergunta(String sextaPergunta) {
        this.sextaPergunta = sextaPergunta;
    }
}
