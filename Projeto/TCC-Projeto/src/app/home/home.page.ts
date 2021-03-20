import { HttpClient } from '@angular/common/http';
import { analyzeAndValidateNgModules, identifierModuleUrl } from '@angular/compiler';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  users: any;

  constructor(public http: HttpClient) {

  }
    login:any;
    senha:any;
    getData(event:any)
    { 
      console.log("valor do login:"+this.login);  
      console.log("valor do login:"+this.senha);
      this.http.get('http://localhost:3000/user?name='+this.login+'&senha='+this.senha).subscribe((data)=> {
        console.log(data);
        this.users = data;
        if(Object.keys(data).length === 0)
        {
          console.log("não existe user");
          alert("Não existe usuario cadastrado");
        }else
        {
          console.log("redireciona tela Home");
          alert("Redirecionar nova tela");
        }
      },(error)=> {
        console.log(error);
      });
    }
}
