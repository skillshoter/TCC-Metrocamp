package br.com.API.sade.model;


import org.intellij.lang.annotations.Pattern;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    private String cnpj;

    private String endereco;

    private String nomeFantasia;

    private String razaoSocial;

    private int telefone;




}