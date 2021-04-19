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
      this.http.get<boolean>('http://25.91.152.90:8080/users/login?login='+this.login+'&senha='+this.senha).subscribe((data)=> {
        console.log(data+' :Retorno da API');
        this.users = data;
        if(Object.keys(data).length === 0)
        {
          console.log("não existe user");
          alert("Usuario não encontrado.");
        }else
        {
          if(data == true)
          {
            console.log("redireciona tela Home");
            this.route.navigate(['/principal']);
          }else
          {
            console.log("não logar");
            alert("Usuario sem permissão para acesso.");
          }
        }
      },(error)=> {
        console.log(error);
        alert("Ocorreu um erro ao conectar ao site.");
      });
    }

    goCad(event:any)
    {
      this.route.navigate(['/cadastro-user']);
    }
}
