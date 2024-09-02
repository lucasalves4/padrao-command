package org.example;

public class InstrucaoCopiarTexto implements Instrucao{

    private Texto texto;

    public InstrucaoCopiarTexto(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.copiarTexto();
    }

}
