import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { InfoCovidPage } from './info-covid.page';

const routes: Routes = [
  {
    path: '',
    component: InfoCovidPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InfoCovidPageRoutingModule {}
