package Taller10.Ejercicio3.SinOverride;

public class PruebaSinOverride {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal leon = new Leon(); // Polimorfismo

        animalGenerico.comer(); // Imprime: El animal come.
        leon.comer();           // Imprime: El león come carne.
    }
}
