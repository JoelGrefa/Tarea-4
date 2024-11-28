### README.md

---

# Proyecto: **Contenido Audiovisual**

Este proyecto implementa una jerarquía de clases para manejar distintos tipos de contenido audiovisual, como películas, series de TV, videos musicales y podcasts. Además, incluye funcionalidades para gestionar actores y temporadas, con pruebas unitarias para garantizar el correcto funcionamiento del sistema.

## 📂 **Estructura del Proyecto**

El proyecto está organizado en las siguientes clases dentro del paquete `uni1a`:

- **ContenidoAudiovisual**: Clase abstracta que define la estructura básica del contenido audiovisual.
- **Pelicula**: Representa películas, incluye una lista de actores.
- **SerieDeTV**: Representa series de televisión, incluye temporadas.
- **VideoMusical**: Representa videos musicales con información del artista y director.
- **Podcast**: Representa podcasts con información del host y tema.
- **Actor**: Representa a un actor con nombre y edad.
- **Temporada**: Representa una temporada de una serie con número y cantidad de episodios.

### 📁 **Estructura del Directorio**
```
contenido-audiovisual/
├── src/
│   └── uni1a/
│       ├── ContenidoAudiovisual.java
│       ├── Pelicula.java
│       ├── SerieDeTV.java
│       ├── VideoMusical.java
│       ├── Podcast.java
│       ├── Actor.java
│       └── Temporada.java
└── test/
    └── uni1a/
        └── ContenidoAudiovisualTest.java
```

## 🚀 **Cómo Clonar y Ejecutar el Proyecto**

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/contenido-audiovisual.git
   cd contenido-audiovisual
   ```

2. **Importa el proyecto en tu IDE:**
   - Usa tu IDE favorito, como IntelliJ IDEA o Eclipse.
   - Asegúrate de que el proyecto esté configurado como un proyecto **Maven** o **Gradle**, si estás usando dependencias.

3. **Compila y ejecuta el proyecto:**
   - En tu IDE, compila la aplicación haciendo clic derecho sobre el proyecto y seleccionando **Run**.
   - O, si usas la terminal:
     ```bash
     javac src/uni1a/*.java
     java src/uni1a/Main.java  # Crea un Main para probar
     ```

## 🧪 **Ejecutar Pruebas Unitarias**

### Requisitos:
- **JUnit 5** debe estar configurado en tu proyecto.

### Ejecutar pruebas:
1. Desde tu IDE:
   - Haz clic derecho sobre la carpeta `test/uni1a` y selecciona **Run Tests**.
   
2. Desde la terminal:
   ```bash
   mvn test   # Si usas Maven
   ```

### 📝 **Documentación de Cambios Realizados**
- **Encapsulación**: Se agregaron métodos `getter` y `setter` en todas las clases para garantizar la encapsulación.
- **Herencia**: Se implementó una clase abstracta `ContenidoAudiovisual` que es extendida por `Pelicula`, `SerieDeTV`, `VideoMusical` y `Podcast`.
- **Polimorfismo**: Se implementó el método abstracto `mostrarDetalles()` en cada subclase.
- **Pruebas**: Se crearon pruebas unitarias utilizando JUnit para verificar el correcto funcionamiento de todas las clases.

