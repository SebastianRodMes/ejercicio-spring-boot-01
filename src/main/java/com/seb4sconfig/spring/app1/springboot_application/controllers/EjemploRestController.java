package com.seb4sconfig.spring.app1.springboot_application.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seb4sconfig.spring.app1.springboot_application.models.Empleados;


@RestController

@RequestMapping("/api")
/*
 * aca el request mapping, es digamos como para definir el endpoint por ejemplo,
 * al colocar eso
 * ahora para acceder a ese metodo de detalles info, ya no seria
 * http://localhost:8080/detalles_info2, si no que ahora seria
 * http://localhost:8080/api/detalles_info2 se llama ruta de primer nivel
 */

public class EjemploRestController {

    /* EL RequestMapping y el getMapping trabajan solo con get */
    /* @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET) */

    @GetMapping(path = "/detalles_info2")

    public Map<String, Object> detalles_info2() {

        Empleados Empleado1 = new Empleados("Sebas", "Rodriguez", "Barrio las pepas", "Jefe", 21, 61046716, 1);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", Empleado1);
 
        return respuesta;

    }

}
