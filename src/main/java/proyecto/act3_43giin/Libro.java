/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.act3_43giin;

/**
 *
 * @author Usuario
 */
public class Libro {
  private String titulo;
  private String autor;
  private boolean disponible;
  
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = true;
  }
  
  public String getTitulo() {
    return this.titulo;
  }
  
  public String getAutor() {
    return this.autor;
  }
  
  public boolean estaDisponible() {
    return this.disponible;
  }
  
  public void prestar() {
    this.disponible = false;
  }
  
  public void devolver() {
    this.disponible = true;
  }
}



 