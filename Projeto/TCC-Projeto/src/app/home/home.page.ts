import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  users: any;

  constructor(public http: HttpClient, private route: Router) {

  }
    login:any;
    senha:any;
    getData(event:any)
    { 
      console.log("valor do login:"+this.login);  
      console.log("valor do login:"+this.senha);
      this.http.get<boolean>('http://25.91.152.90:8080/users/login?login='+this.login+'&senha='+this.senha,{ headers: { 'Content-Type': 'application/json' } }).subscribe((data)=> {
        console.log(data+' :Retorno da API');
        this.users = data;
          if(data == true)
          {
            console.log("redireciona tela Home");
            this.route.navigate(['/principal']);
          }else
          {
            console.log("não logar");
            alert("Usuario não encontrado.");
          }
      },(error)=> {
        console.log(error);
        alert("Ocorreu um erro ao logar.");
      });
    }

    goCad(event:any)
    {
      this.route.navigate(['/cadastro-user']);
    }
}
