package br.com.API.sade.endpoints;

import br.com.API.sade.dto.UsuarioDTO;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IUsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsuarioV1RS {

    private IUsuarioRepository clienteRepository;

    private UsuarioV1RS(IUsuarioRepository clienteRepository)
    {
        this.clienteRepository = clienteRepository;
    }
    //@CrossOrigin
    @RequestMapping(value = "criarUsuario", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criaUsuario(@RequestBody final Usuario body){

        clienteRepository.criarUsuario(body);


        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "criarUsuarioPj", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criarUsuarioPj(@RequestBody final Usuario body){

        var retorno = new Usuario(body.getLogin(), body.getNome(),
                body.getTelefone(), body.getEmail(), body.getSenha());


        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }



    @RequestMapping(value = "consultarUsuario", method = GET)
    public ResponseEntity<Usuario> pega(@RequestParam(value = "id", required = true) final Long id){

        var retorno = clienteRepository.buscarUsuarioPorIdV2(id);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
