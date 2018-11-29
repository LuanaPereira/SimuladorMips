/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormips;

/**
 *
 * @author a120185
 */
//fazer generico

public class ULA{

    public void add(int a , int b, int c){
        Registradores.reg[a] = Registradores.reg[b] + Registradores.reg[c];
    }
    
    public void sub(int a, int b, int c){
        Registradores.reg[a] = Registradores.reg[b] - Registradores.reg[c];
    }
    public void mul(int a, int b, int c){
        Registradores.reg[a] = Registradores.reg[b] * Registradores.reg[c];
    }
    public void div(int a, int b, int c){
        Registradores.reg[a] = Registradores.reg[b] / Registradores.reg[c];
    }          
}
