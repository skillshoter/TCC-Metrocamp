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

  teste1:any;
  teste2:any;
  teste3:any;
  teste4:any;
  teste5:any;
  teste6:any;
  teste7:any;
  teste8:any;
  teste9:any;
  teste10:any;
  teste11:any;
    

  ngOnInit() {
    console.log(this.route.snapshot.paramMap.getAll('billing')+' :resultado da tela anterior') 
    this.itemSend = this.route.snapshot.paramMap.getAll('billing')

    
    interface item {  id: String,title: String, description: String , nota: String };
    var obj:item = JSON.parse(this.itemSend)
    console.log(obj.id +' :objeto deserializado mostrando ID')
    console.log('usar API para pegar detalhes da empresa com o id: ' + obj.id)
    console.log('fazer get API')

    this.teste1 = 'poha1';
    this.teste2 = 'poha2';
    this.teste3 = 'poha3';
    this.teste4 = 'poha4';
    this.teste5 = 'poha5';
    this.teste6 = 'poha6';
    this.teste7 = 'poha7';
    this.teste8 = 'poha8';
    this.teste9 = 'poha9';
    this.teste10 = 'poha10';
    this.teste11 = 'poha11';
    
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
}
