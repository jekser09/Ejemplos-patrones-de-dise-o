package Proxy;
/**
   * La clase Sujeto dentro del patrón Proxy es la interfaz del sujeto
   * real de cara al exterior (Cliente). Es una clase abstracta cuyos
   * métodos serán implementados tanto por el sujeto real como por el proxy.
   */

  public abstract class Sujeto {

    /**
      * El constructor guarda el nombre del sujeto.
      */
       public Sujeto(String nombre) { 
           _nombre = nombre; 
      }
             
    /**
     * Método que devuelve el nombre del sujeto.
     */
       public String toString() { 
            return _nombre; 
      }
  
    /**
     * Métodos definidos de forma abstracta en la clase Sujeto, y que tendrán distintas implementaciones en las clases que heredan de ésta: Proxy
     * y SujetoReal.
     */
  
       public abstract void metodo1();
       public abstract void metodo2();
  
    /**
     * Este método llama al método toString() de la clase Proxy. Se le pasa un objeto de la clase Sujeto, pero se considera que se trata de un objeto proxy.
     */
  
       public void status (Sujeto sujeto) {
           Proxy p;
           p = (Proxy) sujeto;
           p.toString();
       }   
                         
    /**
     *  La clase Sujeto tiene el atributo _nombre , que indica el nombre  de un sujeto,  tanto si se trata de un proxy
     *  como de un sujeto real.
     */ 
  
       private String  _nombre;
  
  }
