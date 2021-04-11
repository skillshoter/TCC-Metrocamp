package br.com.API.sade.repository;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IEstabelecimentoRepository;
import br.com.API.sade.services.IUsuarioRepository;
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
    /*
    @Override
    public List<UsuarioDTO> buscarEmpresaPorId(Long id) {
        final String jpql = "SELECT NEW " + UsuarioDTO.class.getName() +
                " (u.nome, u.email, u.telefone)" +
                " FROM Usuario AS u WHERE u.id = 2";

        final var query = em.createQuery(jpql);

        return query.getResultList();
    }
    */

    @Override
    public List<UsuarioDTO> buscarUsuarioPorId(Long Id) {
        return null;
    }

    @Override
    public List<EstabelecimentoDTO> buscarEstabelecimentoPorNome(String nome) {
        final String jpql = "SELECT NEW " + EstabelecimentoDTO.class.getName() +
                " (e.id, e.nome, e.endereco, e.alcool_disponivel," +
                " e.aglomeracao, e.funcionarios_mascara, e.clientes_mascara," +
                " e.circulacao_ar, e.higienizacao, e.controle_entrada, e.limite_pessoas," +
                " e.avaliacao_geral, e.descricao)" +
                " FROM Estabelecimento as e WHERE e.nome = :nome";

        final var query = em.createQuery(jpql);
        query.setParameter("nome", nome);


        return query.getResultList();
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
    public void criarEmpresa(Estabelecimento estabelecimento) {
        em.persist(estabelecimento);
    }

    @Override
    public void avaliarEstabelecimento(Long id, Integer alcool_disponivel, Integer aglomeracao, Integer funcionarios_mascara, Integer clientes_mascara,
                                       Integer circulacao_ar, Integer higienizacao, Integer controle_entrada, Integer limite_pessoas) {
        var estabelecimento = em.find(Estabelecimento.class, id);
        estabelecimento.setAlcool_disponivel(alcool_disponivel);
        estabelecimento.setAglomeracao(aglomeracao);
        estabelecimento.setFuncionarios_mascara(funcionarios_mascara);
        estabelecimento.setClientes_mascara(clientes_mascara);
        estabelecimento.setHigienizacao(higienizacao);
        estabelecimento.setCirculacao_ar(circulacao_ar);
        estabelecimento.setControle_entrada(controle_entrada);
        estabelecimento.setLimite_pessoas(limite_pessoas);
        em.merge(estabelecimento);
    }

}

    /*

    package br.com.confidencecambio.persistencia.repository;

import br.com.confidencecambio.exceptions.PaisInvalidoException;
import br.com.confidencecambio.persistencia.repository.dto.PaisesMonitoradosDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaisesMonitoradosRepositoryBean implements IPaisesMonitoradosRepository {

    private static int TAMANHO_ISO = 3;
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<PaisesMonitoradosDTO> buscaPaisMonitoradoPeloIso(final String codigoIso) {
        verificaIsoPais(codigoIso);
        final String jpql = "SELECT NEW " + PaisesMonitoradosDTO.class.getName() +
                "(CASE WHEN p.fatfgafi=1 THEN p.fatfgafi ELSE NULL END AS fatfgafi," +
                "CASE WHEN p.ofac =1 THEN p.ofac  ELSE NULL END AS ofac," +
                "CASE WHEN p.onu=1 THEN p.onu ELSE NULL END AS onu," +
                "CASE WHEN p.ue =1 THEN p.ue else NULL END AS ue," +
                "CASE WHEN p.outros=1 THEN p.outros ELSE NULL END AS outros," +
                "p.restrito, p.codigoIso, p.nomePais)" +
                "from PaisesMonitorados as p WHERE p.codigoIso =:codigoIso";

        final var query = em.createQuery(jpql);
        query.setParameter("codigoIso", codigoIso);
        return query.getResultList();
    }

    @Override
    public List<PaisesMonitoradosDTO> buscaPaisesMonitorados() {
        final String jpql = "SELECT NEW " + PaisesMonitoradosDTO.class.getName() +
                "(CASE WHEN p.fatfgafi=1 THEN p.fatfgafi ELSE NULL END AS fatfgafi," +
                "CASE WHEN p.ofac =1 THEN p.ofac  ELSE NULL END AS ofac," +
                "CASE WHEN p.onu=1 THEN p.onu ELSE NULL END AS onu," +
                "CASE WHEN p.ue =1 THEN p.ue else NULL END AS ue," +
                "CASE WHEN p.outros=1 THEN p.outros ELSE NULL END AS outros," +
                "p.restrito, p.codigoIso, p.nomePais)" +
                "from PaisesMonitorados as p ";
        final var query = em.createQuery(jpql);
        return query.getResultList();
    }

    private boolean verificaIsoPais(final String codigoIso) {
        if (codigoIso.length() == TAMANHO_ISO) {
            return true;
        }
        else {
            throw new PaisInvalidoException("Deve ser de tamanho 3 ou nulo.");
        }
    }
}
     */
