package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private ArrayList<Temporada> temporadas;

    // Constructor que inicializa los detalles de la serie y la lista de temporadas
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>(); // Inicializa la lista de temporadas
    }

    // Método para agregar una temporada a la serie
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    // Método para mostrar los detalles de la serie
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());

        // Mostrar detalles de las temporadas
        if (temporadas.isEmpty()) {
            System.out.println("No hay temporadas disponibles.");
        } else {
            System.out.print("Temporadas: ");
            for (Temporada temp : temporadas) {
                System.out.print("Temporada " + temp.getNumero() + " (" + temp.getEpisodios() + " episodios), ");
            }
        }
        
        System.out.println("\n");
    }
}


