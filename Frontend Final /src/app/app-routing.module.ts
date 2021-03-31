import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Home/home/home.component';
import { LibrosComponent } from './Libros/libros/libros.component';
import { NuevoComponent } from './Libros/nuevo/nuevo.component';
import { PedirlibroComponent } from './Libros/pedirlibro/pedirlibro.component';
import { PerfillibroComponent } from './Libros/perfillibro/perfillibro.component';
import { VotoComponent } from './Libros/voto/voto.component';
import { ForgotComponent } from './Login/forgot/forgot.component';
import { LoginComponent } from './Login/login/login.component';
import { RegisterComponent } from './Login/register/register.component';
import { MainComponent } from './Main/main/main.component';
import { MislibrosComponent } from './Empleado/mislibros/mislibros.component';
import { PerfilComponent } from './Empleado/perfil/perfil.component';
import { BestsellersComponent } from './Libros/bestsellers/bestsellers.component';
import { NoticiasComponent } from './Noticias/noticias/noticias.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { EditorialesComponent } from './Libros/editoriales/editoriales.component';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:'login'},
  {path:'login',component:LoginComponent},
  {path:'login/forgot',component:ForgotComponent},
  {path:'login/register',component:RegisterComponent},
  {path:'main',component:MainComponent},
  {path:'home',component:HomeComponent},
  {path:'libros',component:LibrosComponent},
  {path:'libros/nuevo',component:NuevoComponent},
  {path:'libros/pedirlibro',component:PedirlibroComponent},
  {path:'libros/pedirlibro/:id',component:PedirlibroComponent},
  {path:'libros/voto/:id',component:VotoComponent},
  {path:'libros/perfillibro/:id',component:PerfillibroComponent},
  {path:'usuario/perfil',component:PerfilComponent},
  {path:'usuario/libros',component:MislibrosComponent},
  {path:'libros/bestsellers',component:BestsellersComponent},
  {path:'noticias',component:NoticiasComponent},
  {path:'aboutus',component:AboutUsComponent},
  {path:'libros/editoriales',component:EditorialesComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
