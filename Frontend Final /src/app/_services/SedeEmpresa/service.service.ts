import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SedeEmpresaService {
  private baseUrlp= 'http://localhost:8181/api/sedeEmpresas'
  private baseUrls= 'http://localhost:8181/api/sedeEmpresa'
  constructor(private http: HttpClient) { }

  getLibro(id: number): Observable<any>{
    return this.http.get('$ {this.baseUrls}/${id}');
  }

  createsedeEmpresa(sedeEmpresa: Object): Observable<Object>{
    return this.http.post('${this.baseUrls}', sedeEmpresa);
  }
  updatesedeEmpresa(id: number, value: any): Observable<Object>{
    return this.http.put('${this.baseUrls}/${id}', value);
  }
  deletesedeEmpresa(id: number): Observable<any>{
    return this.http.delete('${this.baseUrls}/${id}', {responseType: 'text'});

  }
  getsedeEmpresasList(): Observable<any>{
    return this.http.get('${this.baseUrlp}');
  }
}
