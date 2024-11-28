package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String host;
    private String tema;

    // Constructor con validaciones
    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, String tema) {
        super(titulo, duracionEnMinutos, genero);
        
        if (host == null || host.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del host no puede estar vacío.");
        }
        if (tema == null || tema.trim().isEmpty()) {
            throw new IllegalArgumentException("El tema del podcast no puede estar vacío.");
        }
        
        this.host = host;
        this.tema = tema;
    }

    // Getters y Setters con validaciones
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        if (host == null || host.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del host no puede estar vacío.");
        }
        this.host = host;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        if (tema == null || tema.trim().isEmpty()) {
            throw new IllegalArgumentException("El tema del podcast no puede estar vacío.");
        }
        this.tema = tema;
    }

    // Método para mostrar los detalles del podcast
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host: " + this.host);
        System.out.println("Tema: " + this.tema);
        System.out.println();
    }
}

