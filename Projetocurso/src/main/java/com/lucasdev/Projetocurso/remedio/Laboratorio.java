package com.lucasdev.Projetocurso.remedio;

public enum Laboratorio {
    LAB1(1, "Laboratório 1"),
    LAB2(2, "Laboratório 2");

    String description;
    int code;

    Laboratorio(int code, String description){
        this.code = code;
        this.description = description;
    }


}
