package br.com.API.sade.dto;


public class EstabelecimentoDTO {

    private Long id;

    private String nome;

    private String endereco;

    private int alcool_disponivel;

    private int aglomeracao;

    private int funcionarios_mascara;

    private int clientes_mascara;

    private int circulacao_ar;

    private int higienizacao;

    private int controle_entrada;

    private int limite_pessoas;

    private int avaliacao_geral;

    private String descricao;

    public EstabelecimentoDTO(Long id, String nome, String endereco, int alcool_disponivel,
                              int aglomeracao, int funcionarios_mascara, int clientes_mascara,
                              int circulacao_ar, int higienizacao, int controle_entrada,
                              int limite_pessoas, int avaliacao_geral, String descricao) {
        this.id = id;
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
}