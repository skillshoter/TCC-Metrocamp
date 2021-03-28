import { Component, OnInit } from '@angular/core';
import {MegaMenuItem,MenuItem} from 'primeng/api';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.page.html',
  styleUrls: ['./principal.page.scss'],
})
export class PrincipalPage implements OnInit {

  constructor() { }

  
  items: MenuItem[];

  ngOnInit() {
    
      this.items = [
          {label: 'Home', icon: 'pi pi-fw pi-home'},
          {label: 'Calendar', icon: 'pi pi-fw pi-calendar'},
          {label: 'Edit', icon: 'pi pi-fw pi-pencil'},
          {label: 'Documentation', icon: 'pi pi-fw pi-file'},
          {label: 'Settings', icon: 'pi pi-fw pi-cog'}
      ];
  }
  
}
