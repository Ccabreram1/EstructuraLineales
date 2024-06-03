package Materia.Models;
//para que funcione con todo 
public class NodeGenerico<T> {
    //Tipo entero int value 
    //tipo generico 
    public T data;
    //next es la referencia y el tipo
        public NodeGenerico<T> next;
    public NodeGenerico (
        
   T data){
    this.data = data;
   }

    
}
