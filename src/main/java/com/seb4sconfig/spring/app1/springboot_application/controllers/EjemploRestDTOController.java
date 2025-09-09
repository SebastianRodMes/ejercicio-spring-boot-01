package com.seb4sconfig.spring.app1.springboot_application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seb4sconfig.spring.app1.springboot_application.models.dto.ClaseDTO;

@RestController
@RequestMapping("/dto")
public class EjemploRestDTOController {

    @GetMapping(path = "/dtoEjemplo")

    public ClaseDTO ejemplo_dto() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Mi titulo");
        usuario1.setUsuario("Sebas");

        return usuario1;
    }

}
