package br.com.API.sade.endpoints;

import br.com.API.sade.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class EmpresaV1RS {


    private EmpresaV1RS()
    {

    }
    //@CrossOrigin
    @RequestMapping(value = "criarEmpresa", consumes = {"application/json"}, method = POST)
    public ResponseEntity<Usuario> criarEmpresa(@RequestBody final Usuario body){

        var retorno = new Usuario(body.getLogin(), body.getNome(),
                body.getTelefone(), body.getEmail(), body.getSenha());


        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }


    @RequestMapping(value = "consultarEmpresa", method = GET)
    public ResponseEntity<Usuario> pega(@RequestAttribute final Usuario body){

        var usuario = new Usuario("Jose", "Nathan", 1999999,
                "nathan.gdavid@gmail.com", "123456798");
        var retorno = usuario;
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
