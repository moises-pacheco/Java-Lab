package javaapplication1.PracticaBiblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> biblioteca; //"Base de datos" de nuestros libros

    //Constructor
    public Biblioteca(){
        biblioteca = new ArrayList<>();
    }

    //Metodos
    public void aniadirLibro(Libro l) {
        biblioteca.add(l);
    }

    public void eliminarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué libro desea eliminar?");
        String nombreLibro = sc.nextLine();
        //Busca por todos los libros hasta encontrar el buscado por el usuario.
        //Eliminar libro:
        for (Libro l : biblioteca) {
            if (l.getTitulo().equalsIgnoreCase(nombreLibro)) {
                biblioteca.remove(l);
                break;
            }
        }
    }

    public void buscarLibro() {
        String respuestaUsuario;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cómo quieres buscar el libro? \n1. Titulo \n2. Autor");
            respuestaUsuario = sc.nextLine();
            switch (respuestaUsuario) {
                case "1":
                    System.out.println("Indicanos el nombre del libro que deseas buscar:");
                    String respuestaLibro = sc.nextLine();
                    for (Libro l : biblioteca) {
                        if (l.getTitulo().equalsIgnoreCase(respuestaLibro)) {
                            System.out.println("El libro se encuentra en la base de datos.");
                            l.mostrarInformacion();
                            break;
                        } else {
                            System.out.println("El libro no se encuentra en la base de datos.");
                            break;
                        }
                    }
                    break;

                case "2":
                    System.out.println("Indicanos el nombre del autor del libro");
                    String respuestaAutor = sc.nextLine();
                    for(Libro l : biblioteca){
                        //Mostrar todos los objetos que cumplan con esta condicion
                        if(l.getAutor().equalsIgnoreCase(respuestaAutor)){
                            //Si encuentra un libro, muestra ese libro.
                            l.mostrarInformacion();
                        }
                    }
                    break;  // Despues de terminar de recorrer el array, salir del bucle.
                default:
                    System.out.println("La eleccion no existe");
            }
        }while(!respuestaUsuario.equalsIgnoreCase("1") && !respuestaUsuario.equalsIgnoreCase("2"));

    }

    //Mostrar los libros que tenemos almacenados en nuestra biblioteca
    public void mostrarBiblioteca() {
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println("[" + (i+1) + "]: " + biblioteca.get(i).getTitulo());
        }
    }

}
