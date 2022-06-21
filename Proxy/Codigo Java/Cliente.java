package Proxy;
/*
 * Clase Cliente:  el cliente del sujeto tan solo conoce que maneja un objeto de la
 * clase Sujeto. Por tanto, funciona indistintamente con el SujetoReal
 * como con su Proxy.
 */

public class Cliente {

    /**
    * El constructor guarda la referencia al sujeto.
    */
    
    public Cliente(Sujeto sujeto) {
         _sujeto = sujeto; 
    }
   /** 
     * Lo único que realiza el cliente en su método ejecutar es 
     * llamar 2 veces al metodo1, luego 1 vez al metodo2, 
     * y de nuevo al metodo1. _sujeto, ejecutará el método dependiendo
     * si fue creado como proxy o sujetoReal.
     */
  
    public void ejecutar() {
          _sujeto.metodo1();
          _sujeto.metodo1();
          _sujeto.metodo2();
          _sujeto.metodo1();
    }
  
   /**
     *  La clase Cliente tiene el atributo _sujeto que le permite tener una referencia al sujeto al que 
     *  el cliente envía la petición de ejecutar un determinado método.
     */ 
  
       private Sujeto _sujeto;
        
   }
