package br.edu.fema.models;

public class Pais {
    private static Integer startId = 0;
    private Integer id;
    private String  descricao;

    public Pais(String descricao) {
        this.id = ++startId;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
