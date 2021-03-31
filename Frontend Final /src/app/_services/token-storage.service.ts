import { Injectable } from '@angular/core';

const TOKEN_KEY = "Bearer  eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE2MTY4NjEwOTcsImlzcyI6Ikpvc2UgTWFyw61uIiwic3ViIjoiYWRtaW4iLCJleHAiOjE2MTc3MjUwOTd9.f28wo_rP3UDWsImPpTlx64tnW6FbJGXQ8GC-dNjWggthlLK31BnD65IQ9KLd2SmjOWlOLSaKZyR6LWfFzFHUNA";
const USER_KEY = 'auth-user';

@Injectable({
  providedIn: 'root'
})
export class TokenStorageService {
  constructor() { }

  signOut(): void {
    window.sessionStorage.clear();
  }

  public saveToken(token: string): void {
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token);
  }

  public getToken(): string | null {
    return window.sessionStorage.getItem(TOKEN_KEY);
  }

  public saveUser(username: any): void {
    window.sessionStorage.removeItem(USER_KEY);
    window.sessionStorage.setItem(USER_KEY, JSON.stringify(username));
  }

  public getUser(): any {
    const user = window.sessionStorage.getItem(USER_KEY);
    if (user) {
      return JSON.parse(user);
    }

    return {};
  }
}
