import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router'

@Component({
  selector: 'app-principal',
  templateUrl: './principal.page.html',
  styleUrls: ['./principal.page.scss'],
})
export class PrincipalPage implements OnInit {

  constructor(public http: HttpClient, private route: Router) { }

  ngOnInit() {
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
          //criar a grid com os parametros do this.EmpresasList
          alert("Grid montada");//remover depois
        }
      },(error)=> {
        console.log(error);
        alert("Consulta a API não encontrou o endereço.");
      });
  }

}
