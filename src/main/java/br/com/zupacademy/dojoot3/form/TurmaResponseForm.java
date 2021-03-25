package br.com.zupacademy.dojoot3.form;

import br.com.zupacademy.dojoot3.entity.Turma;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TurmaResponseForm {
    private Long id;
    private LocalDate inicio;
    private LocalDate termino;

    public TurmaResponseForm() {
    }

    public TurmaResponseForm(Long id, LocalDate inicio, LocalDate termino) {
        this.id = id;
        this.inicio = inicio;
        this.termino = termino;
    }

    public TurmaResponseForm(Turma entity) {
        this.id = entity.getId();
        this.inicio = entity.getDataDeInicio();
        this.termino = entity.getDataDeFinalizado();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }
}
