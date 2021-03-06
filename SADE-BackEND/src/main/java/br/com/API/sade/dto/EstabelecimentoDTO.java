package br.com.API.sade.dto;

import br.com.API.sade.model.Avaliacao;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class EstabelecimentoDTO {

    private Long id;

    private String nome;

    private String endereco;

    private Avaliacao avaliacao;

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

    public EstabelecimentoDTO(Long id, String nome, String endereco, Integer avaliacao_geral ) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao_geral = avaliacao_geral;
    }

    public EstabelecimentoDTO(Long id, String nome, String endereco, Long avaliacao_geral ) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao_geral = avaliacao_geral.intValue();

    }

    public EstabelecimentoDTO(Long id, String nome, String endereco, Avaliacao avaliacao ) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao = avaliacao;

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

    public EstabelecimentoDTO(Long id, String nome, String endereco,Long aglomeracao,
                              Long alcool_disponivel, Long funcionarios_mascara, Long clientes_mascara,
                              Long higienizacao, Long circulacao_ar, Long controle_entrada,
                              Long limite_pessoas, Long avaliacao_geral) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.alcool_disponivel = alcool_disponivel.intValue();
        this.aglomeracao = aglomeracao.intValue();
        this.funcionarios_mascara = funcionarios_mascara.intValue();
        this.clientes_mascara = clientes_mascara.intValue();
        this.circulacao_ar = circulacao_ar.intValue();
        this.higienizacao = higienizacao.intValue();
        this.controle_entrada = controle_entrada.intValue();
        this.limite_pessoas = limite_pessoas.intValue();
        this.avaliacao_geral = avaliacao_geral.intValue();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getAlcool_disponivel() {
        return alcool_disponivel;
    }

    public Integer getAglomeracao() {
        return aglomeracao;
    }

    public Integer getFuncionarios_mascara() {
        return funcionarios_mascara;
    }

    public Integer getClientes_mascara() {
        return clientes_mascara;
    }

    public Integer getCirculacao_ar() {
        return circulacao_ar;
    }

    public Integer getHigienizacao() {
        return higienizacao;
    }

    public Integer getControle_entrada() {
        return controle_entrada;
    }

    public Integer getLimite_pessoas() {
        return limite_pessoas;
    }

    public Integer getAvaliacao_geral() {
        return avaliacao_geral;
    }

    public String getDescricao() {
        return descricao;
    }
}