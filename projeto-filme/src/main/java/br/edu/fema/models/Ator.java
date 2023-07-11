package br.edu.fema.models;

import java.time.LocalDate;

public class Ator extends Pessoa{
    private String website;
    private String instagram;



    public Ator(String nome, LocalDate dataNascimento, String website, String instagram) {
        super(nome, dataNascimento);
        this.website = website;
        this.instagram = instagram;
    }

    @Override
    public String toString() {
        return nome;
    }
}
