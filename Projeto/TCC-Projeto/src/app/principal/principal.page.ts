import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


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
      console.log("pesquisarNoBack");
      console.log("valor do empresa:"+this.NameEmpresa);  
      console.log("valor do cnpjEmpresa:"+this.CnpjEmpresa);
      console.log("valor do endereco:"+this.Endereco);
      this.http.get('http://localhost:3000/getEmpresa?nameEmpresa='+this.NameEmpresa+'&cnpj='+this.CnpjEmpresa+'&endereco='+this.Endereco).subscribe((data)=> {
        console.log(data);
        this.EmpresasList = data;
        if(Object.keys(data).length === 0)
        {
          alert("Não existe Empresa com estes parametros");
        }else
        {
          console.log("Mostra Grid");
          alert("Grid montada");//remover depois
          this.ionViewDidLoad();//passar o DATA como parametro
        }
      },(error)=> {
        console.log(error);
        alert("Consulta a API não encontrou o endereço.");
        this.ionViewDidLoad();//colocar no alert alert("Grid montada");
        var result_style = document.getElementById('trGrid').style;
        result_style.display = 'flex'; 
      });
  }

  public items: Array<any>;

  ionViewDidLoad() {
    //alterar o objeto para receber os valores do DATA
       this.items = [
           {  id:'1',title: 'Notatka 1', description: 'Opis notatki 1', nota:'3' },
           {  id:'2',title: 'Notatka 2', description: 'Opis notatki 2', nota:'3' },
           {  id:'3',title: 'Notatka 3', description: 'Opis notatki 3', nota:'3' }
       ];
   }

   detalhesRowGrid(item)
   {
     console.log(item);//valor da linha selecionada na grid
     this.route.navigate(['/detalhes-principal',{billing:JSON.stringify(item)}]);
     console.log('pega os detalhes das empresas');
     alert('API trazendo detalhes da empresa + redirect tela nova');
   }
}
