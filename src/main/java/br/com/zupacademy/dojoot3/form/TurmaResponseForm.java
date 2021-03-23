package br.com.zupacademy.dojoot3.form;

import br.com.zupacademy.dojoot3.entity.Turma;

import java.time.LocalDateTime;

public class TurmaResponseForm {
    private Long id;
    private LocalDateTime inicio;
    private LocalDateTime termino;

    public TurmaResponseForm() {
    }

    public TurmaResponseForm(Long id, LocalDateTime inicio, LocalDateTime termino) {
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

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getTermino() {
        return termino;
    }
}
