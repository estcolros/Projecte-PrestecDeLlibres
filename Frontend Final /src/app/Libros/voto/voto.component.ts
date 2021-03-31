import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { voto } from 'src/app/_services/Voto/Model/voto';
import { VotoService } from 'src/app/_services/Voto/voto.service';

@Component({
  selector: 'app-voto',
  templateUrl: './voto.component.html',
  styleUrls: ['./voto.component.css']
})
export class VotoComponent implements OnInit {
  votos:voto=new voto();
  submitted=false;

  constructor(private VotoService: VotoService, private router:Router) { }

  ngOnInit(): void {
  }

  newVoto():void{

    this.submitted=false;
    this.votos=new voto();

  }

save(){


}

onSubmit(){
  this.submitted=true;
  alert("Voto enviado, volviendo a la lista de libros")
    this.gotoList();
}
gotoList(){
  this.router.navigate(["/libros"]);
}

}
