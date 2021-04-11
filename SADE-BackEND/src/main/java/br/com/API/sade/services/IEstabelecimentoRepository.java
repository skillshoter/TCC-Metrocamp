package br.com.API.sade.services;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IEstabelecimentoRepository {

    List<UsuarioDTO> buscarUsuarioPorId(Long Id);
    List<EstabelecimentoDTO> buscarEstabelecimentoPorNome(String nome);
    List<EstabelecimentoDTO> buscarResumoPorNome(String nome);
    void criarEmpresa(Estabelecimento estabelecimento);
    void avaliarEstabelecimento(Long id, Integer alcool_disponivel, Integer aglomeracao, Integer funcionarios_mascara, Integer clientes_mascara,
                                Integer circulacao_ar, Integer higienizacao, Integer controle_entrada, Integer limite_pessoas);
}
