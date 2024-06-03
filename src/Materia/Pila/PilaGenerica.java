package Materia.Pila;

import java.util.EmptyStackException;
import Materia.Models.NodeGenerico;

public class PilaGenerica<T> {

    private NodeGenerico<T> top;
    
    public PilaGenerica(){
        top = null;

    }
        
    public void push (T dato){
        NodeGenerico <T> nuevoNodo = new NodeGenerico<T>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;

    }

    public boolean isEmpty(){
        return top == null;

    }
    
    public T pop (){
        if (isEmpty()){
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();

        }
        return top.data;
    }
    public T peek (){
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
            
        }
        return top.data;
    }
}
