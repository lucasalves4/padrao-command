package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<Instrucao> instrucao = new ArrayList<Instrucao>();

    public void executarInstrucao(Instrucao instrucao) {
        this.instrucao.add(instrucao);
        instrucao.executar();
    }
}
