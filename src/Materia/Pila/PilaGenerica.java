package Materia.Pila;

import java.util.EmptyStackException;
import Materia.Models.NodeGenerico;

public class PilaGenerica<T> {

    private NodeGenerico<T> top;
    public int size;
    
    public PilaGenerica(){
        top = null;
        size = 0;
    }
        
    public void push (T dato){
        NodeGenerico <T> nuevoNodo = new NodeGenerico<T>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;
        size++;

    }

    public boolean isEmpty(){
        return top == null;

    }
    
    public T pop (){
        if (isEmpty()){
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();

        }
        T value = top.data;
        top=top.next;
        size--;
        return value;
    }
    public T peek (){
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
            
        }
        return top.data;
    }

    public int size(){
        return size;
    }
}
