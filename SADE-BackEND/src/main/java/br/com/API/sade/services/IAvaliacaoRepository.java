package br.com.API.sade.services;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Estabelecimento;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IAvaliacaoRepository {

    void avaliarEstabelecimento(Long idEstabelecimento, Long idUsuario, Integer alcool_disponivel, Integer aglomeracao, Integer funcionarios_mascara,
                                Integer clientes_mascara, Integer circulacao_ar, Integer higienizacao, Integer controle_entrada, Integer limite_pessoas);
}
