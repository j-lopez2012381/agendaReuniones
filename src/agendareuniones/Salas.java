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
    
    public void CrearObjetos(){
    panelPrincipal frame = new panelPrincipal();
    panelAgenda frameAgenda = new panelAgenda();
    }
    
    /*public void imprimirEstadoSalas(int dia, int sala){
        //panelPrincipal frame = new panelPrincipal();
        panelAgenda frameAgenda = new panelAgenda();
        int d = dia;
        int s =sala;
        
        if(agenda[0][d][s] == 1){
            frameAgenda.lblEstado9.setText("Ocupado");
            frameAgenda.btnOcupar9.setVisible(false);
        }else{
            frameAgenda.lblEstado9.setText("Libre");
            frameAgenda.btnOcupar9.setVisible(true);
            
        }
        
        if(agenda[1][d][s] == 1){
            frameAgenda.lblEstado10.setText("Ocupado");
            frameAgenda.btnOcupar10.setVisible(false);
        }else{
            frameAgenda.lblEstado10.setText("Libre");
            frameAgenda.btnOcupar10.setVisible(true);
            
        }
        
        if(agenda[2][d][s] == 1){
            frameAgenda.lblEstado11.setText("Ocupado");
            frameAgenda.btnOcupar11.setVisible(false);
        }else{
            frameAgenda.lblEstado11.setText("Libre");
            frameAgenda.btnOcupar11.setVisible(true);
            
        }
        
        if(agenda[3][d][s] == 1){
            frameAgenda.lblEstado12.setText("Ocupado");
            frameAgenda.btnOcupar12.setVisible(false);
        }else{
            frameAgenda.lblEstado12.setText("Libre");
            frameAgenda.btnOcupar12.setVisible(true);
            
        }
        
        if(agenda[4][d][s] == 1){
            frameAgenda.lblEstado13.setText("Ocupado");
            frameAgenda.btnOcupar13.setVisible(false);
        }else{
            frameAgenda.lblEstado13.setText("Libre");
            frameAgenda.btnOcupar13.setVisible(true);
            
        }
        
        if(agenda[5][d][s] == 1){
            frameAgenda.lblEstado14.setText("Ocupado");
            frameAgenda.btnOcupar14.setVisible(false);
        }else{
            frameAgenda.lblEstado14.setText("Libre");
            frameAgenda.btnOcupar14.setVisible(true);
            
        }
        
        if(agenda[6][d][s] == 1){
            frameAgenda.lblEstado15.setText("Ocupado");
            frameAgenda.btnOcupar15.setVisible(false);
        }else{
            frameAgenda.lblEstado15.setText("Libre");
            frameAgenda.btnOcupar15.setVisible(true);
            
        }
       /* }catch(Exception e){
            return;
    }
    }*/
    
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
