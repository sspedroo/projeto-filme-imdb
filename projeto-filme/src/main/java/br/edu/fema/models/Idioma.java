package br.edu.fema.models;

public enum Idioma {
    INGLES ("Inglês"),
    PORTUGUES("Português"),
    ESPANHOL("Espanhol");

    final String descricao;

    Idioma (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }
}
