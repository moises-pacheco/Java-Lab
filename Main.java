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
        Libro bds = new Libro("El hombre en busca del sentido", "Victor Frankl", LocalDateTime.of(2026,1,3,14,30), true);
        bds.prestarLibro();
        bds.prestarLibro();
        bds.mostrarInformacion();
    }
}
