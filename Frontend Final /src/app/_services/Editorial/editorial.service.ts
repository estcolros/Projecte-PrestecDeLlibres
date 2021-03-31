import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EditorialService {
  private baseUrlp= 'http://localhost:8181/api/editoriales'
  private baseUrls= 'http://localhost:8181/api/editorial'
  constructor(private http: HttpClient) { }

  getEditorial(id: number): Observable<any>{
    return this.http.get('$ {this.baseUrls}/${id}');
  }

  createEditorial(Editorial: Object): Observable<Object>{
    return this.http.post('${this.baseUrls}', Editorial);
  }
  updateEditorial(id: number, value: any): Observable<Object>{
    return this.http.put('${this.baseUrls}/${id}', value);
  }
  deleteEditorial(id: number): Observable<any>{
    return this.http.delete('${this.baseUrls}/${id}', {responseType: 'text'});

  }
  getEditorialsList(): Observable<any>{
    return this.http.get('${this.baseUrlp}');
  }
}
