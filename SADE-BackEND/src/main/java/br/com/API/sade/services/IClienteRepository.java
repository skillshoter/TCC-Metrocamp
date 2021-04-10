package br.com.API.sade.services;

import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IClienteRepository {

    public List<UsuarioDTO> buscarUsuarioporId(Long Id);
    public void criarUsuario(String login, String nome,
                int telefone, String email, String senha);
}
