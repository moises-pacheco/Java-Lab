package javaapplication1.PracticaBiblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> biblioteca; //"Base de datos" de nuestros libros

    //Constructor
    public Biblioteca() {
        biblioteca = new ArrayList<>();
    }

    //Metodos
    public void aniadirLibro(Libro libro) {
        biblioteca.add(libro);
    }

    public void eliminarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué libro desea eliminar?");
        String nombreLibro = sc.nextLine();

        for (Libro libro : biblioteca) {
            if (libro.getTitulo().equalsIgnoreCase(nombreLibro)) {
                biblioteca.remove(libro);
                break;
            }
        }
    }

    public void buscarLibro() {
        String respuestaUsuario;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cómo quieres buscar el libro? \n1. Titulo \n2. Autor");
            respuestaUsuario = sc.nextLine();
            switch (respuestaUsuario) {
                case "1":
                    buscarLibroPorNombre(sc);
                    break;
                case "2":
                    buscarLibroPorAutor(sc);
                    break;
                default:
                    System.out.println("La eleccion no existe");
            }
        } while (!respuestaUsuario.equalsIgnoreCase("1") && !respuestaUsuario.equalsIgnoreCase("2"));
    }

    private void buscarLibroPorAutor(Scanner sc) {
        System.out.println("Indicanos el nombre del autor del libro");
        String respuestaAutor = sc.nextLine();
        for (Libro libro : biblioteca) {
            //Mostrar todos los objetos que cumplan con esta condicion
            if (libro.getAutor().equalsIgnoreCase(respuestaAutor)) {
                //Si encuentra un libro, muestra ese libro.
                libro.mostrarInformacion();
            }
        }
    }

    private void buscarLibroPorNombre(Scanner sc) {
        System.out.println("Indicanos el nombre del libro que deseas buscar:");
        String respuestaLibro = sc.nextLine();
        boolean fueEncontrado = false;
        for (Libro libro : biblioteca) {
            if (libro.getTitulo().equalsIgnoreCase(respuestaLibro)) {
                fueEncontrado = true;
                libro.mostrarInformacion();
                break;
            }
        }
        if (!fueEncontrado) {
            System.out.println("No se ha encontrado el libro en la base de datos.");
        }
    }

    //Mostrar los libros que tenemos almacenados en nuestra biblioteca
    public void mostrarBiblioteca() {
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println("[" + (i + 1) + "]: " + biblioteca.get(i).getTitulo());
        }
    }

}
