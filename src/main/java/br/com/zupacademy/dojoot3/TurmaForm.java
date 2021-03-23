package br.com.zupacademy.dojoot3;

import java.time.LocalDateTime;

public class TurmaForm {
    private String nome;
    private LocalDateTime iniciaEm;
    private LocalDateTime terminaEm;

    public TurmaForm(String nome, LocalDateTime iniciaEm, LocalDateTime terminaEm) {
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getIniciaEm() {
        return iniciaEm;
    }

    public LocalDateTime getTerminaEm() {
        return terminaEm;
    }
}
