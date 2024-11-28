package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;

    // Constructor con validaciones para garantizar datos consistentes
    public Investigador(String nombre, String especialidad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del investigador no puede estar vacío.");
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad del investigador no puede estar vacía.");
        }
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getter para el nombre del investigador
    public String getNombre() {
        return nombre;
    }

    // Getter para la especialidad del investigador
    public String getEspecialidad() {
        return especialidad;
    }

    // Método para mostrar detalles del investigador
    public void mostrarDetalles() {
        System.out.println("Investigador: " + nombre + " | Especialidad: " + especialidad);
    }
}

