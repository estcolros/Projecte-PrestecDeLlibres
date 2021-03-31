import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IdiomaService {
  private baseUrlp= 'http://localhost:8181/api/Idiomas'
  private baseUrls= 'http://localhost:8181/api/Idioma'
  constructor(private http: HttpClient) { }

  getIdioma(id: number): Observable<any>{
    return this.http.get('$ {this.baseUrls}/${id}');
  }

  createIdioma(Idioma: Object): Observable<Object>{
    return this.http.post('${this.baseUrls}', Idioma);
  }
  updateIdioma(id: number, value: any): Observable<Object>{
    return this.http.put('${this.baseUrls}/${id}', value);
  }
  deleteIdioma(id: number): Observable<any>{
    return this.http.delete('${this.baseUrls}/${id}', {responseType: 'text'});

  }
  getIdiomasList(): Observable<any>{
    return this.http.get('${this.baseUrlp}');
  }
}
