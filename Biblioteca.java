package javaapplication1.PracticaBiblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> biblioteca = new ArrayList<>(); //"Base de datos" de nuestros libros

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
    
    //Mostrar los libros que tenemos almacenados en nuestra biblioteca
    public void mostrarBiblioteca(){
        for(int i = 0; i < biblioteca.size(); i++){
            System.out.println("[" + i + "]: " + biblioteca.get(i).getTitulo());
        }
    }

}
