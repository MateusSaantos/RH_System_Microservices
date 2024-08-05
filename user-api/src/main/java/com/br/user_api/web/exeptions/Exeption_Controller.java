package com.br.user_api.web.exeptions;

import com.br.user_api.services.exeptions.Object_Not_Found_Exeption;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class Exeption_Controller {

    @ExceptionHandler(Object_Not_Found_Exeption.class)
    ResponseEntity<Standart_Error> exeption(Object_Not_Found_Exeption ex,
                                            HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new Standart_Error(LocalDateTime.now(),
                                   ex.getMessage(),
                                   HttpStatus.NOT_FOUND.value(),
                                   request.getRequestURI())
        );
    }
}
