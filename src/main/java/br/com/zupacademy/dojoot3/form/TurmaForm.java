package br.com.zupacademy.dojoot3.form;

import br.com.zupacademy.dojoot3.entity.Turma;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TurmaForm {
	@Size(max=50)
	@NotEmpty
	@NotNull
    private String nome;
	@NotEmpty
	@NotNull
    private LocalDateTime iniciaEm;
	@NotEmpty
	@NotNull
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

    public Turma converter(){
        return new Turma (nome, iniciaEm, terminaEm);
    }
}
