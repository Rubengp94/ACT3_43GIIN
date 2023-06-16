/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto.act3_43giin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BibliotecaTest {
    Biblioteca biblioteca;
    Libro libro1;
    
    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("La espada del destino", "Andrzej Sapkowski");
    }
    
    @Test
    public void testAgregarYObtenerLibros() {
        biblioteca.agregarLibro(libro1);
        assertEquals(1, biblioteca.getLibros().size());
        assertEquals(libro1, biblioteca.getLibros().get(0));
    }
    
    @Test
    public void testPrestarLibro() {
        biblioteca.agregarLibro(libro1);
        biblioteca.prestarLibro("La espada del destino");
        assertEquals(false, libro1.estaDisponible());
    }
    
    @Test
    public void testDevolverLibro() {
        libro1.prestar();
        biblioteca.agregarLibro(libro1);
        biblioteca.devolverLibro("La espada del destino");
        assertEquals(true, libro1.estaDisponible());
    }
    
    @Test
    public void testBuscarLibroEnBiblioteca() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.buscarLibro("La espada del destino"));
    }
    
    @Test
    public void testBuscarLibroNoEnBiblioteca() {
        biblioteca.agregarLibro(libro1);
        assertFalse(biblioteca.buscarLibro("El Señor de los Anillos: el Retorno del Rey"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrestarLibroNoExistente() {
        biblioteca.prestarLibro("Harry Potter y la Orden del Fénix");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDevolverLibroNoExistente() {
        biblioteca.devolverLibro("Harry Potter y la Orden del Fénix");
    }
    
    @After
    public void tearDown() {
        libro1 = null;
    }
}