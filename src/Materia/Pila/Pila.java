package Materia.Pila;

import Materia.Models.Node;
import java.util.EmptyStackException;

public class Pila {
    
    private Node top;

    public Pila() {
        top=null;
    }
    
    //Push: Agregar elemento a la pila

    public void push (int value){
        Node nuevoNodo = new Node (value);
        nuevoNodo.next = top;
        top =  nuevoNodo;
    }

    //Saca y eliminar el valor 

    public int pop(){
        if (top == null){
            System.out.println("La pila esta vacia");
            //return 0;
            throw new EmptyStackException();

        }else{
            int value = top.value;
            top= top.next;

            return value;

        }
    }

    public int peek (){
        if (top == null){
            System.out.println("La pila est vacia");
            throw new EmptyStackException();

        }
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
