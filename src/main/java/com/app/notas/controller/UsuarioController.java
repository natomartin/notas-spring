package com.app.notas.controller;

import com.app.notas.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/")
    public String login(){
        return "login";
    }


}
