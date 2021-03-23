package br.com.zupacademy.dojoot3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataDeInicio;

    private LocalDateTime dataDeFinalizado;

    /**
     * @deprecated Hibernate only
     */
    public Turma() {
    }

    public Turma(Long id, LocalDateTime dataDeInicio, LocalDateTime dataDeFinalizado) {
        this.id = id;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFinalizado = dataDeFinalizado;
    }
}
