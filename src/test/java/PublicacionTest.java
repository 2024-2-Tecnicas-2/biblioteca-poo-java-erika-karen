import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
@Test
    public void testSetTitulo() {
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo("Programación en Java");
        assertEquals("Programación en Java", publicacion.getTitulo(), "El título debería ser 'Programación en Java'");
    }

    @Test
    public void testGetTitulo() {
        Publicacion publicacion = new Publicacion("Diseño de Software", 2020);
        assertEquals("Diseño de Software", publicacion.getTitulo(), "El título debería ser 'Diseño de Software'");
    }

    @Test
    public void testSetAnoPublicacion() {
        Publicacion publicacion = new Publicacion();
        publicacion.setAnoPublicacion(2021);
        assertEquals(2021, publicacion.getAnoPublicacion(), "El año de publicación debería ser 2021");
    }

    @Test
    public void testGetAnoPublicacion() {
        Publicacion publicacion = new Publicacion("Diseño de Software", 2018);
        assertEquals(2018, publicacion.getAnoPublicacion(), "El año de publicación debería ser 2018");
    }

    @Test
    public void testToString() {
        Publicacion publicacion = new Publicacion("Diseño de Software", 2020);
        String expected = "Publicacion{Titulo=Diseño de Software, anoPublicacion=2020}";
        assertEquals(expected, publicacion.toString(), "El método toString() no devuelve el valor esperado");
    }
}
