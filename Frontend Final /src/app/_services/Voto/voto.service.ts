import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VotoService {

  private baseUrlp= 'http://localhost:8181/api/votos'
  private baseUrls= 'http://localhost:8181/api/voto'

  constructor(private http: HttpClient) { }
  getVoto(id: number): Observable<any>{
    return this.http.get(`${this.baseUrls}/${id}`);
  }

  createVoto(Voto: Object): Observable<Object>{
    return this.http.post(`${this.baseUrlp}`, Voto);
  }
  updateVoto(id: number, value: any): Observable<Object>{
    return this.http.put(`${this.baseUrls}/${id}`, value);
  }
  deleteVoto(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrls}/${id}`, {responseType: 'text'});

  }
  getVotosList(): Observable<any>{
    return this.http.get(`${this.baseUrlp}/`);
  }
}
