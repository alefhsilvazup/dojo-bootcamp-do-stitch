package br.com.zupacademy.dojoot3.validator.ValorUnico;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValorUnicoValidator implements ConstraintValidator<ValorUnico, Object> {
    private String campo;
    private Class<?> classe;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void initialize(ValorUnico constraintAnnotation) {
        this.campo = constraintAnnotation.campo();
        this.classe = constraintAnnotation.classe();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
    	
        Query query = entityManager.createQuery("SELECT 1 FROM " + classe.getName() + 
        		"WHERE " + campo + " = :value").setParameter("value", o);
        
        List<?> list = query.getResultList();
        
        return list.isEmpty();
    }
}
