package com.br.user_api.services.implement;

import com.br.user_api.domain.User;
import com.br.user_api.repository.User_Repository;
import com.br.user_api.services.User_Service_Interface;
import com.br.user_api.services.exeptions.Object_Not_Found_Exeption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User_Service implements User_Service_Interface {

    private final User_Repository user_repository;

    @Override
    public User findByID(Long id) {
        return user_repository.findById(id).orElseThrow(() ->
                new Object_Not_Found_Exeption("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return user_repository.findAll();
    }
}
