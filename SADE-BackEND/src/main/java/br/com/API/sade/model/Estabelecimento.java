package br.com.API.sade.model;


import org.intellij.lang.annotations.Pattern;

import javax.persistence.*;

//EMPRESA:
//ID, Nome, endereço, avaliação geral, descrição, boolean alcoolemgelnoambiente,
// FuncComMascaras booleano, clientesComMask boolean, aglomeracao bit, controle de entrada bit, limite de cliente bit,
//circulacaodeAr bit, higienizacao bit
@Entity
public class Estabelecimento {

    //getNome da Empresa ou CNPJ ou Endereço
    //RETORNA ID, NOME DA EMPRESA, ENDEREÇO, AVALIACAO GERAL

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Pattern("")
    private String nome;

    @Column
    private String endereco;

    @Column
    private int alcool_disponivel;

    @Column
    private int aglomeracao;

    @Column
    private int funcionarios_mascara;

    @Column
    private int clientes_mascara;

    @Column
    private int circulacao_ar;

    @Column
    private int higienizacao;

    @Column
    private int controle_entrada;

    @Column
    private int limite_pessoas;

    @Column
    private int avaliacao_geral;

    @Pattern("")
    private String descricao;


    public Estabelecimento(String nome, String endereco, int alcool_disponivel,
                           int aglomeracao, int funcionarios_mascara,
                           int clientes_mascara, int circulacao_ar, int higienizacao,
                           int controle_entrada, int limite_pessoas,
                           int avaliacao_geral, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.alcool_disponivel = alcool_disponivel;
        this.aglomeracao = aglomeracao;
        this.funcionarios_mascara = funcionarios_mascara;
        this.clientes_mascara = clientes_mascara;
        this.circulacao_ar = circulacao_ar;
        this.higienizacao = higienizacao;
        this.controle_entrada = controle_entrada;
        this.limite_pessoas = limite_pessoas;
        this.avaliacao_geral = avaliacao_geral;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAlcool_disponivel() {
        return alcool_disponivel;
    }

    public void setAlcool_disponivel(int alcool_disponivel) {
        this.alcool_disponivel = alcool_disponivel;
    }

    public int getAglomeracao() {
        return aglomeracao;
    }

    public void setAglomeracao(int aglomeracao) {
        this.aglomeracao = aglomeracao;
    }

    public int getFuncionarios_mascara() {
        return funcionarios_mascara;
    }

    public void setFuncionarios_mascara(int funcionarios_mascara) {
        this.funcionarios_mascara = funcionarios_mascara;
    }

    public int getClientes_mascara() {
        return clientes_mascara;
    }

    public void setClientes_mascara(int clientes_mascara) {
        this.clientes_mascara = clientes_mascara;
    }

    public int getCirculacao_ar() {
        return circulacao_ar;
    }

    public void setCirculacao_ar(int circulacao_ar) {
        this.circulacao_ar = circulacao_ar;
    }

    public int getHigienizacao() {
        return higienizacao;
    }

    public void setHigienizacao(int higienizacao) {
        this.higienizacao = higienizacao;
    }

    public int getControle_entrada() {
        return controle_entrada;
    }

    public void setControle_entrada(int controle_entrada) {
        this.controle_entrada = controle_entrada;
    }

    public int getLimite_pessoas() {
        return limite_pessoas;
    }

    public void setLimite_pessoas(int limite_pessoas) {
        this.limite_pessoas = limite_pessoas;
    }

    public int getAvaliacao_geral() {
        return avaliacao_geral;
    }

    public void setAvaliacao_geral(int avaliacao_geral) {
        this.avaliacao_geral = avaliacao_geral;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}