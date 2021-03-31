import { trabajador } from "../../Trabajador/Model/trabajador";
import { Prestamo } from "../../Prestamo/Model/Prestamo";

export class Notificacion{
    id!: number;
    mensaje!: String;
    leido!: boolean;
    codtrabajador!:trabajador;
    codprestamo!:Prestamo;
    trabajadorrecibe!:trabajador;
}
