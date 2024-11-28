package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        // Método encargado de mostrar los detalles de un documental
        System.out.println("Detalles del Documental:");
        imprimirDetallesGenerales();
        System.out.println("Tema: " + tema);
        System.out.println("Investigador: " + investigador.getNombre() + " (Especialidad: " + investigador.getEspecialidad() + ")");
        System.out.println();
    }

    // Método para mostrar los detalles comunes a todos los contenidos audiovisuales
    private void imprimirDetallesGenerales() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    }

    // Getters y setters (si son necesarios para la manipulación posterior)
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }
}
