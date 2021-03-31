import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {TrabajadorService } from './Trabajador/trabajador.service';


const AUTH_API = 'http://localhost:8181/';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})

export class AuthService {

  constructor(private http: HttpClient) { }

  login(username: string, password: string): Observable<any> {
    return this.http.post(AUTH_API + 'login', {
      username,
      password
    }, httpOptions);
  }

  //nombre:string, apellido1:string, apellido2:string, telefono:string, correo: string, dni:string,
  register(username: string, password: string): Observable<any> {
    return this.http.post(AUTH_API + 'users/', {
      // nombre,
      // apellido1,
      // apellido2,
      // telefono,
      // correo,
      // dni,
      username,
      password
    }, httpOptions);
  }

  loginT(username: string, password: string): Observable<any> {
    TrabajadorService
    return this.http.post(AUTH_API + 'login', {
      username,
      password
    }, httpOptions);
  }

  postT(nombre:string, apellido1:string, apellido2:string, telefono:string, correo: string, dni:string, user: string, password: string): Observable<any> {
    return this.http.post(AUTH_API + 'api/trabajadores', {
      nombre,
      apellido1,
      apellido2,
      telefono,
      correo,
      dni,
      user,
      password
    }, httpOptions);
  }
}
