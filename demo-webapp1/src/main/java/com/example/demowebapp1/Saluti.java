package com.example.demowebapp1;

import org.jetbrains.annotations.NotNull;

public class Saluti {
    public Saluti(@NotNull String nome, @NotNull String provincia, @NotNull String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    @NotNull
    public String nome;

    @NotNull public String provincia;

    @NotNull public String saluto;
}


