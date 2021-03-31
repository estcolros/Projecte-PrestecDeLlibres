import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PrestamoService {
  private baseUrlp= 'http://localhost:8181/api/prestamos'
  private baseUrls= 'http://localhost:8181/api/prestamo'
  constructor(private http: HttpClient) { }

  getPrestamo(id: number): Observable<any>{
    return this.http.get('$ {this.baseUrls}/${id}');
  }

  createPrestamo(Prestamo: Object): Observable<Object>{
    return this.http.post('${this.baseUrls}', Prestamo);
  }
  updatePrestamo(id: number, value: any): Observable<Object>{
    return this.http.put('${this.baseUrls}/${id}', value);
  }
  deletePrestamo(id: number): Observable<any>{
    return this.http.delete('${this.baseUrls}/${id}', {responseType: 'text'});

  }
  getPrestamosList(): Observable<any>{
    return this.http.get('${this.baseUrlp}');
  }
}
