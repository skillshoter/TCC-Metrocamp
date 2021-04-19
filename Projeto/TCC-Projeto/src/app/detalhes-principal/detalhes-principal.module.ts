import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { DetalhesPrincipalPageRoutingModule } from './detalhes-principal-routing.module';
import { DetalhesPrincipalPage } from './detalhes-principal.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DetalhesPrincipalPageRoutingModule
  ],
  declarations: [DetalhesPrincipalPage]
})
export class DetalhesPrincipalPageModule {}
