import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NotificacionService {
  private baseUrlp= 'http://localhost:8181/api/notificaciones'
  private baseUrls= 'http://localhost:8181/api/notificacion'
  constructor(private http: HttpClient) { }

  getNotificacion(id: number): Observable<any>{
    return this.http.get('$ {this.baseUrls}/${id}');
  }

  createNotificacion(Notificacion: Object): Observable<Object>{
    return this.http.post('${this.baseUrls}', Notificacion);
  }
  updateNotificacion(id: number, value: any): Observable<Object>{
    return this.http.put('${this.baseUrls}/${id}', value);
  }
  deleteNotificacion(id: number): Observable<any>{
    return this.http.delete('${this.baseUrls}/${id}', {responseType: 'text'});

  }
  getNotificacionsList(): Observable<any>{
    return this.http.get('${this.baseUrlp}');
  }
}
