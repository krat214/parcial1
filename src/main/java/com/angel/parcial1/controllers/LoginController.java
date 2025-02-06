package com.angel.parcial1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";  // Retorna el archivo login.html en templates
    }
}
