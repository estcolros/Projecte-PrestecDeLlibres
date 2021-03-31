import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LibroService {
  private baseUrlp= 'http://localhost:8181/api/libros'
  private baseUrls= 'http://localhost:8181/api/libro'
  constructor(private http: HttpClient) { }

  getLibro(id: number): Observable<any>{
    return this.http.get(`${this.baseUrls}/${id}`);
  }

  createLibro(Libro: Object): Observable<Object>{
    return this.http.post(`${this.baseUrlp}`, Libro);
  }
  updateLibro(id: number, value: any): Observable<Object>{
    return this.http.put(`${this.baseUrls}/${id}`, value);
  }
  deleteLibro(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrls}/${id}`, {responseType: 'text'});

  }
  getLibrosList(): Observable<any>{
    return this.http.get(`${this.baseUrlp}/`);
  }
}
