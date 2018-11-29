/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormips;

import java.util.logging.Level;
import java.util.logging.Logger;
import tela.TelaSimulador;

/**
 *
 * @author a120185
 */
public class SimuladorMips {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaSimulador tela = new TelaSimulador();
        CPU cpu = new CPU();
        Thread busca = new Thread(cpu);
        
        tela.setVisible(true);
        
        while (true) {
            System.out.println(Registradores.start);
            if (Registradores.start == 1) {
                try {
                    tela.Escrever();
                    Registradores.start = 0;
                } catch (InterruptedException ex) {
                    Logger.getLogger(SimuladorMips.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
