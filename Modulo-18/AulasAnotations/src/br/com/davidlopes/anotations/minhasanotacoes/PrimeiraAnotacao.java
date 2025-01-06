package br.com.davidlopes.anotations.minhasanotacoes;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface PrimeiraAnotacao {
    String value();
    String[] bairros();

    // com valores default não é necessário passar o valor na anotação
    double preco() default 11.90d;


}
