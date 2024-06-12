package Materia.ListasEnlazadas;

import Materia.Models.Node;

public class ListaEnlazada {

    public Node head;

    public ListaEnlazada() {
    }

    //AGG NODOS A LA LISTA 
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
     //METODO PARA ELIMINAR POR VALOR
     //DIGO QUE LA CABEZA DE MI PRIMERA LISTA PASE A LA SEGUNDA DE LA FILA
     public void deleteNode (int value){
        //eliminar el que tenga un  valor especifico
        if (head ==null) return; // no hay elementos no hace nada

        if (head.value==value){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next !=null) {
            if (current.next.value==value) {
                current.next= current.next.next;
                return;
            }
            current= current.next;
        }

     }
     
     //METODO 
     public void print (){
        if (head==null) {
            System.out.println("La lista esta vacia");
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.println("Nodo -> " +  current.value);
            current = current.next;
        }
         //para que salga el 6
        System.out.println("Nodo ->" + current.value);
        System.out.println("Fin de la lista");
       
     }
    
}
