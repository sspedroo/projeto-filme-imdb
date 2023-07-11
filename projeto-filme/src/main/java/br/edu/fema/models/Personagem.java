package br.edu.fema.models;

public class Personagem{
    private String nome;
    private Ator ator;

    public Personagem(String nome, Ator ator) {
        this.nome = nome;
        this.ator = ator;
    }

    @Override
    public String toString() {
        return nome;
    }
}
