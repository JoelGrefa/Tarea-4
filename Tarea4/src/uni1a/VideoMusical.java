package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String director;

    // Constructor con validación
    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String director) {
        super(titulo, duracionEnMinutos, genero);
        
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del artista no puede estar vacío.");
        }
        if (director == null || director.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del director no puede estar vacío.");
        }

        this.artista = artista;
        this.director = director;
    }

    // Getters y Setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del artista no puede estar vacío.");
        }
        this.artista = artista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director == null || director.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del director no puede estar vacío.");
        }
        this.director = director;
    }

    // Método para mostrar los detalles del video musical
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + this.artista);
        System.out.println("Director: " + this.director);
        System.out.println();
    }
}


