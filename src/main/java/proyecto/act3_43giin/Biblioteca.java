/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.act3_43giin;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Biblioteca {
  private List<Libro> libros;
  
  public Biblioteca() {
    this.libros = new ArrayList<Libro>();
  }
  
  public void agregarLibro(Libro libro) {
    this.libros.add(libro);
  }
  
  public List<Libro> getLibros() {
    return this.libros;
}
  public void prestarLibro(String titulo) {
    for (Libro libro : this.libros) {
      if (libro.getTitulo().equals(titulo)) {
        if (libro.estaDisponible()) {
          libro.prestar();
          System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
          System.out.println("Lo siento, el libro " + titulo + " no está disponible.");
        }
        return;
      }
    }
    throw new IllegalArgumentException("Lo siento, el libro " + titulo + " no se ha encontrado en la biblioteca.");
  }
  
  public void devolverLibro(String titulo) {
    for (Libro libro : this.libros) {
      if (libro.getTitulo().equals(titulo)) {
        libro.devolver();
        System.out.println("El libro " + titulo + " ha sido devuelto.");
        return;
      }
    }
    throw new IllegalArgumentException("Lo siento, el libro " + titulo + " no se ha encontrado en la biblioteca.");
  }
  
  public boolean buscarLibro(String titulo) {
    for (Libro libro : this.libros) {
      if (libro.getTitulo().equals(titulo)) {
        System.out.println("El libro " + titulo + " está en la biblioteca.");
        return true;
      }
    }
    System.out.println("Lo siento, el libro " + titulo + " no se ha encontrado en la biblioteca.");
    return false;
  }
}
