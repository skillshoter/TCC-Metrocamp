package br.com.API.sade.endpoints;

import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IUsuarioRepository;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@EnableWebMvc
@EnableSpringDataWebSupport
@RequestMapping("/users")
public class UsuarioV1RS {

    private IUsuarioRepository usuarioRepository;

    private UsuarioV1RS(IUsuarioRepository clienteRepository)
    {
        this.usuarioRepository = clienteRepository;
    }

    @RequestMapping(value = "criarUsuario", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criaUsuario(@RequestBody final Usuario body){

        usuarioRepository.criarUsuario(body);


        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "login", consumes = {"application/json"}, method = GET)
    public ResponseEntity<Boolean> criaUsuario(@RequestParam String login, String senha){

        final var retorno = usuarioRepository.logar(login,senha)?true:false ;


        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

    @RequestMapping(value = "criarUsuarioPj", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criarUsuarioPj(@RequestBody final Usuario body){

        var retorno = new Usuario(body.getLogin(), body.getNome(),
                body.getTelefone(), body.getEmail(), body.getSenha());


        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }



    @RequestMapping(value = "consultarUsuario", method = GET)
    public ResponseEntity<Usuario> consultarUsuario(@RequestParam(value = "id", required = true) final Long id){

        var retorno = usuarioRepository.buscarUsuarioPorIdV2(id);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
