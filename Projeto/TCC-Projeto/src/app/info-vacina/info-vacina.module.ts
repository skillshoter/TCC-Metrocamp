import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { InfoVacinaPageRoutingModule } from './info-vacina-routing.module';
import { InfoVacinaPage } from './info-vacina.page';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    InfoVacinaPageRoutingModule,
    NgbModule 
  ],
  declarations: [InfoVacinaPage]
})
export class InfoVacinaPageModule {}
