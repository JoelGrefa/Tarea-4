package uni1a;
import java.io.*; // Para manejo de archivos

// Definir las clases base y subclases de contenido audiovisual

abstract class ContenidoAudiovisual {
    private static int contar = 0;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contar++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // Getter y Setter para el campo 'titulo'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter para el campo 'duracionEnMinutos'
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    // Getter y Setter para el campo 'genero'
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter para el campo 'id' (no se proporciona el Setter ya que 'id' se asigna en el constructor y parece ser inmutable)
    public int getId() {
        return id;
    }

    public abstract void mostrarDetalles();
}

class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor[] actores = new Actor[5];
    private int contadorActores = 0;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        if (contadorActores < actores.length) {
            actores[contadorActores++] = actor;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Película: " + getTitulo() + ", " + getGenero() + ", " + getDuracionEnMinutos() + " min, Estudio: " + estudio);
        for (int i = 0; i < contadorActores; i++) {
            System.out.println("Actor: " + actores[i].getNombre());
        }
    }
}

class SerieDeTV extends ContenidoAudiovisual {
    private Temporada[] temporadas = new Temporada[5];
    private int contadorTemporadas = 0;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
    }

    public void agregarTemporada(Temporada temporada) {
        if (contadorTemporadas < temporadas.length) {
            temporadas[contadorTemporadas++] = temporada;
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie de TV: " + getTitulo() + ", " + getGenero() + ", " + getDuracionEnMinutos() + " min");
        for (int i = 0; i < contadorTemporadas; i++) {
            System.out.println("Temporada: " + temporadas[i].getNumero());
        }
    }
}

class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + ", " + getGenero() + ", " + getDuracionEnMinutos() + " min, Tema: " + tema);
        System.out.println("Investigador: " + investigador.getNombre());
    }
}

class VideoMusical extends ContenidoAudiovisual {
    private String cantante;
    private String compositor;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String cantante, String compositor) {
        super(titulo, duracionEnMinutos, genero);
        this.cantante = cantante;
        this.compositor = compositor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video Musical: " + getTitulo() + ", " + getGenero() + ", " + getDuracionEnMinutos() + " min, Cantante: " + cantante);
    }
}

class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private String tema;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Podcast: " + getTitulo() + ", " + getGenero() + ", " + getDuracionEnMinutos() + " min, Anfitrión: " + anfitrion);
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

// Controlador que gestiona los contenidos

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
                    writer.write("Titulo: " + contenido.getTitulo() + ", Duración: " + contenido.getDuracionEnMinutos() + " min, Género: " + contenido.getGenero());
                    writer.newLine();
                }
            }
            System.out.println("Detalles guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los detalles: " + e.getMessage());
        }
    }
}

// Vista y ejecución

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancia del controlador
        Controlador controlador = new Controlador();

        // Crear y agregar contenido
        controlador.agregarContenido(new Pelicula("Avatar", 125, "Acción", "20th Century Studios"));
        controlador.agregarContenido(new SerieDeTV

