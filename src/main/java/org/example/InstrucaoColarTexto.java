package org.example;

public class InstrucaoColarTexto implements Instrucao{

    private Texto texto;

    public InstrucaoColarTexto(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.colarTexto();
    }
}
