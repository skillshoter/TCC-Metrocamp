package br.com.API.sade.endpoints;

import br.com.API.sade.dto.EstabelecimentoDTO;
import br.com.API.sade.model.Estabelecimento;
import br.com.API.sade.services.IEstabelecimentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//25.91.152.90:8080//estabelecimentos/consultarEstabelecimentoResumo
@CrossOrigin
@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoV1RS {

    private final IEstabelecimentoRepository estabelecimentoRepository;
    private EstabelecimentoV1RS(IEstabelecimentoRepository estabelecimentoRepository)
    {
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

    @RequestMapping(value = "criarEstabelecimento", consumes = {"application/json"}, method = POST)
    public ResponseEntity<String> criarEstabelecimento(@RequestBody final Estabelecimento body){
        estabelecimentoRepository.criarEmpresa(body);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "consultarEstabelecimentoCompleto", method = GET)
    public ResponseEntity<List<EstabelecimentoDTO>> consultarEstabelecimento(@RequestParam(value = "nome", required = true) final String nome)
    {
    var retorno = estabelecimentoRepository.buscarEstabelecimentoPorNome(nome);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

    @RequestMapping(value = "consultarEstabelecimentoResumo", method = GET)
    public ResponseEntity<List<EstabelecimentoDTO>> consultarEstabelecimentoResumo(@RequestParam(value = "nome", required = false) final String nome,
                                                                                   @RequestParam(value = "endereco", required = false) final String endereco)
    {
        List<EstabelecimentoDTO> retorno = new ArrayList<>();
        if(nome!=null && !nome.isEmpty()) {
            estabelecimentoRepository.buscarResumoPorNome(nome).stream().forEach(e-> retorno.add(e));
        }
        if (endereco != null && !endereco.isEmpty() ){
            estabelecimentoRepository.buscarResumoPorEndereco(endereco).stream().forEach(e-> retorno.add(e));;
        }
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

    @RequestMapping(value = "avaliarEstabelecimento", method = PUT)
    public ResponseEntity<HttpStatus> avaliarEstabelecimento(@RequestParam(value = "id") Long id,
                                                   @RequestParam(value = "alcool") Integer alcool,
                                                   @RequestParam(value = "aglomeracao")Integer aglomeracao,
                                                   @RequestParam(value = "funcionario")Integer funcionarios,
                                                   @RequestParam(value = "clientes")Integer clientes,
                                                   @RequestParam(value = "higienizacao") Integer higienizacao,
                                                   @RequestParam(value = "circulacao") Integer circulacao,
                                                   @RequestParam(value = "controle") Integer controle,
                                                   @RequestParam(value = "limite")Integer limite)
    {
        estabelecimentoRepository.avaliarEstabelecimento(id, alcool, aglomeracao, funcionarios,clientes,higienizacao,circulacao,controle,limite);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
