import Materia.Models.Pantallas;
import Materia.Pila.*;
import Materia.Cola.*;
import Materia.ListasEnlazadas.ListaEnlazada;
import Ejercicio_01_sign.*;
import Ejercicio_02_sorting.StackSorter;
import Ejercicio_03_linkedLists.LinkedListEjr;

public class App {
    public static void main(String[] args) throws Exception {

        //PILA  
        //Normal

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        System.out.println("PILA");


        System.out.println("Elemento en la cima de la fila es "+ pila.peek());
        System.out.println("Elemento eliminado de la fila es "+pila.pop());
        System.out.println("Elemento en la cima de la fila es "+ pila.peek());


        System.out.println();

        //IMPLEMENTANCION DE PILA GENERICA
        System.out.println("PILA GENERICA");
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();

        pilaPantallas.push(new Pantallas("Home Page", "/home"));
        pilaPantallas.push(new Pantallas("Home Page", "/home/menu"));
        pilaPantallas.push(new Pantallas("Home Page", "/home/menu/settings"));
        System.out.println("La pila tiene "+  pilaPantallas.size() + " elementos");


        //metodo para saber en que pantalla estoy es peek
        System.out.println("Estoy en la pantalla: \n\t --->" + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla: \n\t ---> " + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t --->" + pilaPantallas.peek().getNombre());
        System.out.println("La pila tiene "+  pilaPantallas.size() + " elementos");

        pilaPantallas.push(new Pantallas("Usar Page", "home/menu/user"));
        System.out.println("Estoy en la pantalla: \n\t --->" + pilaPantallas.peek().getNombre());
        System.out.println("La pila tiene "+  pilaPantallas.size() + " elementos");


        //COLA

         //normal
         System.out.println();
        System.out.println("\n COLA");
        Cola queue = new Cola ();
        //anadir elementos a la cola
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        //mostrar elementos en el frente
        System.out.println("Elemento en el frente " + queue.peek()); //10
        //retirar el elemento de la cola
        System.out.println("Elemento retirado " + queue.remove());//10
        System.out.println("Elemento en el frente " + queue.peek());//20

        System.out.println("Elemento retirado " + queue.remove());//20
        System.out.println("Elemento en frente "+ queue.peek());//30

        //verificar si cola esta vacia
        //el signo de pregunta es cono la pregunta y los : es como un if anidado responde al signo de pregunta
        System.out.println("¿Cola esta vacia?"+ (queue.isEmpty() ? "Si":"No"));//false

            //IMPLEMENTANCION DE COLA  TIPO PANTALLA
        //add nodos
        System.out.println();
        System.out.println("COLA GENERICA");
        ColaGenerica<Pantallas> queuGenerica = new ColaGenerica<>();
        queuGenerica.addNode(new Pantallas("Home Page","/Home"));
        queuGenerica.addNode(new Pantallas("Menu Page","/Menu"));
        queuGenerica.addNode(new Pantallas("Settings Page","/Home/Menu/Settings"));
        System.out.println("La cola tiene "+  queuGenerica.size() + " elementos");

        System.out.println("Estoy en la pantalla \t" + queuGenerica.peek().getNombre());
        System.out.println("Pantalla destruida "+ queuGenerica.remove().getNombre());

        queuGenerica.addNode(new Pantallas("User Page", "/Home/Menu/Settings"));
        System.out.println("Estoy en la pantalla \t " + queuGenerica.peek().getNombre());
        System.out.println("Pantalla destruido \t "+ queuGenerica.remove().getNombre());
        System.out.println("Pantalla destruido \t "+ queuGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t " + queuGenerica.peek().getNombre());
        System.out.println("La cola tiene "+  queuGenerica.size() + " elementos");



        //SIGN VALIDATOR 
        //instanciamos
        SignValidator validator = new SignValidator();
        //enviamos para verificar si sale bien o mal
            //true
        System.out.println(validator.isValid("([]){}") );

            //false
        System.out.println(validator.isValid("({)}") );

        //STACK
        StackSorter stack = new StackSorter();
        Pila pil = new Pila();

        pil.push(5);
        pil.push(10);
        pil.push(13);
        pil.push(27);
        pil.push(36);
        pil.push(42);

        stack.sortStack(pil);

        //LISTA ENLAZADA
        ListaEnlazada listaE =  new ListaEnlazada();
        listaE.addNode(1);
        listaE.addNode(4);
        listaE.addNode(3);
        listaE.addNode(6);
        listaE.print();
        listaE.deleteNode(1);
        listaE.print();
        listaE.deleteNode(3);
        listaE.print();


        //LinkedListEjr

        System.out.println("");
        System.out.println("LinkedListEjr");

        LinkedListEjr linkedl = new LinkedListEjr();

        linkedl.addNode(1);
        linkedl.addNode(2);
        linkedl.addNode(3);
        linkedl.addNode(4);
        linkedl.addNode(5);
        linkedl.addNode(6);
        linkedl.addNode(7);
        

        int position = 5;
        int resultado = linkedl.getByPos(position);
        System.out.println("El nodo en la posicion "+ position+ " desde el final es: "+resultado);

      

    }
}
