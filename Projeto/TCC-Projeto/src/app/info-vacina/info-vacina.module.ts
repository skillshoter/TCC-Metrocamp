import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { InfoVacinaPageRoutingModule } from './info-vacina-routing.module';

import { InfoVacinaPage } from './info-vacina.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InfoVacinaPageRoutingModule
  ],
  declarations: [InfoVacinaPage]
})
export class InfoVacinaPageModule {}
