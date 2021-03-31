import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrabajadorService {
  private baseUrlp= 'http://localhost:8181/api/trabajadores'
  private baseUrls= 'http://localhost:8181/api/trabajador'
  private baseUrlu= 'http://localhost:8181/api/trabajadoru'
  constructor(private http: HttpClient) { }

  getTrabajador(id: number): Observable<any>{
    return this.http.get(`$ {this.baseUrls}/${id}`);
  }

  getTrabajadorxuser(user: string): boolean{
    if (this.http.get(`$ {this.baseUrlu}/${user}`)) {
      console.log(true);
      return true;
    }else{
      console.log(false);
      return false;
    }
  }

  createTrabajador(Trabajador: Object): Observable<Object>{
    return this.http.post(`${this.baseUrls}`, Trabajador);
  }

  updateTrabajador(id: number, value: any): Observable<Object>{
    return this.http.put(`${this.baseUrls}/${id}`, value);
  }

  deleteTrabajador(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrls}/${id}`, {responseType: 'text'});
  }

  getTrabajadorsList(): Observable<any>{
    return this.http.get(`${this.baseUrlp}`);
  }
}
