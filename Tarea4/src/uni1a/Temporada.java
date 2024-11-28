package uni1a;

public class Temporada {
    private int numero;
    private int episodios;

    // Constructor que inicializa los atributos de la temporada
    public Temporada(int numero, int episodios) {
        // Validaciones simples para evitar valores inválidos
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de temporada debe ser positivo.");
        }
        if (episodios <= 0) {
            throw new IllegalArgumentException("El número de episodios debe ser positivo.");
        }
        this.numero = numero;
        this.episodios = episodios;
    }

    // Método getter para obtener el número de temporada
    public int getNumero() {
        return numero;
    }

    // Método getter para obtener el número de episodios de la temporada
    public int getEpisodios() {
        return episodios;
    }

    // Método para mostrar detalles de la temporada
    public void mostrarDetalles() {
        System.out.println("Temporada " + numero + ": " + episodios + " episodios.");
    }
}

