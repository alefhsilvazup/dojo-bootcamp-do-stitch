package br.com.zupacademy.dojoot3.validator.ValorUnico;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValorUnicoValidator.class)
@Documented
public @interface ValorUnico {
    String mensagem ()default"O campo está duplicado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String campo();
    Class<?> classe();
}
