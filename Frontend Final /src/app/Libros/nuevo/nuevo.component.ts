import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibroService } from "../../_services/Libros/libro.service";
import { Libros } from "../../_services/Libros/model/Libros";

@Component({
  selector: 'app-nuevo',
  templateUrl: './nuevo.component.html',
  styleUrls: ['./nuevo.component.css']
})
export class NuevoComponent implements OnInit {
  libro: Libros = new Libros();
  submitted=false;

  constructor(private libroService:LibroService, private router:Router) { }

  ngOnInit(): void {
  }

  newLibro():void{
    this.submitted=false;
    this.libro=new Libros();
  }

  save(){
    this.libroService.createLibro(this.libro).subscribe(data => {
      console.log(data);
      this.libro=new Libros();
      this.gotoList();

    },
    error => console.log(error));
  }

  onSubmit(){
    this.submitted=true;
    this.save();
  }

  gotoList(){
    this.router.navigate(['/libros']);
  }

}
