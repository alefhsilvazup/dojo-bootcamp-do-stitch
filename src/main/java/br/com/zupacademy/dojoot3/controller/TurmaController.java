package br.com.zupacademy.dojoot3.controller;

import br.com.zupacademy.dojoot3.TurmaForm;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    @PostMapping
    public String cadastrarTurma(@RequestBody TurmaForm form) {
        
    }
}
