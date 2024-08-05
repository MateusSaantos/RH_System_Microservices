package com.br.payroll_api.services;

import com.br.payroll_api.domain.Payroll;
import com.br.payroll_api.feing_Clients.User_Feing;
import com.br.payroll_api.services.exeption.Object_Not_Found_Exeption;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class Payroll_Service {

    private final Environment env;
    private final User_Feing feing;

    public Payroll getTotalSalary(Long workedId, Payroll payroll){
        log.info("PAYROLL SERVICE::: Get request on " + env.getProperty("local.server.port") + " port " + env.getProperty("local.server.port") + " port");

        try{
            var user = feing.findById(workedId).getBody();
            if(Objects.nonNull(user)){
                return new Payroll(user.getName(),
                        payroll.getDescription(),
                        user.getHourlyPrice(),
                        payroll.getHourlsWorked(),
                        user.getHourlyPrice() * payroll.getHourlsWorked());
            }

        } catch (FeignException.NotFound ex){
            throw new Object_Not_Found_Exeption("Objeto não encontrado");

        } catch (Exception ex){
            throw new IllegalArgumentException("Dados enviados incorretamente");
        }
        return null;
    }
}
