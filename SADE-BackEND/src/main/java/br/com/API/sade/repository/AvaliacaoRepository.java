package br.com.API.sade.repository;

import br.com.API.sade.model.Avaliacao;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IAvaliacaoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AvaliacaoRepository implements IAvaliacaoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void avaliarEstabelecimento(Long idEstabelecimento, Long idUsuario, Integer alcool_disponivel, Integer aglomeracao, Integer funcionarios_mascara, Integer clientes_mascara,
                                       Integer circulacao_ar, Integer higienizacao, Integer controle_entrada, Integer limite_pessoas) {
        var estabelecimento = em.find(Estabelecimento.class, idEstabelecimento);
        var usuario = em.find(Usuario.class,idUsuario);
        Avaliacao avaliacao = new Avaliacao();

        avaliacao.setUsuario(usuario);
        avaliacao.setEstabelecimento(estabelecimento);
        avaliacao.setAlcool_disponivel(alcool_disponivel);
        avaliacao.setAglomeracao(aglomeracao);
        avaliacao.setFuncionarios_mascara(funcionarios_mascara);
        avaliacao.setClientes_mascara(clientes_mascara);
        avaliacao.setHigienizacao(higienizacao);
        avaliacao.setCirculacao_ar(circulacao_ar);
        avaliacao.setControle_entrada(controle_entrada);
        avaliacao.setLimite_pessoas(limite_pessoas);
        em.merge(avaliacao);
    }

}

