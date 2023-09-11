package br.edu.fema.app;

import br.edu.fema.models.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil");
        Pais eua = new Pais("Estados Unidos");
        Usuario pedro = new Usuario("Pedro Oliveira", LocalDate.of(1998, Month.OCTOBER, 16)
        , "012pedropaulo@gmail.com", "ssepedroo", "10203040", LocalDateTime.now());
        Usuario quel  = new Usuario("Raquel Ramos", LocalDate.of(2004, Month.MAY, 11), null
        , null, null, LocalDateTime.now());
        Ator pacino = new Ator("Al Pacino", LocalDate.of(1940, Month.APRIL, 25),
                null, "@alpacino");
        Ator brando = new Ator("Marlon Brando", LocalDate.of(1924, Month.APRIL, 3),
                null, null);
        Ator caan = new Ator("James  Caan", LocalDate.of(1940, Month.MARCH, 26),
                null, null);
        Diretor coppola = new Diretor("Francis Coppola", LocalDate.of(1928,
                Month.JUNE, 27));
        Diretor tarantino = new Diretor("Quentin Tarantino", LocalDate.of(1963,
                Month.MARCH, 27));
        Autor puzo = new Autor("Mario Puzo", LocalDate.of(1920, Month.OCTOBER, 15));
        Personagem michael = new Personagem("Michael Corleone", pacino);
        Personagem sonny = new Personagem("Sonny Corleone", caan);
        Personagem don = new Personagem("Don Vito Corleone", brando);

        Filme poderosoChefao = new Filme("O Poderoso Chefão", "Uma família mafiosa luta para " +
                "estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. " +
                "Uma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e " +
                "força os filhos Michael e Sonny a assumir os negócios.", 1972, 175);


        poderosoChefao.adicionarAtor(pacino, brando, caan);
        poderosoChefao.adicionarGeneros(Genero.DRAMA);
        poderosoChefao.adicionarDiretores(coppola);
        poderosoChefao.adicionarClassificacao(new Classificacao("Para maiores de 18 anos", brasil));
        poderosoChefao.adicionarClassificacao(new Classificacao("R", eua));
        poderosoChefao.adicionarAutores(puzo);
        poderosoChefao.adicionarPersonagens(michael, sonny, don);
        poderosoChefao.setIdiomas(Idioma.INGLES, Idioma.ESPANHOL, Idioma.PORTUGUES);
        poderosoChefao.setDadosFinanceiros(new BigDecimal("600000"), new BigDecimal("250341816"));
        poderosoChefao.setDadosTecnicos("Mono - Dolby Digital", "1.85 : 1", true);
        poderosoChefao.comentarFilme(pedro, "Esse filme é excelente, uma obra de arte!");
        poderosoChefao.adicionarLikeNoComentario(0);
        poderosoChefao.adicionarLikeNoComentario(0);
        poderosoChefao.comentarFilme(quel, "Gostei muito não");
        poderosoChefao.darNotaAoFilme(new BigDecimal("10"));
        poderosoChefao.darNotaAoFilme(new BigDecimal("7"));


        System.out.println("-".repeat(150));
        System.out.println(poderosoChefao);

    }

}
