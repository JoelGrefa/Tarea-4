package uni1a;

public class Actor {
    private String nombre;
    private int edad;

    // Constructor que inicializa el nombre y la edad del actor
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre del actor
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad del actor
    public int getEdad() {
        return edad;
    }

    // Método para establecer el nombre del actor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para establecer la edad del actor
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que muestra los detalles del actor
    public void mostrarDetalles() {
        System.out.println("Actor: " + nombre + ", Edad: " + edad);
    }
}

