/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormips;

import tela.TelaSimulador;

/**
 *
 * @author Luana
 */
public class CPU{
   public static int contador = -1;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public String busca(String[] instrucao){
       contador++;
       return instrucao[contador];      
   }
    public String[] decodificador(String instrucao){
        String decodificacao[] = new String[4];
        String mnemonico[] = instrucao.split(" ");
        String registradores[] = mnemonico[1].split(",");
  
        if(mnemonico[0].equals("ADD")){
            decodificacao[0] = "000001";
        }
        else if(mnemonico[0].equals("SUB")){
            decodificacao[0] = "000010";
        }
        else if(mnemonico[0].equals("MUL")){
            decodificacao[0] = "000011";
        }
        else if(mnemonico[0].equals("DIV")){
            decodificacao[0] = "000100";
        }
        else if(mnemonico[0].equals("J")){
            decodificacao[0] = "000101";
            decodificacao[1] = mnemonico[1];
            return decodificacao;
        }
        else if(mnemonico[0].equals("LW")){
            decodificacao[0] = "000110";
            if(registradores[0].equals("$1")){
                decodificacao[1]="00001";
            }else if(registradores[0].equals("$2")){
                decodificacao[1]="00010";
            }else if(registradores[0].equals("$3")){
                decodificacao[1]="00011";
            }else if(registradores[0].equals("$4")){
                decodificacao[1]="00100";
            }else if(registradores[0].equals("$5")){
                decodificacao[1]="00101";
            }else if(registradores[0].equals("$6")){
                decodificacao[1]="00110";
            }else if(registradores[0].equals("$7")){
                decodificacao[1]="00111";
            }else if(registradores[0].equals("$8")){
                decodificacao[1]="01000";
            }
            
            if(registradores[1].equals("$t1")){
                decodificacao[2]="01001";
            }else if(registradores[1].equals("$t2")){
                decodificacao[2]="01010";
            }else if(registradores[1].equals("$t3")){
                decodificacao[2]="01100";
            }else if(registradores[1].equals("$t4")){
                decodificacao[2]="01101";
            }else if(registradores[1].equals("$t5")){
                decodificacao[2]="01110";
            }else if(registradores[1].equals("$t6")){
                decodificacao[2]="01111";
            }else if(registradores[1].equals("$t7")){
                decodificacao[2]="10000";
            }else if(registradores[1].equals("$t8")){
                decodificacao[2]="10001";
            }
            return decodificacao;

        }
        else if(mnemonico[0].equals("SW")){
            decodificacao[0] = "000111";
            if(registradores[0].equals("$1")){
                decodificacao[1]="00001";
            }else if(registradores[0].equals("$2")){
                decodificacao[1]="00010";
            }else if(registradores[0].equals("$3")){
                decodificacao[1]="00011";
            }else if(registradores[0].equals("$4")){
                decodificacao[1]="00100";
            }else if(registradores[0].equals("$5")){
                decodificacao[1]="00101";
            }else if(registradores[0].equals("$6")){
                decodificacao[1]="00110";
            }else if(registradores[0].equals("$7")){
                decodificacao[1]="00111";
            }else if(registradores[0].equals("$8")){
                decodificacao[1]="01000";
            }
            
            if(registradores[1].equals("$t1")){
                decodificacao[2]="01001";
            }else if(registradores[1].equals("$t2")){
                decodificacao[2]="01010";
            }else if(registradores[1].equals("$t3")){
                decodificacao[2]="01100";
            }else if(registradores[1].equals("$t4")){
                decodificacao[2]="01101";
            }else if(registradores[1].equals("$t5")){
                decodificacao[2]="01110";
            }else if(registradores[1].equals("$t6")){
                decodificacao[2]="01111";
            }else if(registradores[1].equals("$t7")){
                decodificacao[2]="10000";
            }else if(registradores[1].equals("$t8")){
                decodificacao[2]="10001";
            }
            return decodificacao;
        }
        
        if(!decodificacao[0].equals("000101")){

            if(registradores[0].equals("$1")){
                decodificacao[1]="00001";
            }else if(registradores[0].equals("$2")){
                decodificacao[1]="00010";
            }else if(registradores[0].equals("$3")){
                decodificacao[1]="00011";
            }else if(registradores[0].equals("$4")){
                decodificacao[1]="00100";
            }else if(registradores[0].equals("$5")){
                decodificacao[1]="00101";
            }else if(registradores[0].equals("$6")){
                decodificacao[1]="00110";
            }else if(registradores[0].equals("$7")){
                decodificacao[1]="00111";
            }else if(registradores[0].equals("$8")){
                decodificacao[1]="01000";
            }

            if(registradores[1].equals("$1")){
                decodificacao[2]="00001";
            }else if(registradores[1].equals("$2")){
                decodificacao[2]="00010";
            }else if(registradores[1].equals("$3")){
                decodificacao[2]="00011";
            }else if(registradores[1].equals("$4")){
                decodificacao[2]="00100";
            }else if(registradores[1].equals("$5")){
                decodificacao[2]="00101";
            }else if(registradores[1].equals("$6")){
                decodificacao[2]="00110";
            }else if(registradores[1].equals("$7")){
                decodificacao[2]="00111";
            }else if(registradores[1].equals("$8")){
                decodificacao[2]="01000";
            }

            if(registradores[2].equals("$1")){
                decodificacao[3]="00001";
            }else if(registradores[2].equals("$2")){
                decodificacao[3]="00010";
            }else if(registradores[2].equals("$3")){
                decodificacao[3]="00011";
            }else if(registradores[2].equals("$4")){
                decodificacao[3]="00100";
            }else if(registradores[2].equals("$5")){
                decodificacao[3]="00101";
            }else if(registradores[2].equals("$6")){
                decodificacao[3]="00110";
            }else if(registradores[2].equals("$7")){
                decodificacao[3]="00111";
            }else if(registradores[2].equals("$8")){
                decodificacao[3]="01000";
            }
        }
        return decodificacao;
    }

   
}
