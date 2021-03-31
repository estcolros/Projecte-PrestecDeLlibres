import { LibroService } from "../../Libros/libro.service";
import { Libros } from "../../Libros/model/Libros";
import { sedeEmpresa } from "../../SedeEmpresa/Model/sedeEmpresa";
import { trabajador } from "../../Trabajador/Model/trabajador";
export class Ejemplar{
    id!: number;
    estado!: number;
    codlibro!:Libros;
    codsede!:sedeEmpresa;
    trabajadorpresta!:trabajador;
    Servlibro!:LibroService;
}
