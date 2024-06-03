import Materia.Models.Pantallas;
import Materia.Pila.*;
public class App {
    public static void main(String[] args) throws Exception {

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        System.out.println("Elemento en la cima de la fila es "+ pila.peek());
        System.out.println("Elemento eliminado de la pilas es "+pila.pop());
        System.out.println("Elemento en la cima de la fila es "+ pila.peek());


        System.out.println();

        //IMPLEMENTANCION DE PILA GENERICA
        
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();

        pilaPantallas.push(new Pantallas("Home Page", "/home"));
        pilaPantallas.push(new Pantallas("Home Page", "/home/menu"));
        pilaPantallas.push(new Pantallas("Home Page", "/home/menu/settings"));

        //metodo para saber en que pantalla estoy es peek
        System.out.println("Estoy en la pantalla: \n\t --->" + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla: \n\t ---> " + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t --->" + pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("Usar Page", "home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t --->" + pilaPantallas.peek().getNombre());




    }
}
