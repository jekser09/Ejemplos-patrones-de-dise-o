package Adapter;
public class GuitarraAcusticaElectrica implements Guitarra{
    GuitarraAcustica acustica = new GuitarraAcustica();
    
    public void onGuitar() {
        acustica.play();
    }
    
    public void offGuitar() {
        acustica.leaveGuitar();
    }
}