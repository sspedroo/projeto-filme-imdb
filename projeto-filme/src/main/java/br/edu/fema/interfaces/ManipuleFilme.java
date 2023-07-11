package br.edu.fema.interfaces;

import br.edu.fema.models.*;

import java.math.BigDecimal;

public interface ManipuleFilme {

    void adicionarAtor(Ator ator, Ator... atores);
    void adicionarGeneros(Genero genero);
    void adicionarClassificacao(Classificacao classificacao);
    void adicionarDiretores(Diretor diretor);
    void adicionarAutores(Autor autor);
    void adicionarPersonagens(Personagem personagem, Personagem... personagens);
    void setIdiomas(Idioma idioma, Idioma... idiomas);
    void setDadosFinanceiros(BigDecimal orcamento, BigDecimal receita);
    void setDadosTecnicos(String configAudio, String escala, Boolean coloracao);
    void comentarFilme(Usuario usuario, String conteudo);
    void adicionarLikeNoComentario(Integer id);
    void darNotaAoFilme(BigDecimal nota);
    BigDecimal mediaNotaDoFilme();

}
