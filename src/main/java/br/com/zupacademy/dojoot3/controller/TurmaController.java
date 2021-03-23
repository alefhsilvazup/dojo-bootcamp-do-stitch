package br.com.zupacademy.dojoot3.controller;

import br.com.zupacademy.dojoot3.form.TurmaForm;
import br.com.zupacademy.dojoot3.entity.Turma;
import br.com.zupacademy.dojoot3.form.TurmaResponseForm;
import br.com.zupacademy.dojoot3.repository.TurmaRepository;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    public ResponseEntity<TurmaResponseForm> cadastrarTurma(@RequestBody TurmaForm form) {
        Turma turma = form.converter();
        turma = turmaRepository.save(turma);
        TurmaResponseForm response = new TurmaResponseForm(turma);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(response.getId()).toUri();

        return ResponseEntity.created(uri).body(response);

    }
}
