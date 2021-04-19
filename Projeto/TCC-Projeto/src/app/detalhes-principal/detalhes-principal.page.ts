import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'
import { HttpClient } from '@angular/common/http';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-detalhes-principal',
  templateUrl: './detalhes-principal.page.html',
  styleUrls: ['./detalhes-principal.page.scss'],
})
export class DetalhesPrincipalPage implements OnInit {

  constructor(public http: HttpClient,private route: ActivatedRoute) { }

  public itemSend: any;
  nomeEmpresalbl:any;
  descricaolbl:any;
  notaGerallbl:any;
  alcoolGellbl:any;
  funcionarioMasklbl:any;
  clientesMasclbl:any;
  aglomeracaoReclbl:any;
  controlEntradalbl:any;
  limiteClientelbl:any;
  ambienteCirculacaolbl:any;
  higienizacaoAmbientelbl:any;
  gelAmbiente:any;
  funcMask:any;
  cliMask:any;
  agloRec:any;
  contrEntrada:any;
  limClient:any;
  ambClient:any;
  higAmbiente:any;
  empresa:any;
  itemGrid:any;
  idEmpresa:any;

  isCollapsed = false;

  ngOnInit() {
    interface obj {
      id: number;
      nome: string;
      endereco: string;
      alcool_disponivel: number;
      funcionarios_mascara:number;
      circulacao_ar:number;
      higienizacao:number;
      controle_entrada:number;
      limite_pessoas:number;
      avaliacao_geral:number;
      descricao:number;
      clientes_mascara:number;
      notageral:number;
      aglomeracao:number;
  }

    console.log(this.route.snapshot.paramMap.getAll('billing')+' :resultado da tela anterior') 
    this.itemSend = this.route.snapshot.paramMap.getAll('billing')

    
    interface item {  id: Number,title: String, description: String , avaliacao_geral: Number };
    var obj:item = JSON.parse(this.itemSend)
    console.log(obj.id +' :objeto deserializado mostrando ID da empresa')
    console.log('usar API para pegar detalhes da empresa com o id da empresa: ' + obj.id)
    console.log('fazer get API  --------------')
    this.http.get<obj>('http://25.91.152.90:8080/estabelecimentos/consultarEstabelecimentoCompletoPorId?id='+obj.id).subscribe((data)=> {
        this.empresa = data;
        if(Object.keys(data).length === 0)
        {
          alert("Não existe detalhes desta empresa com estes parametros ");
        }else
        {
            this.idEmpresa = data.id;
            this.nomeEmpresalbl = data.nome;
            this.descricaolbl =  data.descricao;
            this.notaGerallbl = data.avaliacao_geral;
            this.alcoolGellbl = data.alcool_disponivel;
            this.funcionarioMasklbl = data.funcionarios_mascara;
            this.clientesMasclbl = data.clientes_mascara;
            this.aglomeracaoReclbl = data.aglomeracao;
            this.controlEntradalbl = data.controle_entrada;
            this.limiteClientelbl = data.limite_pessoas;
            this.ambienteCirculacaolbl = data.circulacao_ar;
            this.higienizacaoAmbientelbl =data.higienizacao;
            
        }
      },(error)=> {
        console.log(error);
        alert("Consulta a API não encontrou o endereço.");
        this.nomeEmpresalbl = 'Dados mocados';
        this.descricaolbl = 'valor vindo do moc';
        this.notaGerallbl = 34;
        this.alcoolGellbl = 10;
        this.funcionarioMasklbl = 12;
        this.clientesMasclbl = 12;
        this.aglomeracaoReclbl = 10;
        this.controlEntradalbl = 90;
        this.limiteClientelbl = 90;
        this.ambienteCirculacaolbl = 90;
        this.higienizacaoAmbientelbl = 90;
        var result_style = document.getElementById('trGrid').style;
        result_style.display = 'flex'; 
      });

    document.getElementById('inputTeste1').setAttribute("disabled","disabled");
    document.getElementById('inputTeste2').setAttribute("disabled","disabled");
    
    document.getElementById('inputTeste3').setAttribute("disabled","disabled");
    document.getElementById('inputTeste4').setAttribute("disabled","disabled");
    
    document.getElementById('inputTeste5').setAttribute("disabled","disabled");
    document.getElementById('inputTeste6').setAttribute("disabled","disabled");
    
    document.getElementById('inputTeste7').setAttribute("disabled","disabled");
    document.getElementById('inputTeste8').setAttribute("disabled","disabled");
    
    document.getElementById('inputTeste9').setAttribute("disabled","disabled");
    document.getElementById('inputTeste10').setAttribute("disabled","disabled");

    document.getElementById('inputTeste11').setAttribute("disabled","disabled");

  }

