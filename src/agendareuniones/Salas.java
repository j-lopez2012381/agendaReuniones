/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendareuniones;

/**
 *
 * @author Estuardo
 */
public class Salas {
    
    int agenda [][][] = new int[7][5][6];  //[i][o][u] -> i = horas, o = dias, u = sala
    
    
    public void prueba(){
    
    for (int i = 0; i < agenda.length; i++) {
        for (int o = 0; o < agenda[i].length; o++) {
            for (int u = 0; u < agenda[i][o].length; u++) {
                agenda[i][o][u] = 1;
            }
        }
}
    
    
    } 
}
