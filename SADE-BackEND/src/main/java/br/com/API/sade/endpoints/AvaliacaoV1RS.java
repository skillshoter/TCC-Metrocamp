package br.com.API.sade.endpoints;

import br.com.API.sade.services.IAvaliacaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/avaliar")
public class AvaliacaoV1RS {
    private final IAvaliacaoRepository avaliacaoRepository;
    private AvaliacaoV1RS(IAvaliacaoRepository avaliacaoRepository)
    {
        this.avaliacaoRepository = avaliacaoRepository;
    }


    @RequestMapping(value = "avaliarEstabelecimento", method = POST)
    public ResponseEntity<HttpStatus> avaliarEstabelecimento(@RequestParam(value = "idEstabelecimento") Long idEstabelecimento,
                                                             @RequestParam(value = "idUsuario") Long idUsuario,
                                                             @RequestParam(value = "alcool") Integer alcool,
                                                   @RequestParam(value = "aglomeracao")Integer aglomeracao,
                                                   @RequestParam(value = "funcionario")Integer funcionarios,
                                                   @RequestParam(value = "clientes")Integer clientes,
                                                   @RequestParam(value = "higienizacao") Integer higienizacao,
                                                   @RequestParam(value = "circulacao") Integer circulacao,
                                                   @RequestParam(value = "controle") Integer controle,
                                                   @RequestParam(value = "limite")Integer limite)
    {
        avaliacaoRepository.avaliarEstabelecimento(idEstabelecimento, idUsuario, alcool, aglomeracao, funcionarios,clientes,higienizacao,circulacao,controle,limite);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
