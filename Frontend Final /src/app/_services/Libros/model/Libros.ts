import { Autor } from "../../Autor/Model/Autor";
import { Idioma } from "../../Idioma/Model/Idioma";
import { Editorial } from "../../Editorial/Model/Editorial";
export class Libros{

  id!: number;
  genero!: String;
  titulo!: String;
  fecha!: String;
  isbn!: String;
  autor!: Autor;
  editorial!: Editorial;
  idioma!: Idioma;

}
