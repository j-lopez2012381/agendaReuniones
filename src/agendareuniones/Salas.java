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
    
    int agenda [][][] = new int[7][5][6];  //[h][d][s] -> h = horas, d = dias, s = sala
    
    
       public int estadoSala(int hora, int dia, int sala){
        
        int h = hora;
        int d = dia;
        int s = sala;
        int estado = 0;
        
        if(agenda[h][d][s] == 0){
            
            estado = 0;
            
        }else{
            estado = 1;
    }
        
        return estado;
    }
    
    
    
    public void resetAgenda(){
    
    for (int h = 0; h < agenda.length; h++) {
        for (int d = 0; d < agenda[h].length; d++) {
            for (int s = 0; s < agenda[h][d].length; s++) {
                agenda[h][d][s] = 0;
            }
        }
}
    
    
    } 
}
