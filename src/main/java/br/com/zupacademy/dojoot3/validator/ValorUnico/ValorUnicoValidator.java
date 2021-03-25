package br.com.zupacademy.dojoot3.validator.ValorUnico;

import org.springframework.beans.factory.annotation.Autowired;

import javax.management.Query;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class ValorUnicoValidator implements ConstraintValidator<ValorUnico, Object> {
    private String campo;
    private Class<?> classe;

    @PersistenceContext
    

    @Override
    public void initialize(ValorUnico constraintAnnotation) {
        this.campo = constraintAnnotation.campo();
        this.classe = constraintAnnotation.classe();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Query query =
        return false;
    }
}
