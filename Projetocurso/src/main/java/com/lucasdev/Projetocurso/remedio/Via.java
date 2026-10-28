package com.lucasdev.Projetocurso.remedio;

public enum Via {
    ORAL(1,"Oral"),
    NASAL(2, "Nasal"),
    VENOSO(3, "Venoso"),
    INTRAMUSCULAR(4, "Intramuscular"),
    RETAL(5, "Retal");

    String description;
    int code;

    Via(int code, String description) {
        this.description = description;
        this.code = code;
    }


}
