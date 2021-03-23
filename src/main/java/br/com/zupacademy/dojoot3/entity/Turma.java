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

    private String nome;

    private LocalDateTime dataDeInicio;

    private LocalDateTime dataDeFinalizado;

    /**
     * @deprecated Hibernate only
     */
    public Turma() {
    }

    public Turma(String nome, LocalDateTime dataDeInicio, LocalDateTime dataDeFinalizado) {

        this.nome = nome;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFinalizado = dataDeFinalizado;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", dataDeInicio=" + dataDeInicio +
                ", dataDeFinalizado=" + dataDeFinalizado +
                '}';
    }
}
