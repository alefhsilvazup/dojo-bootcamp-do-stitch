package br.com.zupacademy.dojoot3.controller;

import br.com.zupacademy.dojoot3.entity.Turma;
import br.com.zupacademy.dojoot3.form.TurmaForm;
import br.com.zupacademy.dojoot3.form.TurmaResponseForm;
import br.com.zupacademy.dojoot3.handler.ErroFormularioDto;
import br.com.zupacademy.dojoot3.repository.TurmaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private TurmaRepository turmaRepository;

    public TurmaController(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarTurma(@RequestBody @Valid TurmaForm form, BindingResult result) {

        if(result.hasErrors()) {
        	List<FieldError> fieldErrors = result.getFieldErrors();
        	List<ErroFormularioDto> dto = new ArrayList<>();
        	fieldErrors.forEach(e -> {
                ErroFormularioDto erro = new ErroFormularioDto(e.getField(), e.getDefaultMessage());
                dto.add(erro);
                });
            return ResponseEntity.badRequest().body(dto);
        }

        Turma turma = form.converter();
        turma = turmaRepository.save(turma);
        TurmaResponseForm response = new TurmaResponseForm(turma);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(response.getId()).toUri();

        return ResponseEntity.created(uri).body(response);

    }
}
