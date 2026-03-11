package javaapplication1.PracticaBiblioteca;

import java.time.LocalDateTime;

/**
 *
 * @author Moisés Pacheco
 */
public class Main {
    public static void main(String[] args) {
        //Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        Libro ruidoFractal = new Libro("Ruido Fractal", "Christopher Paolini", LocalDateTime.of(2023, 10, 25, 14, 30), true);
        Libro hombreBuscaSentido = new Libro("El hombre en busca del sentido", "Victor E. Frankl", LocalDateTime.of(1946,1,1,14,30), true);
        biblioteca.aniadirLibro(ruidoFractal);
        biblioteca.aniadirLibro(hombreBuscaSentido);
    }
}
