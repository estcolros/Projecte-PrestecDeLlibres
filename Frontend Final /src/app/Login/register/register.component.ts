import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../_services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  from: any = {
    id:null,
    nombre: null,
    apellido1: null,
    apellido2: null,
    telefono: null,
    correo: null,
    dni: null,
    username: null,
    password: null,
  };
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';

  constructor(private authService: AuthService) {}

  ngOnInit(): void {}

  onSubmit(): void {
    const {
      nombre, apellido1, apellido2, telefono, correo, dni, username, password} = this.from;

      //nombre,apellido1,apellido2,telefono,correo,dni,
      this.authService.register(username,password).subscribe(
        (data) => {
          console.log(data);
          this.isSuccessful = true;
          this.isSignUpFailed = false;
        },
        (err) => {
          this.errorMessage = err.error.message;
          this.isSignUpFailed = true;
        }
      );

      this.authService.postT(nombre,apellido1,apellido2,telefono,correo,dni,username,password).subscribe(
        (data) => {
          console.log(data);
          this.isSuccessful = true;
          this.isSignUpFailed = false;
        },
        (err) => {
          this.errorMessage = err.error.message;
          this.isSignUpFailed = true;
        }
      );
  }
}
