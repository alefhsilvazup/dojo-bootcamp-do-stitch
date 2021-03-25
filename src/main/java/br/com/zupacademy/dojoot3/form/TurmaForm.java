package br.com.zupacademy.dojoot3.form;

import br.com.zupacademy.dojoot3.entity.Turma;
import br.com.zupacademy.dojoot3.validator.ValorUnico.ValorUnico;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TurmaForm {
	@Size(max=50)
	@NotEmpty
	@NotNull
    //@ValorUnico
    private String nome;
	@NotEmpty
	@NotNull
    private LocalDate iniciaEm;
	@NotEmpty
	@NotNull
    private LocalDate terminaEm;

    public TurmaForm(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIniciaEm() {
        return iniciaEm;
    }

    public LocalDate getTerminaEm() {
        return terminaEm;
    }

    public Turma converter(){
        return new Turma (nome, iniciaEm, terminaEm);
    }
}
