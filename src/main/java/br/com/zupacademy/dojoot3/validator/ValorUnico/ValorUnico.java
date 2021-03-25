package br.com.zupacademy.dojoot3.validator.ValorUnico;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValorUnico {
    String mensagem ()default"O campo está duplicado";
    //Class<?>
}
