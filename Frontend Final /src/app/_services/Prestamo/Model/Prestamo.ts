import { Ejemplar } from "../../Ejemplar/model/Ejemplar";
import { trabajador } from "../../Trabajador/Model/trabajador";


export class Prestamo{
    id!: number;
    fechacaducidad!: String;
    fechaalta!: String;
    fechadevolución!: String;
    codejemplar!:Ejemplar;
    trabajadorrecibe!:trabajador;
    trabajadorpresta!:trabajador;
}
