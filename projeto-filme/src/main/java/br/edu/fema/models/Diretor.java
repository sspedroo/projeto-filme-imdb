package br.edu.fema.models;

import java.time.LocalDate;

public class Diretor extends Pessoa{
    public Diretor(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public String toString() {
        return nome;
    }
}