  private isButtonVisible = false;
 
  habilitaPizza(event:any)
  {
    if(this.isButtonVisible)
    {//detalhes
      this.isButtonVisible = false;
      document.getElementById('divDetalhes').style.display='block';
      document.getElementById('habPizza').style.backgroundColor = 'darkgreen';
      var text = document.getElementById('habPizza').innerHTML = 'Avalie';
    }else
    {//avalia
      this.isButtonVisible = true;
      document.getElementById('divDetalhes').style.display='none';
      document.getElementById('divDetalhes').style.display='none';
      document.getElementById('habPizza').style.backgroundColor = 'red';
      var text = document.getElementById('habPizza').innerHTML = 'Detalhes';
      
    } 
  }

  

  avaliaEmpresa(event:any)
  {
   // console.log(this.gelAmbiente + ' gelAmbiente');
   // console.log(this.funcMask + ' funcMask');
   // console.log(this.cliMask + ' cliMask');
   // console.log(this.agloRec + ' agloRec');
   // console.log(this.contrEntrada + ' contrEntrada');
   // console.log(this.limClient + ' limClient');
   // console.log(this.ambClient + ' ambClient');
   // console.log(this.higAmbiente + ' higAmbiente');

    if((this.higAmbiente == undefined)||(this.ambClient == undefined)||(this.limClient == undefined)||(this.gelAmbiente == undefined)||(this.funcMask == undefined)||(this.cliMask == undefined)||(this.agloRec == undefined)||(this.contrEntrada == undefined)){
      alert("Marque todos os campos!")
    }else
    {
      //enviar os radio para banco pela API
      console.log(this.idEmpresa + ' :ID empresa');
      alert("envia dados API para insert de novas informaçoes")

      const obj = { 
        idEstabelecimento:Number(this.idEmpresa),
        idUsuario:Number(3),//pegar no sistema
        alcool: Number(this.gelAmbiente),
        aglomeracao:Number(this.agloRec),
        funcionario: Number(this.funcMask),
        clientes: Number(this.cliMask),
        higienizacao: Number(this.higAmbiente),
        circulacao: Number(this.ambClient),
        controle: Number(this.contrEntrada),
        limite:Number(this.limClient)
       };
       
      const  requestUrl = 'http://25.91.152.90:8080/avaliar/avaliarEstabelecimento?idEstabelecimento='+this.idEmpresa+'&idUsuario='+3+
      '&alcool='+this.gelAmbiente+'&aglomeracao='+this.agloRec+'&funcionario='+this.funcMask+'&clientes='+this.cliMask+
      '&higienizacao='+this.higAmbiente+'&circulacao='+this.ambClient+'&controle='+this.contrEntrada+'&limite='+this.limClient;


      this.http.post(requestUrl, { headers: { 'Content-Type': 'application/json' } }).subscribe(
        (val) => {
            console.log("POST call successful value returned in body", 
                        val);
                        alert('Avaliação Realizada');
        },
        response => {
            console.log("POST call in error", response);
        },
        () => {
            console.log("The POST observable is now completed.");
        });
      
    }
    
  }
}
