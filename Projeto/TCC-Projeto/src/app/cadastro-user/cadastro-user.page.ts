import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router'

@Component({
  selector: 'app-cadastro-user',
  templateUrl: './cadastro-user.page.html',
  styleUrls: ['./cadastro-user.page.scss'],
})
export class CadastroUserPage implements OnInit {

  constructor(public http: HttpClient, private route: Router) { }

  ngOnInit() {

  }

  loginUser:any;
  nameUser:any;
  telUser:any;
  emailUser:any;
  senhaUser:any;
  confSenhaUser:any;

  putUser(event:any)
  {
    console.log("Gravar Usuario");
    if(this.senhaUser == this.confSenhaUser)
    {
      const obj = { 
        login:this.loginUser,
        nome:this.nameUser,
        telefone:this.telUser,
        email:this.emailUser,
        senha:this.senhaUser
       };
       
      const  requestUrl = 'http://25.3.255.44:8080/users/criaUsuario';//ver com nathan 
      this.http.post(requestUrl, obj, { headers: { 'Content-Type': 'application/json' } }).subscribe(
        (val) => {
            console.log("POST call successful value returned in body", 
                        val);
        },
        response => {
            console.log("POST call in error", response);
        },
        () => {
            console.log("The POST observable is now completed.");
        });
    }
    else
    {
      alert("As duas senha devem ser iguais.");
    }
  }

  voltar(event:any)
  {
    console.log("voltar tela");
    this.route.navigate(['/home']);
  }
}
