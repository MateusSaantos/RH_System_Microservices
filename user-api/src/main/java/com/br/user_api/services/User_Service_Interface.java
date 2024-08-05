package com.br.user_api.services;

import com.br.user_api.domain.User;

import java.util.List;

public interface User_Service_Interface {

    User findByID(Long id);

    List<User> findAll();
}
