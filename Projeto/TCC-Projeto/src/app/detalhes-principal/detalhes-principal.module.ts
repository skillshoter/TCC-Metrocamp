import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { DetalhesPrincipalPageRoutingModule } from './detalhes-principal-routing.module';
import { DetalhesPrincipalPage } from './detalhes-principal.page';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DetalhesPrincipalPageRoutingModule,
    NgbModule
  ],
  declarations: [DetalhesPrincipalPage]
})
export class DetalhesPrincipalPageModule {}
