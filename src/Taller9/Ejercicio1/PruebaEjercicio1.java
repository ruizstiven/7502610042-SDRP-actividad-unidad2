package Taller9.Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        Persona per = new Persona("Jose Nieto", 25);
        Empleado emp = new Empleado("Carlos Pérez", 30, "Desarrollo de Software");
        System.out.println("----Persona----");
        per.mostrarDetalles();
        System.out.println("----Empleado----");
        emp.mostrarDetalles();
    }
}