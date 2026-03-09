package javaapplication1.PracticaBiblioteca;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

/*
Primero, quiero que ya no se manejen solo libros sueltos; necesito una clase Biblioteca que guarde todos los libros en una colección 
por ejemplo una lista). Desde la biblioteca se deben poder agregar libros nuevos, eliminar libros y mostrar todos los libros registrados. 
Además, quiero poder buscar un libro por título o por autor para encontrarlo fácilmente.
*/

//Atributos
public class Libro {
    private String titulo;
    private String autor;
    private LocalDateTime anioPublicacion;
    private boolean disponibilidad; 
    private String personaLibro;
    public ArrayList<Libro> biblioteca = new ArrayList<>(); //Biblioteca donde tendremos todos nuestros libros
    
    //Constructor:
    public Libro(String titulo, String autor, LocalDateTime anioPublicacion, boolean disponibilidad){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponibilidad = disponibilidad;
        
    }
    
    //Getters
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public LocalDateTime getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAnioPublicacion(LocalDateTime anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    
    //Metodos
    
    public void prestarLibro(){
        //Antes de prestarlo, comprobar si esta en el sistema
        Scanner sc = new Scanner(System.in);
        if(disponibilidad == true){
            disponibilidad = false;
            System.out.println("¿A quién le prestarás el libro: " + titulo + "?");
            personaLibro = sc.nextLine();
            System.out.println("Has prestado el libro a: " + personaLibro);
        }else if(disponibilidad == false){
            System.out.println("El libro ya ha sido prestado a la persona llamada: " + personaLibro);
        }
        
        
    }
    
    public void devolverLibro(){
        //Si no está en el sistema, entonces permite devolverlo
        if(disponibilidad == false){
            disponibilidad = true;
            System.out.println("Gracias por devolver el libro" );
        }else{
            System.out.println("Ya tenemos este libro, no hace falta.");
        }
    }
    
    public void mostrarInformacion(){
        //Si está en el sistema, se muestra la información del libro
        if(disponibilidad == true){
            System.out.println("\nLibro: " + titulo + 
            "\nAutor: " + autor + 
            "\nAnio de publicacion: " + anioPublicacion + 
            "\nDisponibiliad:" + disponibilidad); 
        }else{
            //Si no está en el sistema, se muestra los datos del libro más el usuario quién lo tiene
            System.out.println("\nLibro: " + titulo + 
                    "\nAutor: " + autor + 
                    "\nAnio de publicacion: " + anioPublicacion + 
                    "\nDisponibilidad: " + disponibilidad + 
                    "\nLo tiene: " + personaLibro);
        }
    }

    }
}
