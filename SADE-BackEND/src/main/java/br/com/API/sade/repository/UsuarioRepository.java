package br.com.API.sade.repository;

import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IUsuarioRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioRepository implements IUsuarioRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<UsuarioDTO> buscarUsuarioporId(Long id) {
        final String jpql = "SELECT NEW " + UsuarioDTO.class.getName() +
                " (u.nome, u.email, u.telefone)" +
                " FROM Usuario AS u WHERE u.id = 2";

        final var query = em.createQuery(jpql);

        return query.getResultList();
    }

    @Override
    public void criarUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorIdV2(Long id){
        return em.find(Usuario.class, id);
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
