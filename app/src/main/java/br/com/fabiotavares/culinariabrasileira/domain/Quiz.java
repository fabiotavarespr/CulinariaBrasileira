package br.com.fabiotavares.culinariabrasileira.domain;

import java.io.Serializable;

public class Quiz  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome = new String();
    private PrimeiraPergunta primeiraPergunta = new PrimeiraPergunta();
    private SegundaPergunta segundaPergunta = new SegundaPergunta();
    private TerceiraPergunta terceiraPergunta = new TerceiraPergunta();
    private QuartaPergunta quartaPergunta = new QuartaPergunta();
    private QuintaPergunta quintaPergunta = new QuintaPergunta();
    private SextaPergunta sextaPergunta = new SextaPergunta();
    private Gabarito gabarito = new Gabarito();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PrimeiraPergunta getPrimeiraPergunta() {
        return primeiraPergunta;
    }

    public void setPrimeiraPergunta(PrimeiraPergunta primeiraPergunta) {
        this.primeiraPergunta = primeiraPergunta;
    }

    public SegundaPergunta getSegundaPergunta() {
        return segundaPergunta;
    }

    public void setSegundaPergunta(SegundaPergunta segundaPergunta) {
        this.segundaPergunta = segundaPergunta;
    }

    public TerceiraPergunta getTerceiraPergunta() {
        return terceiraPergunta;
    }

    public void setTerceiraPergunta(TerceiraPergunta terceiraPergunta) {
        this.terceiraPergunta = terceiraPergunta;
    }

    public QuartaPergunta getQuartaPergunta() {
        return quartaPergunta;
    }

    public void setQuartaPergunta(QuartaPergunta quartaPergunta) {
        this.quartaPergunta = quartaPergunta;
    }

    public QuintaPergunta getQuintaPergunta() {
        return quintaPergunta;
    }

    public void setQuintaPergunta(QuintaPergunta quintaPergunta) {
        this.quintaPergunta = quintaPergunta;
    }

    public SextaPergunta getSextaPergunta() {
        return sextaPergunta;
    }

    public void setSextaPergunta(SextaPergunta sextaPergunta) {
        this.sextaPergunta = sextaPergunta;
    }

    public Gabarito getGabarito() {
        return gabarito;
    }

    public void setGabarito(Gabarito gabarito) {
        this.gabarito = gabarito;
    }
}
