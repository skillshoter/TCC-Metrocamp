package br.com.API.sade.dto;


public class UsuarioDTO {




    private String email;

    private String nome;

    private int telefone;

    public UsuarioDTO(String nome, String email, int telefone)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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


    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    //@Column



}