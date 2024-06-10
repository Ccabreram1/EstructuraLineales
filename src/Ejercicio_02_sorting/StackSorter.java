package Ejercicio_02_sorting;


import Materia.Pila.Pila;

public class StackSorter {

    public void sortStack (Pila  stack){

        Pila StackPila = new Pila();
        Pila aux = new Pila();

        while (!stack.isEmpty()) {

            if(StackPila.isEmpty() && aux.isEmpty()){
                StackPila.push(stack.pop());
            } else{

                try {
                    if (StackPila.peek() >= stack.peek()) {
                        aux.push(StackPila.pop());
                    } else {
                        throw new Exception();
                    }
                } catch(Exception e){
                    StackPila.push(stack.pop());
                    while (!aux.isEmpty()) {
                        StackPila.push(aux.pop());
                    }
                }
            }
            
        }
        System.out.println();
        while (!StackPila.isEmpty()) {
            System.out.println(StackPila.pop()+(StackPila.isEmpty()?"":"-"));
        }
        


    }

    public void sortStack2(Pila a) {
        Pila newPila = new Pila();
        Pila aux = new Pila();
        while (!a.isEmpty()) {
            if (newPila.isEmpty()) {
                newPila.push(a.pop());
            } else {
                try {
                    while (newPila.peek() > a.peek()) {
                        aux.push(newPila.pop());
                    }
                } catch (Exception e) {
                    System.out.println("No existe");
                }
                newPila.push(a.pop());
                while (!aux.isEmpty()) {
                    newPila.push(aux.pop());
                }

            }

        }
        while (!newPila.isEmpty()) {
            System.out.println(newPila.pop());
        }
    }    
   
    
}
