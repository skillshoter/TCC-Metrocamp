import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'app-detalhes-principal',
  templateUrl: './detalhes-principal.page.html',
  styleUrls: ['./detalhes-principal.page.scss'],
})
export class DetalhesPrincipalPage implements OnInit {

  constructor(private route: ActivatedRoute) { }

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

  ngOnInit() {
    console.log(this.route.snapshot.paramMap.getAll('billing')+' :resultado da tela anterior') 
    this.itemSend = this.route.snapshot.paramMap.getAll('billing')

    
    interface item {  id: Number,title: String, description: String , avaliacao_geral: Number };
    var obj:item = JSON.parse(this.itemSend)
    console.log(obj.id +' :objeto deserializado mostrando ID da empresa')
    console.log('usar API para pegar detalhes da empresa com o id da empresa: ' + obj.id)
    console.log('fazer get API')
    //API GET

    this.nomeEmpresalbl = 'Anchovas de portugual estremesse as novinhas que traficam na rua';
    this.descricaolbl = 'valor vindo do bac2';
    this.notaGerallbl = 34;
    this.alcoolGellbl = 10;
    this.funcionarioMasklbl = 12;
    this.clientesMasclbl = 12;
    this.aglomeracaoReclbl = 10;
    this.controlEntradalbl = 90;
    this.limiteClientelbl = 90;
    this.ambienteCirculacaolbl = 90;
    this.higienizacaoAmbientelbl = 90;
    
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
    console.log(this.gelAmbiente + ' gelAmbiente');
    console.log(this.funcMask + ' funcMask');
    console.log(this.cliMask + ' cliMask');
    console.log(this.agloRec + ' agloRec');
    console.log(this.contrEntrada + ' contrEntrada');
    console.log(this.limClient + ' limClient');
    console.log(this.ambClient + ' ambClient');
    console.log(this.higAmbiente + ' higAmbiente');

    if((this.higAmbiente == undefined)||(this.ambClient == undefined)||(this.limClient == undefined)||(this.gelAmbiente == undefined)||(this.funcMask == undefined)||(this.cliMask == undefined)||(this.agloRec == undefined)||(this.contrEntrada == undefined)){
      alert("Marque todos os campos!")
    }else
    {
      //enviar os radio para banco pela API
      alert("envia dados API para insert de novas informaçoes")
      //API PUT
    }
    
  }
}
