package br.edu.fema.models;

import br.edu.fema.interfaces.ManipuleFilme;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filme implements ManipuleFilme {
    private static Integer startId = 0;
    private Integer id;
    private String titulo;
    private String descricao;
    private Integer anoPublicacao;
    private Map<Pais, Classificacao> classificacoes;
    private Integer duracao;
    private List<Genero> generos;
    private List<BigDecimal> notaAvalicacao;
    private List<Diretor> diretores;
    private List<Autor> autores;
    private List<Ator> atores;
    private List<Personagem> personagens;
    private List<Comentario> comentarios;
    private List<Idioma> idiomas;
    private DadosFinanceiros dadosFinanceiros;
    private DadosTecnicos dadosTecnicos;

    public Filme(String titulo, String descricao, Integer anoPublicacao, Integer duracao) {
        this.id = ++startId;
        this.titulo = titulo;
        this.descricao = descricao;
        this.anoPublicacao = anoPublicacao;
        this.duracao = duracao;
        this.atores = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.classificacoes = new HashMap<>();
        this.diretores = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.personagens = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator, Ator... atores){
        this.atores.add(ator);
        for(Ator ListaAtores : atores){
            this.atores.add(ListaAtores);
        }
    }
    public void adicionarGeneros(Genero genero){
        this.generos.add(genero);
    }

    public void adicionarClassificacao(Classificacao classificacao){
        this.classificacoes.put(classificacao.getPais(), classificacao);
    }

    public Map<Pais, Classificacao> getClassificacoes() {
        return classificacoes;
    }

    public void adicionarDiretores(Diretor diretor){
        this.diretores.add(diretor);
    }
    public void adicionarAutores(Autor autor){
        this.autores.add(autor);
    }
    public void adicionarPersonagens(Personagem personagem, Personagem... personagens){
        this.personagens.add(personagem);
        for(Personagem listaPersonagens : personagens){
            this.personagens.add(listaPersonagens);
        };
    }

    public void setIdiomas(Idioma idioma, Idioma... idiomas){
        this.idiomas.add(idioma);
        for (Idioma listaIdioma : idiomas){
            this.idiomas.add(listaIdioma);
        }
    }

    public void setDadosFinanceiros(BigDecimal orcamento, BigDecimal receita){
        this.dadosFinanceiros = new DadosFinanceiros(orcamento, receita);
    }
    public void setDadosTecnicos(String configAudio, String escala, Boolean coloracao){
        this.dadosTecnicos = new DadosTecnicos(configAudio, escala, coloracao);
    }
    public void comentarFilme(Usuario usuario, String conteudo){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<>();
        }
        this.comentarios.add(new Comentario(usuario, conteudo));
    }

    public void adicionarLikeNoComentario(Integer id){
        for(Comentario comentario : comentarios){
            if(comentario.getId() == id){
                comentario.adicionarLike();
            }
        }
    }

    public void removerLikeNoComentario(Integer id){
        for(Comentario comentario : comentarios){
            if(comentario.getId() == id){
                comentario.removerLike();
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public void darNotaAoFilme(BigDecimal nota){
        if (this.notaAvalicacao == null){
            this.notaAvalicacao = new ArrayList<>();
        }
        this.notaAvalicacao.add(nota);

    }

    public BigDecimal mediaNotaDoFilme(){
        if (notaAvalicacao == null || notaAvalicacao.isEmpty()) {
            return null;
        }
        BigDecimal mediaDoFilme = new BigDecimal("0");
        for (BigDecimal nota : notaAvalicacao){
            mediaDoFilme = mediaDoFilme.add(nota);
        }
        return mediaDoFilme.divide(BigDecimal.valueOf(notaAvalicacao.size()));
    }



    @Override
    public String toString() {
        String descricaoQuebrada = descricao.replaceAll("(.{1,95})(\\s+|$)", "$1\n");
        return "Filme: " + id + " | " + titulo + "\nNota de Avaliação: "+ this.mediaNotaDoFilme() +"/10" + "\nDescrição: "
                + descricaoQuebrada + "Ano de Publicação: " + anoPublicacao +
        "\nDuração: " + duracao + " min" + "\nGêneros: " + generos + "\nDiretores: " + diretores +
                "\nClassificações: " + getClassificacoes() +
                "\nAutores: " + autores + "\nAtores: " + atores + "\nPersonagens: " + personagens +
                "\nIdiomas: " + idiomas + "\nDados Financeiros: " + dadosFinanceiros +
                "\nDados Técnicos: " + dadosTecnicos + "\n\nComentários:" + comentarios;
    }


}
//java efetivo