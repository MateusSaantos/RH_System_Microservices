package com.br.payroll_api.feing_Clients;

import com.br.payroll_api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name =  "user-api", url = "http://localhost:8080")
public interface User_Feing {

    @GetMapping("/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping()
    ResponseEntity<List<User>> findAll();
}
