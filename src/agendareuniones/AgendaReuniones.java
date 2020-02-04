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
public class AgendaReuniones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        panelPrincipal frame = new panelPrincipal();
        Salas salas = new Salas();
        salas.resetAgenda();
        System.out.println(salas.agenda[1][2][3]);
        frame.setVisible(true);
    }
    
}
