package com.br.payroll_api.services.exeption;

public class Object_Not_Found_Exeption extends RuntimeException {

    public Object_Not_Found_Exeption(String message) {
        super(message);
    }
}
