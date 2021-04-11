package br.com.API.sade.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class EstabelecimentoDTO {

    private Long id;

    private String nome;

    private String endereco;

    private Integer alcool_disponivel;

    private Integer aglomeracao;

    private Integer funcionarios_mascara;

    private Integer clientes_mascara;

    private Integer circulacao_ar;

    private Integer higienizacao;

    private Integer controle_entrada;

    private Integer limite_pessoas;

    private Integer avaliacao_geral;

    private String descricao;

    //getNome da Empresa ou CNPJ ou Endereço
    //RETORNA ID, NOME DA EMPRESA, ENDEREÇO, AVALIACAO GERAL

    public EstabelecimentoDTO(Long id, String nome, String endereco, Integer avaliacao_geral ) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao_geral = avaliacao_geral;

    }
    public EstabelecimentoDTO(Long id, String nome, String endereco, Integer alcool_disponivel,
                              Integer aglomeracao, Integer funcionarios_mascara, Integer clientes_mascara,
                              Integer circulacao_ar, Integer higienizacao, Integer controle_entrada,
                              Integer limite_pessoas, Integer avaliacao_geral, String descricao) {
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