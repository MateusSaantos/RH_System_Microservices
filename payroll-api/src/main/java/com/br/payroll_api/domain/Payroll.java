package com.br.payroll_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {

    private String workedName;
    private String description;
    private Double hourlyPrice;
    private Double hourlsWorked;
    private Double totalSalary;
}
