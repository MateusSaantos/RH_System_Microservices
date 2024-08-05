package com.br.user_api.web.exeptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Standart_Error {
    private LocalDateTime localDateTime;
    private String message;
    private Integer status;
    private String path;
}
