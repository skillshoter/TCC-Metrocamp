package br.com.API.sade.repository;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.model.Avaliacao;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IEstabelecimentoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EstabelecimentoRepository implements IEstabelecimentoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<EstabelecimentoDTO> buscarEstabelecimentoPorNome(String nome) {
        final String jpql = "SELECT NEW " + EstabelecimentoDTO.class.getName() +
                " (e.id, e.nome, e.endereco, e.alcool_disponivel," +
                "select sum a.aglomeracao/count e.aglomeracao, e.funcionarios_mascara, e.clientes_mascara," +
                " e.circulacao_ar, e.higienizacao, e.controle_entrada, e.limite_pessoas," +
                " e.avaliacao_geral, e.descricao)" +
                " FROM Estabelecimento as e WHERE e.nome = :nome";



        final var query = em.createQuery(jpql);
        query.setParameter("nome", nome);


        return query.getResultList();
    }

    @Override
    public Estabelecimento buscarEstabelecimentoPorId(Long id) {
        final String jpqlCount = "SELECT COUNT(a.id) from Avaliacao a where a.estabelecimento.id = :id";
        final var query = em.createQuery(jpqlCount);
        query.setParameter("id", id);

        query.getSingleResult();

        final var queryCount = em.createQuery(jpqlCount);

        return em.find(Estabelecimento.class, id);
    }

    @Override
    public List<EstabelecimentoDTO> buscarResumoPorNome(String nome) {
        final String jpql = "SELECT NEW " + EstabelecimentoDTO.class.getName() +
                " (e.id, e.nome, e.endereco," +
                " e.avaliacao_geral)" +
                " FROM Estabelecimento as e WHERE e.nome = :nome";

        final var query = em.createQuery(jpql);
        query.setParameter("nome", nome);


        return query.getResultList();
    }

    @Override
    public List<EstabelecimentoDTO> buscarResumoPorEndereco(String endereco) {
        final String jpql = "SELECT NEW " + EstabelecimentoDTO.class.getName() +
                " (e.id, e.nome, e.endereco," +
                " e.avaliacao_geral)" +
                " FROM Estabelecimento as e WHERE e.endereco = :endereco";

        final var query = em.createQuery(jpql);
        query.setParameter("endereco", endereco);


        return query.getResultList();
    }


    @Override
    public void criarEmpresa(Estabelecimento estabelecimento) {
        em.persist(estabelecimento);
    }

}