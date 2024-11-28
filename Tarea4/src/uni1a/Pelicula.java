package uni1a;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;

    // Constructor que inicializa los detalles de la película
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // Inicializa la lista de actores
    }

    // Método para agregar un actor a la lista de actores
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    // Método para mostrar los detalles de la película
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + this.estudio);
        System.out.print("Actores: ");
        
        // Se muestra la lista de actores
        if (actores.isEmpty()) {
            System.out.println("No hay actores disponibles.");
        } else {
            for (Actor actor : actores) {
                System.out.print(actor.getNombre() + " (" + actor.getEdad() + " años), ");
            }
        }
        
        System.out.println("\n");
    }
}

