
package simuladormips;

import java.util.ArrayList;


public class Memoria {
    ArrayList<String> memoria = new ArrayList<String> ();
    
    public String ler(){
        return null;
    }
    
    public boolean escrever(String instrucao){ 
        memoria.add(instrucao); //adiciona a intrucao passada na memoria
        return true; //se der certo retorna verdadeiro
    }
}
