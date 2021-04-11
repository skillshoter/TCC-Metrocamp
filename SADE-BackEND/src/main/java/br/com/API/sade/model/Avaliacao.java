package br.com.API.sade.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_cliente", nullable=false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_estabelecimento", nullable=false)
    private Estabelecimento estabelecimento;

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


    public Avaliacao() {
    }

    public Avaliacao(Long id, Usuario usuario, Estabelecimento estabelecimento,
                     Integer alcool_disponivel, Integer aglomeracao, Integer funcionarios_mascara,
                     Integer clientes_mascara, Integer circulacao_ar, Integer higienizacao,
                     Integer controle_entrada, Integer limite_pessoas, Integer avaliacao_geral) {
        this.id = id;
        this.usuario = usuario;
        this.estabelecimento = estabelecimento;
        this.alcool_disponivel = alcool_disponivel;
        this.aglomeracao = aglomeracao;
        this.funcionarios_mascara = funcionarios_mascara;
        this.clientes_mascara = clientes_mascara;
        this.circulacao_ar = circulacao_ar;
        this.higienizacao = higienizacao;
        this.controle_entrada = controle_entrada;
        this.limite_pessoas = limite_pessoas;
        this.avaliacao_geral = avaliacao_geral;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Avaliacao)) return false;
        Avaliacao avaliacao = (Avaliacao) o;
        return Objects.equals(getId(), avaliacao.getId()) && Objects.equals(getUsuario(), avaliacao.getUsuario()) && Objects.equals(getEstabelecimento(), avaliacao.getEstabelecimento()) && Objects.equals(getAlcool_disponivel(), avaliacao.getAlcool_disponivel()) && Objects.equals(getAglomeracao(), avaliacao.getAglomeracao()) && Objects.equals(getFuncionarios_mascara(), avaliacao.getFuncionarios_mascara()) && Objects.equals(getClientes_mascara(), avaliacao.getClientes_mascara()) && Objects.equals(getCirculacao_ar(), avaliacao.getCirculacao_ar()) && Objects.equals(getHigienizacao(), avaliacao.getHigienizacao()) && Objects.equals(getControle_entrada(), avaliacao.getControle_entrada()) && Objects.equals(getLimite_pessoas(), avaliacao.getLimite_pessoas()) && Objects.equals(getAvaliacao_geral(), avaliacao.getAvaliacao_geral());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsuario(), getEstabelecimento(), getAlcool_disponivel(), getAglomeracao(), getFuncionarios_mascara(), getClientes_mascara(), getCirculacao_ar(), getHigienizacao(), getControle_entrada(), getLimite_pessoas(), getAvaliacao_geral());
    }
}