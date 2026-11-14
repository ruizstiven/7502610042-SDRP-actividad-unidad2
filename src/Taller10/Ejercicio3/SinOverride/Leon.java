package Taller10.Ejercicio3.SinOverride;

public class Leon extends Animal {
    // Mala práctica: falta @Override
    public void comer() {
        System.out.println("El león come carne.");
    }
}