package org.example;

public class InstrucaoCortarTexto implements Instrucao{

    private Texto texto;

    public InstrucaoCortarTexto(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.cortarTexto();
    }
}
