package com.lucasdev.Projetocurso.controllers;

import com.lucasdev.Projetocurso.remedio.RemedioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @PostMapping
    public void cadastrarRemedio(@RequestBody RemedioDTO dados) {
        System.out.println(dados);
    }
}
