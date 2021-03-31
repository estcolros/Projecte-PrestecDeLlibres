import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../_services/auth.service';
import { TokenStorageService } from '../../_services/token-storage.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: any = {
      nombre:null,
      apellido1:null,
      apellido2:null,
      telefono:null,
      correo:null,
      dni:null,
      username:null,
      password:null
    };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';

  constructor(private authService: AuthService, private tokenStorage: TokenStorageService, private router:Router) { }

  ngOnInit(): void {
    if (this.tokenStorage.getToken()) {
      this.isLoggedIn = true;
    }
  }

  onSubmit(): void {
    const { username, password } = this.form;

    // this.authService.login(username, password).subscribe(
    //   data => {
    //     this.tokenStorage.saveToken(data.accessToken);
    //     this.tokenStorage.saveUser(data);

    //     this.isLoginFailed = false;
    //     this.isLoggedIn = true;
    //     //this.roles = this.tokenStorage.getUser().roles;
    //     this.reloadPage();
    //   },
    //   err => {
    //     this.errorMessage = err.error.message;
    //     this.isLoginFailed = true;
    //   }
    // );

    var usuarioRegistrado="marccudi";
    var pass="123456";
    if (username==usuarioRegistrado && password==pass) {
      this.toHome();
    }else{
        this.isLoginFailed = true;

    }

  }

  toHome(){
    this.router.navigate(['home']);
  }

  reloadPage(): void {
    window.location.reload();
  }
}
