package br.com.API.sade.model;


import org.intellij.lang.annotations.Pattern;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern("")
    @Column
    private String login;

    @Column
    private String senha;

    @Pattern("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    @Column
    private String email;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private long telefone;


    public Usuario() {
    }

    public Usuario(String login, String senha, String email, String nome, String sobrenome, long telefone) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public Usuario(String login, String nome, long telefone, String email, String senha)
    {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(Long id, String login, String senha, String email, String nome, String sobrenome, long telefone) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}