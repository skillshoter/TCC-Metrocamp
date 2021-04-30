import { Component, OnInit } from '@angular/core';
import { AngularDelegate } from '@ionic/angular';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-info-vacina',
  templateUrl: './info-vacina.page.html',
  styleUrls: ['./info-vacina.page.scss'],
})
export class InfoVacinaPage implements OnInit {

  constructor(private route: Router) { }

  isCollapsed = true;

  ngOnInit() {
  }

}
