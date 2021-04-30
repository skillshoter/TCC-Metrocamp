import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { InfoCovidPageRoutingModule } from './info-covid-routing.module';
import { InfoCovidPage } from './info-covid.page';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InfoCovidPageRoutingModule,
    NgbModule 
  ],
  declarations: [InfoCovidPage]
})
export class InfoCovidPageModule {}
