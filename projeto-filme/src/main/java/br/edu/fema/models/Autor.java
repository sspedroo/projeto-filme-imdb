package br.edu.fema.models;

import java.time.LocalDate;

public class Autor extends Pessoa{
    public Autor(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public String toString() {
        return nome;
    }
}
