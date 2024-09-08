import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {

   @Test
    public void testSetNumeroRevistas() {
        Revista revista = new Revista();
        revista.setNumeroRevistas(5);
        assertEquals(5, revista.getNumeroRevistas(), "El número de revistas debería ser 5");
    }

    @Test
    public void testGetNumeroRevistas() {
        Revista revista = new Revista(10, "Ciencia Hoy", "Revista Tecnológica", 2021);
        assertEquals(10, revista.getNumeroRevistas(), "El número de revistas debería ser 10");
    }

    @Test
    public void testSetNombreRevista() {
        Revista revista = new Revista();
        revista.setNombreRevista("Ciencia Hoy");
        assertEquals("Ciencia Hoy", revista.getNombreRevista(), "El nombre de la revista debería ser 'Ciencia Hoy'");
    }

    @Test
    public void testGetNombreRevista() {
        Revista revista = new Revista(10, "Revista Científica", "Revista Tecnológica", 2021);
        assertEquals("Revista Científica", revista.getNombreRevista(), "El nombre de la revista debería ser 'Revista Científica'");
    }

    @Test
    public void testToString() {
        Revista revista = new Revista(10, "Ciencia Hoy", "Revista Tecnológica", 2021);
        String expected = "Revista{Titulo=Revista Tecnológica, anoPublicacion=2021NumeroRevistas=10, NombreRevista=Ciencia Hoy}";
        assertEquals(expected, revista.toString(), "El método toString() no devuelve el valor esperado");
    }
}