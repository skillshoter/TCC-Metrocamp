import { HttpClient } from '@angular/common/http';
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

    getData(event:any)
    {
      this.http.get('http://localhost:3000/cars').subscribe((data)=> {
        console.log(data);
        this.users = data;
      },(error)=> {
        console.log(error);
      });
    }
}
