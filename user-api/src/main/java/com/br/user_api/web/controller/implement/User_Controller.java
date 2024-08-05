package com.br.user_api.web.controller.implement;

import com.br.user_api.domain.User;
import com.br.user_api.services.User_Service_Interface;
import com.br.user_api.web.controller.User_Controller_Interface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class User_Controller implements User_Controller_Interface {

    private final User_Service_Interface user_service;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(user_service.findByID(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(user_service.findAll());
    }
}
