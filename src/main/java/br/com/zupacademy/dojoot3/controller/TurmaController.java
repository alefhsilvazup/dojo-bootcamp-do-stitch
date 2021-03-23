package br.com.zupacademy.dojoot3.controller;

import br.com.zupacademy.dojoot3.TurmaForm;
import br.com.zupacademy.dojoot3.entity.Turma;
import br.com.zupacademy.dojoot3.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired private TurmaRepository turmaRepository;

    @PostMapping
    public ResponseEntity<TurmaForm> cadastrarTurma(@RequestBody TurmaForm form) {
        Turma turma = form.converter()
    }
}
