package br.edu.fema.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario extends Pessoa{
    private String email;
    private String login;
    private String senha;
    private LocalDateTime dataCadastro;

    public Usuario(String nome, LocalDate dataNascimento, String email,
                   String login, String senha, LocalDateTime dataCadastro) {
        super(nome, dataNascimento);
    }
}
