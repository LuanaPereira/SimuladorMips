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
public class UnidadeDeControle {
    ULA ula = new ULA();
    
    
    int r1;
    int r2;
    int r3;
    public void decisao(String[] inst_Decodificada){ // Se a instrucao for JUMP-J
        if(inst_Decodificada[0].equals("000101")){            
            TelaSimulador.posicao = Integer.parseInt(inst_Decodificada[1]);
            CPU.contador = Integer.parseInt(inst_Decodificada[1]) - 1;
            return;
        }
        
        if(inst_Decodificada[0].equals("000110")){ //Se a instrucao for LOAD-LW
            if(inst_Decodificada[1].equals("00001")){ //Pega o registrador que vai guardar o valor
                r1 = 0;                                  
            }else if(inst_Decodificada[1].equals("00010")){
                r1 = 1;
            }else if(inst_Decodificada[1].equals("00011")){
                r1 = 2;
            }else if(inst_Decodificada[1].equals("00100")){
                r1 = 3;
            }else if(inst_Decodificada[1].equals("00101")){
                r1 = 4;
            }else if(inst_Decodificada[1].equals("00110")){
                r1 = 5;
            }else if(inst_Decodificada[1].equals("00111")){
                r1 = 6;
            }else if(inst_Decodificada[1].equals("01000")){
                r1 = 7;
            }
            
            if(inst_Decodificada[2].equals("01001")){ //Pega o registrador temporario com o valor a ser guardado
                r2 = 0;                                  
            }else if(inst_Decodificada[2].equals("01010")){
                r2 = 1;
            }else if(inst_Decodificada[2].equals("01100")){
                r2 = 2;
            }else if(inst_Decodificada[2].equals("01101")){
                r2 = 3;
            }else if(inst_Decodificada[2].equals("01110")){
                r2 = 4;
            }else if(inst_Decodificada[2].equals("01111")){
                r2 = 5;
            }else if(inst_Decodificada[2].equals("10000")){
                r2 = 6;
            }else if(inst_Decodificada[2].equals("10001")){
                r2 = 7;
            }
            Registradores.reg[r1] = Registradores.temporarios[r2];
            return;
        }
        
        
        if(inst_Decodificada[0].equals("000111")){ // Se a instrucao for Store-SW
            if(inst_Decodificada[1].equals("00001")){ //Pega o valor do registrador que vai guardar
                r1 = 0;                                   
            }else if(inst_Decodificada[1].equals("00010")){
                r1 = 1;
            }else if(inst_Decodificada[1].equals("00011")){
                r1 = 2;
            }else if(inst_Decodificada[1].equals("00100")){
                r1 = 3;
            }else if(inst_Decodificada[1].equals("00101")){
                r1 = 4;
            }else if(inst_Decodificada[1].equals("00110")){
                r1 = 5;
            }else if(inst_Decodificada[1].equals("00111")){
                r1 = 6;
            }else if(inst_Decodificada[1].equals("01000")){
                r1 = 7;
            }
            
            if(inst_Decodificada[2].equals("01001")){ //Pega o registrador que vai guardar o valor
                r2 = 0;                                   
            }else if(inst_Decodificada[2].equals("01010")){
                r2 = 1;
            }else if(inst_Decodificada[2].equals("01100")){
                r2 = 2;
            }else if(inst_Decodificada[2].equals("01101")){
                r2 = 3;
            }else if(inst_Decodificada[2].equals("01110")){
                r2 = 4;
            }else if(inst_Decodificada[2].equals("01111")){
                r2 = 5;
            }else if(inst_Decodificada[2].equals("10000")){
                r2 = 6;
            }else if(inst_Decodificada[2].equals("10001")){
                r2 = 7;
            }
            Registradores.temporarios[r2] = Registradores.reg[r1];
            return;
        }
        
        //Se nao for nenhuma das acima, é add,sub,div ou mul
        //Então pega os valores dos registradores para fazer as operações
        
        //Registrador 1
        if(inst_Decodificada[1].equals("00001")){ 
            r1 = 0;                                   
        }else if(inst_Decodificada[1].equals("00010")){
            r1 = 1;
        }else if(inst_Decodificada[1].equals("00011")){
            r1 = 2;
        }else if(inst_Decodificada[1].equals("00100")){
            r1 = 3;
        }else if(inst_Decodificada[1].equals("00101")){
            r1 = 4;
        }else if(inst_Decodificada[1].equals("00110")){
            r1 = 5;
        }else if(inst_Decodificada[1].equals("00111")){
            r1 = 6;
        }else if(inst_Decodificada[1].equals("01000")){
            r1 = 7;
        }
        
        //Registrador 2
        if(inst_Decodificada[2].equals("00001")){
            r2 = 0;
        }else if(inst_Decodificada[2].equals("00010")){
            r2 = 1;
        }else if(inst_Decodificada[2].equals("00011")){
            r2 = 2;
        }else if(inst_Decodificada[2].equals("00100")){
            r2 = 3;
        }else if(inst_Decodificada[2].equals("00101")){
            r2 = 4;
        }else if(inst_Decodificada[2].equals("00110")){
            r2 = 5;
        }else if(inst_Decodificada[2].equals("00111")){
            r2 = 6;
        }else if(inst_Decodificada[2].equals("01000")){
            r2 = 7;
        }
        
        //Registrador 3
        if(inst_Decodificada[3].equals("00001")){
            r3 = 0;
        }else if(inst_Decodificada[3].equals("00010")){
            r3 = 1;
        }else if(inst_Decodificada[3].equals("00011")){
            r3 = 2;
        }else if(inst_Decodificada[3].equals("00100")){
            r3 = 3;
        }else if(inst_Decodificada[3].equals("00101")){
            r3 = 4;
        }else if(inst_Decodificada[3].equals("00110")){
            r3 = 5;
        }else if(inst_Decodificada[3].equals("00111")){
            r3 = 6;
        }else if(inst_Decodificada[3].equals("01000")){
            r3 = 7;
        }
        
        if(inst_Decodificada[0].equals("000001")){ //Se a instrucao for add
            ula.add(r1,r2,r3);
        }else if(inst_Decodificada[0].equals("000010")){ //Se a instrucao for sub
            ula.sub(r1, r2, r3);
        }else if(inst_Decodificada[0].equals("000011")){ //Se a instrucao for mul
            ula.mul(r1, r2, r3);
        }else if(inst_Decodificada[0].equals("000100")){ //Se a instrucao for div
            ula.div(r1, r2, r3);
        }
    }
}
