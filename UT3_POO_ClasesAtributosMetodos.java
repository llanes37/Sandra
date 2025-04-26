import java.util.ArrayList;
import java.util.List;

/**
 * ! Programación Orientada a Objetos en Java - Guía Completa
 * ? Este archivo ofrece una introducción teórica y práctica a la POO en Java.
 * * Incluye ejemplos ejecutables para comprender cómo funcionan las clases, los objetos
 * * y sus relaciones.
 *
 * ! IMPORTANTE: Asegúrate de tener las extensiones "Java Extension Pack" y "Better Comments" en VS Code.
 * Autor: Joaquín
 * Fecha: 24/01/2025
 */

/**
 * ! Introducción a la Programación Orientada a Objetos (POO)
 *
 * ? La POO es un paradigma de programación basado en el uso de objetos, que son instancias de clases.
 * Principales conceptos:
 *
 * - *Encapsulamiento*: Los datos de una clase se protegen de accesos externos no deseados.
 * - *Herencia*: Permite que una clase derive de otra, reutilizando y extendiendo su funcionalidad.
 * - *Polimorfismo*: Permite usar un mismo método en diferentes contextos o formas.
 * - *Abstracción*: Define la interfaz pública de un objeto ocultando los detalles internos.
 */

/**
 * ! Desarrollo de Clases en Java
 *
 * ? Las clases en Java son plantillas que definen las propiedades (atributos) y comportamientos (métodos) de un objeto.
 * - Una clase puede ser:
 *   - *Pública*: Accesible desde cualquier lugar.
 *   - *Privada*: Solo accesible dentro de su propio paquete.
 *   - *Abstracta*: No puede ser instanciada directamente.
 *   - *Final*: No puede ser extendida por otras clases.
 */

// * Ejemplo práctico: Clases para una institución educativa.
public class UT3_POO_ClasesAtributosMetodos{

    public static void main(String[] args) {
        // ! Crear una nueva clase "Matemáticas" y agregar alumnos.
        Clase matematicas = new Clase("Matemáticas", "Aula 101");

        // ? Agregamos alumnos a la clase de Matemáticas.
        matematicas.agregarAlumno(new Alumno("Juan", "Pérez", 18));
        matematicas.agregarAlumno(new Alumno("jose", "martinez", 18));
        matematicas.agregarAlumno(new Alumno("María", "López", 20));
        matematicas.agregarAlumno(new Alumno("Ana", "perez", 20));

        // ? Mostrar información de la clase y sus alumnos.
        matematicas.mostrarInformacionClase();
    }
}

/**
 * ! Clase Clase (representa una clase educativa)
 */
class Clase {
    // * Atributos
    private String nombre;
    private String aula;
    private List<Alumno> alumnos; // Lista de alumnos en la clase.

    // * Constructor
    public Clase(String nombre, String aula) {
        this.nombre = nombre;
        this.aula = aula;
        this.alumnos = new ArrayList<>(); // Inicializamos la lista de alumnos.
    }

    // * Método para agregar un alumno a la clase.
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Alumno " + alumno.getNombre() + " agregado a la clase " + nombre);
    }

    // * Método para mostrar información de la clase.
    public void mostrarInformacionClase() {
        System.out.println("\nClase: " + nombre);
        System.out.println("Aula: " + aula);
        System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno); // Llamada al método toString() del objeto alumno.
        }
    }
}

/**
 * ! Clase Alumno (representa a un estudiante)
 */
class Alumno {
    // * Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // * Constructor
    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // * Getters
    public String getNombre() {
        return nombre;
    }

    // * toString para imprimir información del alumno.
    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + edad + " años)";
    }
}

/**
 * ! Prácticas recomendadas para el alumno:
 *
 * 1. Modifica el programa para agregar más clases y alumnos.
 * 2. Crea una nueva clase "Profesor" y asígnala a una clase educativa.
 * 3. Implementa un método que permita buscar alumnos por su nombre.
 * 4. Explora el concepto de herencia creando una clase "Persona" que sea padre de "Alumno" y "Profesor".
 */
