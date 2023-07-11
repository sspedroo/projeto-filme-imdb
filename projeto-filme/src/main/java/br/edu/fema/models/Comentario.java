package br.edu.fema.models;

public class Comentario {
    private static Integer startid = 0;
    private Integer id;
    private Usuario usuario;
    private String conteudo;
    private Integer like;

    public Comentario(Usuario usuario, String conteudo) {
        this.id = startid++;
        this.usuario = usuario;
        this.conteudo = conteudo;
        this.like = 0;
    }

    public void adicionarLike(){
        this.like++;
    }
    public void removerLike(){
        this.like--;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n" + usuario.nome + ": " + conteudo + "\n" +  like + " Likes";
    }
}
