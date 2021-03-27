package br.com.API.backendPacoca.controller;

import br.com.API.backendPacoca.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsuarioV1RS {


    private UsuarioV1RS()
    {

    }
    //@CrossOrigin
    @RequestMapping(value = "criaUsuario", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criaUsuario(@RequestBody final Usuario body){

        var retorno = new Usuario(body.getLogin(), body.getNome(),
                body.getTelefone(), body.getEmail(), body.getSenha());


        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }


    @RequestMapping(value = "consultarUsuario", method = GET)
    public ResponseEntity<Usuario> pega(){

        var usuario = new Usuario("Jose", "Nathan", 1999999,
                "nathan.gdavid@gmail.com", "123456798");
        var retorno = usuario;
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
