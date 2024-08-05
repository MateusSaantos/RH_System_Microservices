package com.br.user_api.services.exeptions;

public class Object_Not_Found_Exeption extends RuntimeException {

    public Object_Not_Found_Exeption(String message) {
        super(message);
    }
}
