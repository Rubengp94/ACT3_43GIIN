/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto.act3_43giin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    private Libro libro;
    
    @Before
    public void setUp() {
        libro = new Libro("El camino de los reyes", "Brandon Sanderson");
    }
    

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        assertEquals("El camino de los reyes", libro.getTitulo());
    }
    /**
     * Test del método GetAutor de la clase Libro
     */
    @Test
    public void testGetAutor() {
        assertEquals("Brandon Sanderson", libro.getAutor());
    }
     /**
     * Test del método EstaDisponible de la clase Libro
     */
    @Test
    public void testEstaDisponible() {
        assertTrue(libro.estaDisponible());
    }
     /**
     * Test del método Prestar de la clase Libro
     */
    @Test
    public void testPrestar() {
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }
     /**
     * Test del método devolver de la clase Libro
     */
    @Test
    public void testDevolver() {

        libro.prestar();
        libro.devolver();
        assertTrue(libro.estaDisponible());
    }
    
    @After
    public void tearDown() {
        libro = null;
    }
}
