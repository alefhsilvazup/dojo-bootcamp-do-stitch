package br.com.zupacademy.dojoot3.form;

import br.com.zupacademy.dojoot3.entity.Turma;
import br.com.zupacademy.dojoot3.validator.ValorUnico.ValorUnico;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TurmaForm {
	@Size(max=50)
	@NotBlank
    @ValorUnico
    private String nome;
	@NotNull
    private LocalDate iniciaEm;
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
