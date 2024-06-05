package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Cola {

    private Node first;  //primero
    private Node last;  //last o ultimo nodo de la cola

    public Cola (){
        this.first = null;
        this.first = null;
    }

    //Metodo para agg nodo a la cola
    public void addNode(int value){
        Node nuevoNodo = new Node(value);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }

    }

     //metodo para quitar
     public int remove(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int value = first.value;
        first = first.next;
        if (first==null) {
            last= null;
        }
        return value;
     }

    //peek = obtenia pero no lo sacaba de la cola
    public int peek (){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.value;
    }
    //crea empty

     public boolean isEmpty(){
        return first == null;
     }    

    

    
}
//cola se tienen dos variables tipo node
