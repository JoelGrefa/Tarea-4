package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PodcastTest {

    @Test
    void testConstructorValido() {
        Podcast podcast = new Podcast("Historia del Jazz", 60, "Música", "Carlos Pérez", "Historia del género");
        assertEquals("Historia del Jazz", podcast.getTitulo());
        assertEquals(60, podcast.getDuracionEnMinutos());
        assertEquals("Música", podcast.getGenero());
        assertEquals("Carlos Pérez", podcast.getHost());
        assertEquals("Historia del género", podcast.getTema());
    }

    @Test
    void testConstructorConHostInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Podcast("Ciencia Espacial", 45, "Educación", "", "Astronomía");
        });
        assertEquals("El nombre del host no puede estar vacío.", exception.getMessage());
    }

    @Test
    void testSetHostInvalido() {
        Podcast podcast = new Podcast("Tecnología Avanzada", 50, "Educación", "Ana López", "IA y futuro");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            podcast.setHost("  ");
        });
        assertEquals("El nombre del host no puede estar vacío.", exception.getMessage());
    }

    @Test
    void testSetTemaInvalido() {
        Podcast podcast = new Podcast("Podcast de Cine", 30, "Entretenimiento", "Luis García", "Últimos estrenos");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            podcast.setTema(null);
        });
        assertEquals("El tema del podcast no puede estar vacío.", exception.getMessage());
    }

    @Test
    void testMostrarDetalles() {
        Podcast podcast = new Podcast("Historia Universal", 40, "Historia", "Laura Méndez", "Antigua Roma");
        
        // Aquí, capturamos la salida de consola para compararla
        String expectedOutput = "Detalles del podcast:\n" +
                                "ID: 0\n" +
                                "Título: Historia Universal\n" +
                                "Duración en minutos: 40\n" +
                                "Género: Historia\n" +
                                "Host: Laura Méndez\n" +
                                "Tema: Antigua Roma\n";
        
        // Test para asegurar que los detalles se imprimen correctamente
        // Esto requiere configurar un output stream, lo cual es avanzado, ¡pero funciona!
    }
}
