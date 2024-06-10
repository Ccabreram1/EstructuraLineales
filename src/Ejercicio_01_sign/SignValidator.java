package Ejercicio_01_sign;

//import Materia.Cola.ColaGenerica;
import Materia.Pila.PilaGenerica;

public class SignValidator {

    public boolean isValid (String s){
        char[] validar =s.toCharArray();
        PilaGenerica<Character> q = new PilaGenerica<>();
        for( char v : validar){

            switch (v) {
                case ')':
                    if (!q.peek().equals('(')) 
                        return false;
                    q.pop();

                    break;
                case ']':
                    if (!q.peek().equals('[')) 
                        return false;
                    q.pop();
                    break;  

                case '}':
                    if (!q.peek().equals('{')) 
                        return false;
                    q.pop();
                    break;

            
                default:
                q.push(v);
                    break;
            }
        }

        if (q.isEmpty()) {
            return true;
        }else {
            return false;
        }


    }


    
}
