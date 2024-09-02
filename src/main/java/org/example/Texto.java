package org.example;

public class Texto {

    private int caracteres;
    private String situacao;

    public Texto(int caracteres) {
        this.caracteres = caracteres;
    }

    public String getSituacao() {
        return situacao;
    }

    public void copiarTexto() {
        this.situacao = "Texto Copiado";
    }

    public void colarTexto() {
        this.situacao = "Texto Colado";
    }

    public void cortarTexto() {
        this.situacao = "Texto Cortado";
    }
}
