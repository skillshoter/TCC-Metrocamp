import { Component, OnInit } from '@angular/core';
import { AngularDelegate } from '@ionic/angular';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-info-covid',
  templateUrl: './info-covid.page.html',
  styleUrls: ['./info-covid.page.scss'],
})
export class InfoCovidPage implements OnInit {

  constructor(private route: Router) { }

  isCollapsed = true;

  ngOnInit() {
  }

}
