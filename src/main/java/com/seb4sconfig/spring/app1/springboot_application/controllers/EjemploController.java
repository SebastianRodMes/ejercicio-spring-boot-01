package com.seb4sconfig.spring.app1.springboot_application.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.seb4sconfig.spring.app1.springboot_application.models.Empleados;

@Controller
public class EjemploController {
    @GetMapping("/detalles_info")

    public String info(Model model) {

        Empleados Empleado1 = new Empleados("Sebas", "Rodriguez", "Barrio las pepas", "Jefe", 21, 61046716, 1);
        Empleados Empleado2 = new Empleados("Sebastian", "Rodriguez", "Barrio las pepas", "Jefe", 21, 61046716, 1);
       model.addAttribute("empleado", Empleado1);
       model.addAttribute("empleado2", Empleado2);
       return "detalles_info";
    }

    /*
     * se puede usar tambien de la forma normal, no es digamos necesario usar
     * siempre la parte el model
     */
    /*
     * public String info(Map<String, Object> modelo){
     * modelo.put("Titulo", "Server en linea");
     * modelo.put("Server", "Server de sebas");
     * modelo.put("Ip", "192.168.0.12");
     * return "detalles_info";
     * }
     */

}
