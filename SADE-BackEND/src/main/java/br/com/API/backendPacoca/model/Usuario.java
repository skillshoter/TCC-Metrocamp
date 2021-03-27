package br.com.API.backendPacoca.model;


import org.intellij.lang.annotations.Pattern;
import org.springframework.beans.factory.annotation.Required;


public class Usuario {

    //private int id;

    @Pattern("")
    private String login;

    private String senha;

    @Pattern("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    private String nome;

    private String sobrenome;

    private int telefone;

    public Usuario(String login, String nome, int telefone, String email, String senha)
    {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.telefone = telefone;
        this.senha = senha;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    //@Column



}