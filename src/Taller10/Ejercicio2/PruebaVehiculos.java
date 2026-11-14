package Taller10.Ejercicio2;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        vehiculo.moverse();  // Imprime: El vehículo se está moviendo.
        bicicleta.moverse(); // Imprime: La bicicleta avanza pedaleando.
    }
}