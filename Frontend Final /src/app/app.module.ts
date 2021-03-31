import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './Main/main/main.component';
import { HomeComponent } from './Home/home/home.component';
import { LoginComponent } from './Login/login/login.component';
import { ForgotComponent } from './Login/forgot/forgot.component';
import { RegisterComponent } from './Login/register/register.component';
import { LibrosComponent } from './Libros/libros/libros.component';
import { NuevoComponent } from './Libros/nuevo/nuevo.component';
import { PerfilComponent } from './Empleado/perfil/perfil.component';
import { MislibrosComponent } from './Empleado/mislibros/mislibros.component';
import { PerfillibroComponent } from './Libros/perfillibro/perfillibro.component';
import { PedirlibroComponent } from './Libros/pedirlibro/pedirlibro.component';
import { VotoComponent } from './Libros/voto/voto.component';
import { authInterceptorProviders } from './_helpers/auth.interceptor';

import { DataTablesModule } from "angular-datatables";
import { EditorialesComponent } from './Libros/editoriales/editoriales.component';


@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    HomeComponent,
    LoginComponent,
    ForgotComponent,
    RegisterComponent,
    LibrosComponent,
    NuevoComponent,
    PerfilComponent,
    MislibrosComponent,
    PerfillibroComponent,
    PedirlibroComponent,
    VotoComponent,
    EditorialesComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    DataTablesModule
  ],
  //providers: [],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
