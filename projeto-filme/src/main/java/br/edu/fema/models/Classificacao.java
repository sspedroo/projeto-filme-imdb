package br.edu.fema.models;

public class Classificacao {
    private String descricao;
    private Pais pais;

    public Classificacao(String descricao,Pais pais) {
        this.descricao = descricao;
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

