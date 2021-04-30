import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'cadastro-user',
    loadChildren: () => import('./cadastro-user/cadastro-user.module').then( m => m.CadastroUserPageModule)
  },
  {
    path: 'principal',
    loadChildren: () => import('./principal/principal.module').then( m => m.PrincipalPageModule)
  },
  {
    path: 'detalhes-empresa',
    loadChildren: () => import('./detalhes-empresa/detalhes-empresa.module').then( m => m.DetalhesEmpresaPageModule)
  },
  {
    path: 'detalhes-principal',
    loadChildren: () => import('./detalhes-principal/detalhes-principal.module').then( m => m.DetalhesPrincipalPageModule)
  },  {
    path: 'info-covid',
    loadChildren: () => import('./info-covid/info-covid.module').then( m => m.InfoCovidPageModule)
  },
  {
    path: 'info-vacina',
    loadChildren: () => import('./info-vacina/info-vacina.module').then( m => m.InfoVacinaPageModule)
  },

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
