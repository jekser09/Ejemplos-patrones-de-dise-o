package Adapter;
public class EjemploAdapter {
	
	/**
	 * Client: Uses (and only knows) Target Interface
	 */
    public static void main(String args[]){
        Guitarra guitarraElectrica = new GuitarraElectrica();
        guitarraElectrica.guitarraEncendida();
        guitarraElectrica.guitarraApagada();
        Guitarra guitarraAcusticaElec = new GuitarraAcusticaElectrica();
        guitarraAcusticaElec.guitarraEncendida();
        guitarraAcusticaElec.guitarraApagada();
    }
}