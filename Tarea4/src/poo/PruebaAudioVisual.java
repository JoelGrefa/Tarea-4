package poo;
import java.io.*; // Para manejo de archivos

// Definir las clases base y subclases de contenido audiovisual

abstract class ContenidoAudiovisual {
    protected String titulo;
    protected int duracion;
    protected String genero;

    public ContenidoAudiovisual(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public abstract void mostrarDetalles();
}

class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor[] actores = new Actor[5];
    private int contadorActores = 0;

    public Pelicula(String titulo, int duracion, String genero, String estudio) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        if (contadorActores < actores.length) {
            actores[contadorActores++] = actor;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Película: " + titulo + ", " + genero + ", " + duracion + " min, Estudio: " + estudio);
        for (int i = 0; i < contadorActores; i++) {
            System.out.println("Actor: " + actores[i].getNombre());
        }
    }
}

class SerieDeTV extends ContenidoAudiovisual {
    private Temporada[] temporadas = new Temporada[5];
    private int contadorTemporadas = 0;

    public SerieDeTV(String titulo, int duracion, String genero) {
        super(titulo, duracion, genero);
    }

    public void agregarTemporada(Temporada temporada) {
        if (contadorTemporadas < temporadas.length) {
            temporadas[contadorTemporadas++] = temporada;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie de TV: " + titulo + ", " + genero + ", " + duracion + " min");
        for (int i = 0; i < contadorTemporadas; i++) {
            System.out.println("Temporada: " + temporadas[i].getNumero());
        }
    }
}

class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracion, String genero, String tema, Investigador investigador) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + titulo + ", " + genero + ", " + duracion + " min, Tema: " + tema);
        System.out.println("Investigador: " + investigador.getNombre());
    }
}

class VideoMusical extends ContenidoAudiovisual {
    private String cantante;
    private String compositor;

    public VideoMusical(String titulo, int duracion, String genero, String cantante, String compositor) {
        super(titulo, duracion, genero);
        this.cantante = cantante;
        this.compositor = compositor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video Musical: " + titulo + ", " + genero + ", " + duracion + " min, Cantante: " + cantante);
    }
}

class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private String tema;

    public Podcast(String titulo, int duracion, String genero, String anfitrion, String tema) {
        super(titulo, duracion, genero);
        this.anfitrion = anfitrion;
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Podcast: " + titulo + ", " + genero + ", " + duracion + " min, Anfitrión: " + anfitrion);
        System.out.println("Tema: " + tema);
    }
}

class Actor {
    private String nombre;
    private int edad;

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}

class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public int getNumero() {
        return numero;
    }
}

class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancia del controlador
        Controlador controlador = new Controlador();

        // Crear y agregar contenido
        controlador.agregarContenido(new Pelicula("Avatar", 125, "Acción", "20th Century Studios"));
        controlador.agregarContenido(new SerieDeTV("Game of Thrones", 60, "Fantasía"));
        controlador.agregarContenido(new Documental("Cosmos", 45, "Ciencia", "Astronomía", new Investigador("Carl Sagan", "Astronomía")));
        controlador.agregarContenido(new VideoMusical("Ecos del Silencio", 4, "Pop", "Tsuke Kawaii", "Joel Grefa"));
        controlador.agregarContenido(new Podcast("Código Abierto: Conversaciones sobre Tecnología", 70, "Entrevista", "Eddy JG", "Innovación y Software"));

        // Mostrar detalles
        controlador.mostrarDetalles();

        // Guardar los detalles en un archivo
        controlador.guardarDetallesEnArchivo("contenidos.txt");
    }
}

class Controlador {
    private ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
    private int contador = 0;

    public void agregarContenido(ContenidoAudiovisual contenido) {
        if (contador < contenidos.length) {
            contenidos[contador++] = contenido;
        }
    }

    public void mostrarDetalles() {
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido != null) {
                contenido.mostrarDetalles();
            }
        }
    }

    public void guardarDetallesEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                if (contenido != null) {
                    writer.write("Titulo: " + contenido.titulo + ", Duración: " + contenido.duracion + " min, Género: " + contenido.genero);
                    writer.newLine();
                }
            }
            System.out.println("Detalles guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los detalles: " + e.getMessage());
        }
    }
}


