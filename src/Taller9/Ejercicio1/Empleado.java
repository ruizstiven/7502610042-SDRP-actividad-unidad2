package Taller9.Ejercicio1;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Invoca al constructor de Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutiliza el método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}
