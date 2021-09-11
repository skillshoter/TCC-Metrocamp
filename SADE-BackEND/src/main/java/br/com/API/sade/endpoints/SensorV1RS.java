package br.com.API.sade.endpoints;

import br.com.API.sade.services.IUsuarioRepository;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@EnableWebMvc
@EnableSpringDataWebSupport
@RequestMapping("/update-sensor")
public class SensorV1RS {

    private IUsuarioRepository usuarioRepository;

    @RequestMapping(consumes = {"application/json"}, method = POST)
    public ResponseEntity<String> criarUsuarioPj(@RequestParam final String sensor,
                                                  @RequestParam final String temperatura,
                                                  @RequestParam final String pressao,
                                                  @RequestParam final String random){
        System.out.println("BATEU");
        var retorno = "SENSOR:"+sensor+"\nTEMPERATURA:"+temperatura+"\nPRESSAO:"+pressao+"\nRANDOM:"+random;
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
