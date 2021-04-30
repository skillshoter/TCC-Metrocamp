import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InfoVacinaPage } from './info-vacina.page';

const routes: Routes = [
  {
    path: '',
    component: InfoVacinaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InfoVacinaPageRoutingModule {}
