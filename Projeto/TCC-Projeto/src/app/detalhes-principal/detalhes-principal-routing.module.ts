import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DetalhesPrincipalPage } from './detalhes-principal.page';

const routes: Routes = [
  {
    path: '',
    component: DetalhesPrincipalPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DetalhesPrincipalPageRoutingModule {}
