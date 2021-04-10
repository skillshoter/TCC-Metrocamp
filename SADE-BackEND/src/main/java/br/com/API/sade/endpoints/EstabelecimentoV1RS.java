package br.com.API.sade.endpoints;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.model.Usuario;
import br.com.API.sade.services.IEstabelecimentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoV1RS {

    private final IEstabelecimentoRepository estabelecimentoRepository;
    private EstabelecimentoV1RS(IEstabelecimentoRepository estabelecimentoRepository)
    {
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "criarEstabelecimento", consumes = {"application/json"}, method = POST)
    public ResponseEntity<String> criarEstabelecimento(@RequestBody final Estabelecimento body){
        estabelecimentoRepository.criarEmpresa(body);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "consultarEmpresa", method = GET)
    public ResponseEntity<List<EstabelecimentoDTO>> consultarEstabelecimento(@RequestParam(value = "nome", required = true) final String nome)
    {
    var retorno = estabelecimentoRepository.buscarEstabelecimentoPorNome(nome);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

}
