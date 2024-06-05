package Materia.Cola;
import java.util.NoSuchElementException;

import Materia.Models.NodeGenerico;

public class ColaGenerica<T> {

    private NodeGenerico<T> first;
    private NodeGenerico<T> last;
    private int size; // add para mantener el tamano de la cola


    public ColaGenerica(){
        this.first= null;
        this.last= null;
        this.size=0; // inicializar el tamano 0
    }

    public void addNode(T data){
        NodeGenerico<T> nuevoNodo = new NodeGenerico<>(data);
        if (isEmpty()) {
            first= nuevoNodo;
            last= nuevoNodo;
        }else{
            last.next= nuevoNodo;
            last= nuevoNodo;
        }
        size ++; //incrementa el tamano al agg un nodo 
    }


    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La Cola esta vacia");
        }
        T value = first.data;
        first = first.next;

        if (first == null) {
            last=null;
            
        }
        size --; // minora el tamano al eliminar un nodo
        return value;
    }

    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La Cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    //retorne el tamano del arreglo

    public int size (){
        return size;
    }
    
    

    
}
