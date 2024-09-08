import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
  @Test
    public void testSetAutor() {
        Libro libro = new Libro();
        libro.setAutor("Gabriel García Márquez");
        assertEquals("Gabriel García Márquez", libro.getAutor(), "El autor debería ser 'Gabriel García Márquez'");
    }

    @Test
    public void testGetAutor() {
        Libro libro = new Libro("J.K. Rowling", 450, "Harry Potter", 1997);
        assertEquals("J.K. Rowling", libro.getAutor(), "El autor debería ser 'J.K. Rowling'");
    }

    @Test
    public void testSetNumeroDePaginas() {
        Libro libro = new Libro();
        libro.setNumero_de_paginas(300);
        assertEquals(300, libro.getNumero_de_paginas(), "El número de páginas debería ser 300");
    }

    @Test
    public void testGetNumeroDePaginas() {
        Libro libro = new Libro("J.K. Rowling", 450, "Harry Potter", 1997);
        assertEquals(450, libro.getNumero_de_paginas(), "El número de páginas debería ser 450");
    }

    @Test
    public void testToString() {
        Libro libro = new Libro("J.K. Rowling", 450, "Harry Potter", 1997);
        String expected = "Libro{Titulo=Harry Potter, anoPublicacion=1997Autor=J.K. Rowling, NumeroDePaginas=450}";
        assertEquals(expected, libro.toString(), "El método toString() no devuelve el valor esperado");
    }
}
