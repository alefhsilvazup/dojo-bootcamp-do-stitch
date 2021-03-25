package br.com.zupacademy.dojoot3.repository;

import br.com.zupacademy.dojoot3.entity.Turma;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TurmaRepository extends CrudRepository<Turma, Long> {

    Optional<Turma> findByNome(String nome);
}
