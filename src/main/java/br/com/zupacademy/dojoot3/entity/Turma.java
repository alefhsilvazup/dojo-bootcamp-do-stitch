package br.com.zupacademy.dojoot3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique=true,nullable=false)
    private String nome;
    
    private LocalDate dataDeInicio;

    private LocalDate dataDeFinalizado;

    /**
     * @deprecated Hibernate only
     */
    public Turma() {
    }

    public Turma(String nome, LocalDate dataDeInicio, LocalDate dataDeFinalizado) {

        this.nome = nome;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFinalizado = dataDeFinalizado;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public LocalDate getDataDeFinalizado() {
        return dataDeFinalizado;
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
