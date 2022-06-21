package Adapter;
/**
    * Direct Target Implementation: Already Adapted/Wrapped
*/
public class GuitarraElectrica implements Guitarra{

    public void guitarraEncendida() {
        System.out.println("Tocando la guitarra");
    }
    
    public void guitarraApagada() {
        System.out.println("Guitarra apagada");
    }
}