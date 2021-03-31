import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EjemplarService {
  private baseUrlp= 'http://localhost:8181/api/ejemplares'
  private baseUrls= 'http://localhost:8181/api/ejemplar'
  constructor(private http: HttpClient) { }

  getEjemplar(id: number): Observable<any>{
    return this.http.get(`$ {this.baseUrls}/${id}`);
  }

  createEjemplar(Ejemplar: Object): Observable<Object>{
    return this.http.post(`${this.baseUrls}`, Ejemplar);
  }
  updateEjemplar(id: number, value: any): Observable<Object>{
    return this.http.put(`${this.baseUrls}/${id}`, value);
  }
  deleteEjemplar(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrls}/${id}`, {responseType: 'text'});

  }
  getEjemplarsList(): Observable<any>{
    return this.http.get(`${this.baseUrlp}`);
  }
}
