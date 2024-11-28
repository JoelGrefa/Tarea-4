package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ContenidoAudiovisualTest {

    @Test
    public void testPelicula() {
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        assertEquals("Inception", pelicula.getTitulo());
        assertEquals(148, pelicula.getDuracionEnMinutos());
        assertEquals("Ciencia Ficción", pelicula.getGenero());

        // Agregar actores
        Actor actor1 = new Actor("Leonardo DiCaprio", 46);
        pelicula.agregarActor(actor1);

        // Validar que los actores se han agregado correctamente
        pelicula.mostrarDetalles();  // Verificación manual
    }

    @Test
    public void testSerieDeTV() {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama");
        assertEquals("Breaking Bad", serie.getTitulo());
        assertEquals(50, serie.getDuracionEnMinutos());
        
        // Agregar temporadas
        Temporada temporada1 = new Temporada(1, 7);
        serie.agregarTemporada(temporada1);
        
        assertEquals(1, temporada1.getNumero());
        assertEquals(7, temporada1.getEpisodios());

        serie.mostrarDetalles();  // Validar manualmente los detalles
    }

    @Test
    public void testVideoMusical() {
        VideoMusical videoMusical = new VideoMusical("Thriller", 14, "Pop", "Michael Jackson", "John Landis");
        assertEquals("Thriller", videoMusical.getTitulo());
        assertEquals("Michael Jackson", videoMusical.getArtista());
        assertEquals("John Landis", videoMusical.getDirector());

        videoMusical.mostrarDetalles();  // Validación manual
    }

    @Test
    public void testPodcast() {
        Podcast podcast = new Podcast("Aprende Java", 60, "Educativo", "Juan Perez", "Programación");
        assertEquals("Aprende Java", podcast.getTitulo());
        assertEquals("Juan Perez", podcast.getHost());
        assertEquals("Programación", podcast.getTema());

        podcast.mostrarDetalles();  // Validación manual
    }

    @Test
    public void testActor() {
        Actor actor = new Actor("Tom Hanks", 65);
        assertEquals("Tom Hanks", actor.getNombre());
        assertEquals(65, actor.getEdad());
    }
}
