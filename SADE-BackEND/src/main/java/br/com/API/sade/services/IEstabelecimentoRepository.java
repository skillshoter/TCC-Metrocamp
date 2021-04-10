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
    void criarEmpresa(Estabelecimento estabelecimento);
}
