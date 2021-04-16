import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AngularDelegate } from '@ionic/angular';


@Component({
  selector: 'app-principal',
  templateUrl: './principal.page.html',
  styleUrls: ['./principal.page.scss'],
})
export class PrincipalPage implements OnInit {

  constructor(public http: HttpClient, private route: Router) { }

  ngOnInit() {
    //this.setDimension();//remover apenas para teste
  }
  
   NameEmpresa:any;
  CnpjEmpresa:any;
  Endereco:any;
  EmpresasList:any;


  pesquisar(event:any)
  {
      this.http.get('http://25.91.152.90:8080/estabelecimentos/consultarEstabelecimentoResumo?nome='+this.NameEmpresa+'&endereco='+this.Endereco).subscribe((data)=> {
        this.EmpresasList = data;
        if(Object.keys(data).length === 0)
        {
          alert("Não existe Empresa com estes parametros");
        }else
        {
          this.ionViewDidLoadDefinitivo(data);
        }
      },(error)=> {
        console.log(error);
        alert("Consulta a API não encontrou o endereço.");
        this.ionViewDidLoad();//remover
        var result_style = document.getElementById('trGrid').style;
        result_style.display = 'flex'; 
      });
  }


  public items:Array<any>;

  ionViewDidLoadDefinitivo(data:Object) {
    var itemss = [];
    //SERIALIZAR JSON PARA OBJ
    Object.keys(data).forEach(function(key) {
      console.log('Key : ' + key + ', Value : ' + data[key].id)
      console.log('Key : ' + key + ', Value : ' + data[key].nome)
      console.log('Key : ' + key + ', Value : ' + data[key].endereco)
      console.log('Key : ' + key + ', Value : ' + data[key].avaliacao_geral)
      console.log('proximo')
      console.log(data[key].id,  data[key].nome, data[key].endereco, data[key].avaliacao_geral)

      var itemGrid = { id:data[key].id,  nome:data[key].nome, endereco:data[key].endereco, avaliacao_geral:data[key].avaliacao_geral }

      itemss.push(itemGrid);//testar

      console.log(itemss);//funcionando temos um objeto com as informaçoes do back // falta inserir no this.items
    })

    this.items = itemss;
    console.log('funcionou bora estourar um champagne' + this.items);
   }

  ionViewDidLoad() {
    //alterar o objeto para receber os valores do DATA
    //SERIALIZAR JSON PARA OBJ
    var itemss = [{  id:'1',nome: 'dados mocados', endereco: 'Opis notatki 1', avaliacao_geral:'3' },
    {  id:'2',nome: 'Notatka 2', endereco: 'Opis notatki 2', avaliacao_geral:'3' },
    {  id:'3',nome: 'Empresa Brunim', endereco: 'Teste 3', avaliacao_geral:'10' }];

       this.items = itemss;
   }

   detalhesRowGrid(item)
   {
     console.log(item);//valor da linha selecionada na grid
     this.route.navigate(['/detalhes-principal',{billing:JSON.stringify(item)}]);
     console.log('pega os detalhes das empresas');
     alert('API trazendo detalhes da empresa + redirect tela nova');
   }
}
