package com.lucasdev.Projetocurso.remedio;

import org.jetbrains.annotations.NotNull;

public record RemedioDTO(
        @NotNull String nome,
        Via via,
        String lote,
        String quantidade,
        String validade,
        Laboratorio laboratorio) {
}
