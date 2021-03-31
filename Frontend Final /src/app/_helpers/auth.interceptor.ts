import { HTTP_INTERCEPTORS, HttpEvent } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpHandler, HttpRequest } from '@angular/common/http';

import { TokenStorageService } from '../_services/token-storage.service';
import { Observable } from 'rxjs';

const TOKEN_HEADER_KEY = 'Authorization';       // for Spring Boot back-end

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  constructor(private token: TokenStorageService) { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    let authReq = req;
    const token = "Bearer  eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2MTY4NjEwOTcsImlzcyI6Ikpvc2UgTWFyw61uIiwic3ViIjoiYWRtaW4iLCJleHAiOjE2MTc3MjUwOTd9.f28wo_rP3UDWsImPpTlx64tnW6FbJGXQ8GC-dNjWggthlLK31BnD65IQ9KLd2SmjOWlOLSaKZyR6LWfFzFHUNA";
    if (token != null) {
      //authReq = req.clone({ headers: req.headers.set(TOKEN_HEADER_KEY, 'Bearer ' + token) });
      authReq = req.clone({ headers: req.headers.set(TOKEN_HEADER_KEY, token) });
    }
    return next.handle(authReq);
  }
}

export const authInterceptorProviders = [
  { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true }
];
