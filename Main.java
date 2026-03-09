package javaapplication1.PracticaBiblioteca;

import java.time.LocalDateTime;

/**
 *
 * @author Moisés Pacheco
 */
public class Main {
    public static void main(String[] args) {
        Libro rf = new Libro("Ruido Fractal", "Christopher Paolini",LocalDateTime.of(2026,3,9,14,30),true);
        rf.mostrarInformacion();
        rf.prestarLibro();
    }
    
}
