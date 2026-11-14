package Taller10.Ejercicio1;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // Polimorfismo
        Persona profesor = new Profesor();     // Polimorfismo

        persona.presentarse();    // Imprime: Hola, soy una persona.
        estudiante.presentarse(); // Imprime: Hola, soy un estudiante...
        profesor.presentarse();   // Imprime: Hola, soy un profesor...
    }
}