package com.br.payroll_api.web.controller;

import com.br.payroll_api.domain.Payroll;
import com.br.payroll_api.domain.User;
import com.br.payroll_api.feing_Clients.User_Feing;
import com.br.payroll_api.services.Payroll_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pay")
@RequiredArgsConstructor
public class Payroll_Controller {

    private final Payroll_Service service;

    @GetMapping("/{workedId}")
    ResponseEntity<Payroll> getTotalSalary(@PathVariable Long workedId, @RequestBody Payroll payroll) {
        return ResponseEntity.ok(service.getTotalSalary(workedId, payroll));
    }
}
