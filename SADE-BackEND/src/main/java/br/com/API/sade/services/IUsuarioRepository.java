package br.com.API.sade.services;

import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUsuarioRepository {

    List<UsuarioDTO> buscarUsuarioporId(Long Id);
    Usuario buscarUsuarioPorIdV2(Long id);
    boolean logar(String login, String senha);
    void criarUsuario(Usuario usuario);
}
