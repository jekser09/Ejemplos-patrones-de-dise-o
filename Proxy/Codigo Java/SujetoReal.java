package Proxy;
/** 
 * La clase SujetoReal es el objeto sobre el que queremos
 * implementar un proxy. Extiende la clase Sujeto implementando los
 * métodos del sujeto (en realidad es el sujeto el que presenta
 * la interfaz de los métodos del sujeto real...)
 */

public class SujetoReal extends Sujeto {

    public SujetoReal(String nombre) { 
       super(nombre); 
       // aquí aparece el código de una inicialización costosa: por ejemplo,  añadir un objeto (que se le pasase como parámetro al constructor) a
       // un vector que tuviese como atributo esta misma clase (SujetoReal), y luego ordenar dicho vector de 
       // mayor a menor en función de un atributo entero que tuviese la clase a la que pertenecen los objetos que contiene el vector.
       // Otro ejemplo de inicialización costosa sería el llamar en el constructor a un método de esta clase: por
       //  ejemplo loadImageFromDisk() lo cual sería lógico si  se tratase de una clase ImagenReal que tuviese como proxy la clase ProxyReal y 
       // como clase abstracta de la que hereda, la clase Imagen.
    }
  
    public void metodo1()  {
        System.out.println("Ejecutando metodo1 en " + this);
     }
  
    public void metodo2() {
        System.out.println("Ejecutando metodo2 en " + this);
     }
  
  }