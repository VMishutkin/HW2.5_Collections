package mish.vlad.hw25_collections;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



public class EmployeeAlreadyAddedException extends RuntimeException{

/*
    HttpStatus value() default HttpStatus.INTERNAL_SERVER_ERROR;

    @AliasFor("value")
    HttpStatus code() default HttpStatus.INTERNAL_SERVER_ERROR;

    String reason() default "";
 */
}
