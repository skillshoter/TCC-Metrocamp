package br.com.API.sade.model;


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


    private String nome;

    @Column
    private String endereco;

    @Column
    private Integer alcool_disponivel;

    @Column
    private Integer aglomeracao;

    @Column
    private Integer funcionarios_mascara;

    @Column
    private Integer clientes_mascara;

    @Column
    private Integer circulacao_ar;

    @Column
    private Integer higienizacao;

    @Column
    private Integer controle_entrada;

    @Column
    private Integer limite_pessoas;

    @Column
    private Integer avaliacao_geral;

    private String descricao;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String endereco, Integer alcool_disponivel,
                           Integer aglomeracao, Integer funcionarios_mascara,
                           Integer clientes_mascara, Integer circulacao_ar, Integer higienizacao,
                           Integer controle_entrada, Integer limite_pessoas,
                           Integer avaliacao_geral, String descricao) {
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

    public Integer getAlcool_disponivel() {
        return alcool_disponivel;
    }

    public void setAlcool_disponivel(Integer alcool_disponivel) {
        this.alcool_disponivel = alcool_disponivel;
    }

    public Integer getAglomeracao() {
        return aglomeracao;
    }

    public void setAglomeracao(Integer aglomeracao) {
        this.aglomeracao = aglomeracao;
    }

    public Integer getFuncionarios_mascara() {
        return funcionarios_mascara;
    }

    public void setFuncionarios_mascara(Integer funcionarios_mascara) {
        this.funcionarios_mascara = funcionarios_mascara;
    }

    public Integer getClientes_mascara() {
        return clientes_mascara;
    }

    public void setClientes_mascara(Integer clientes_mascara) {
        this.clientes_mascara = clientes_mascara;
    }

    public Integer getCirculacao_ar() {
        return circulacao_ar;
    }

    public void setCirculacao_ar(Integer circulacao_ar) {
        this.circulacao_ar = circulacao_ar;
    }

    public Integer getHigienizacao() {
        return higienizacao;
    }

    public void setHigienizacao(Integer higienizacao) {
        this.higienizacao = higienizacao;
    }

    public Integer getControle_entrada() {
        return controle_entrada;
    }

    public void setControle_entrada(Integer controle_entrada) {
        this.controle_entrada = controle_entrada;
    }

    public Integer getLimite_pessoas() {
        return limite_pessoas;
    }

    public void setLimite_pessoas(Integer limite_pessoas) {
        this.limite_pessoas = limite_pessoas;
    }

    public Integer getAvaliacao_geral() {
        return avaliacao_geral;
    }

    public void setAvaliacao_geral(Integer avaliacao_geral) {
        this.avaliacao_geral = avaliacao_geral;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}