package br.edu.fema.models;

import java.time.LocalDate;

public abstract class Pessoa {
    private static Integer startId = 0;
    protected Integer id;
    protected String nome;
    protected LocalDate dataNascimento;

    public Integer getId() {
        return id;
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.id = ++startId;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
