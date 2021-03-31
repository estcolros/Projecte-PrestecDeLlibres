import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
//import { Autor } from "./Model/Autor";

@Injectable({
  providedIn: 'root'
})
export class AutorService {
  private baseUrlp= 'http://localhost:8181/api/Autores'
  private baseUrls= 'http://localhost:8181/api/Autor'
  constructor(private http: HttpClient) { }

  getAutor(id: number): Observable<any>{
    return this.http.get(`$ {this.baseUrls}/${id}`);
  }

  createAutor(Autor: Object): Observable<Object>{
    return this.http.post(`${this.baseUrls}`, Autor);
  }
  updateAutor(id: number, value: any): Observable<Object>{
    return this.http.put(`${this.baseUrls}/${id}`, value);
  }
  deleteAutor(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrls}/${id}`, {responseType: 'text'});

  }
  getAutorsList(): Observable<any>{
    return this.http.get(`${this.baseUrlp}`);
  }
}
