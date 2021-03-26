import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro-user',
  templateUrl: './cadastro-user.page.html',
  styleUrls: ['./cadastro-user.page.scss'],
})
export class CadastroUserPage implements OnInit {

  constructor() { }

  ngOnInit() {

  }

  putUser(event:any)
  {
    console.log("Gravar Usuario");
  }

  voltar(event:any)
  {
    console.log("voltar tela");
  }
}
