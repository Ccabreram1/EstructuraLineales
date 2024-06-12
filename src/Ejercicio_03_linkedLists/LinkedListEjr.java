package Ejercicio_03_linkedLists;

import Materia.Models.Node;

public class LinkedListEjr {

    public Node head;
    public LinkedListEjr(){

    }

    // CLASE NODE REPRESENTA CADA ELEMENTO EN LinkedListEjr
    public void addNode (int value){
                if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
    while (current.next !=null){
        current = current.next;
    }

    current.next= new Node(value);
    }

        //METODO PARA QUE ESCOJA LA PRIMERA POSICION DESDE EL FINAL
    public int getByPos(int position) {
        if (head == null) {
            throw new IllegalArgumentException("La lista esta vacia");
                
        }
        Node principal = head;
        Node aux = head;

        int count = 0;
        while (count <= position) {
            if (aux == null) {
                throw new IllegalArgumentException("La posicion es mayor que el numero de nodos de la lista ");
            }
            aux = aux.next;
            count++;
        }
        while (aux != null) {
            principal = principal.next;
            aux = aux.next;
        }
        return principal.value;

    }   
}
    
        


    

