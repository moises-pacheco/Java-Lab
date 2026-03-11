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
        System.out.println("El libro se ha añadido correctamente...");
        biblioteca.add(l);
    }

    public void eliminarLibro(String nombreLibro) {
        boolean libroFueEncontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué libro desea eliminar?");

        //Busca por todos los libros hasta encontrar el buscado por el usuario.
        for (Libro l : biblioteca) {
            if (l.getTitulo().equalsIgnoreCase(nombreLibro)) {
                libroFueEncontrado = true;
                biblioteca.remove(l);
            }
        }
        //Mensaje si el libro fue encontrado
        if (libroFueEncontrado) {
            System.out.println("No se ha encontrado ningún libro con ese nombre");
            libroFueEncontrado = false;
        }
    }

    public void buscarLibro() {
        boolean libroEncontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo quieres buscar el libro? \n1. Titulo \n2. Autor");
        String respuestaUsuario = sc.nextLine();
        switch (respuestaUsuario) {
            case "1":
                System.out.println("Indicanos el nombre del libro que deseas buscar:");
                String respuestaLibro = sc.nextLine();
                for (Libro l : biblioteca) {
                    if (l.getTitulo().equalsIgnoreCase(respuestaLibro)) {
                        System.out.println("El libro se encuentra en la base de datos.");
                        l.mostrarInformacion();
                    } else {
                        System.out.println("El libro no se encuentra en la base de datos.");
                    }
                    break;
                }
                
            case "2":
                System.out.println("Indicanos el nombre del autor del libro");
                String respuestaAutor = sc.nextLine();
                for(Libro l : biblioteca){
                    if(l.getAutor().equalsIgnoreCase(respuestaAutor)){
                        //Si encuentra un libro, muestra ese libro.
                        libroEncontrado = true;
                        System.out.println(l.getAutor().equalsIgnoreCase(respuestaAutor));
                    }
                    else{
                        libroEncontrado = false;
                    }
                }
                //Si no encuentra un libro, salta este mensaje.
                if(!libroEncontrado){
                    System.out.println("No se ha encontrado ningun libro para mostrar.");
                }
                break;

        }
    }

    //Mostrar los libros que tenemos almacenados en nuestra biblioteca
    public void mostrarBiblioteca() {
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println("[" + i + "]: " + biblioteca.get(i).getTitulo());
        }
    }

}
