package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario usuario;
    Texto texto;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        texto = new Texto (10);
    }

    @Test
    void deveCopiarTexto() {
        Instrucao copiarTexto = new InstrucaoCopiarTexto(texto);
        usuario.executarInstrucao(copiarTexto);

        assertEquals("Texto Copiado", texto.getSituacao());
    }

    @Test
    void deveColarTexto() {
        Instrucao colarTexto = new InstrucaoColarTexto(texto);
        usuario.executarInstrucao(colarTexto);

        assertEquals("Texto Colado", texto.getSituacao());
    }

    @Test
    void deveCortarTexto() {
        Instrucao cortarTexto = new InstrucaoCortarTexto(texto);
        usuario.executarInstrucao(cortarTexto);

        assertEquals("Texto Cortado", texto.getSituacao());
    }
}