package Proxy;
/**
 * Éste es el objeto Proxy. Este proxy es simultáneamente un 
 *
 * (a) proxy virtual que retrasa la creación del objeto real hasta que
 *     se invoca alguno de sus métodos.
 * (b) referencia inteligente, realizando labores de contabilización
 *     del número de veces que se invoca un método.
 */

public class Proxy extends Sujeto {

    /**
     * el constructor de la clase, además de inicializar a la parte
     * correspondiente a la superclase, establece a null la referencia
     * al sujeto real e inicializa la contabilización.
     */
 
   public Proxy (String nombre) {
      super(nombre);
     _sujetoReal = null;
    _accesosMetodo1 = 0;
    _accesosMetodo2 = 0;
   }
 
   /**
    * En lugar de realizar de cada vez una comprobación de si el
    * sujeto real esta creado y en caso contrario crearlo, se define
    * este método privado.
    */
 
   private SujetoReal obtenerSujetoReal() {
     if (_sujetoReal == null)
       _sujetoReal = new SujetoReal(this + " (Real)");
 
     return _sujetoReal;
   }
  /**
    * Los métodos delegan en el sujeto real.
    */
 
   public void metodo1() { 
     _accesosMetodo1++; 
     obtenerSujetoReal().metodo1(); 
   }
 
   public void metodo2() { 
     _accesosMetodo2++;
     obtenerSujetoReal().metodo2(); 
   }
 
   /**
     * Este método permite presentar información de contabilización
     * de uso del objeto.
     */
 
   public String toString() {
     if (_sujetoReal != null)
       System.out.println("Accesos a " + _sujetoReal + 
                          ": metodo1=" + _accesosMetodo1 + 
                          ", metodo2=" + _accesosMetodo2);
     else 
       System.out.println("Sujeto Real (" + this + ") no creado.");
 
     return "";
   }
 
   /**
    * Atributos privados: _sujetoReal que le permite a la clase Proxy tener una referencia al sujeto real y los contabilizadores de los accesos a
   * los métodos 1 y 2.
    */
 
   private SujetoReal _sujetoReal; 
   private int  _accesosMetodo1, _accesosMetodo2;
 }
