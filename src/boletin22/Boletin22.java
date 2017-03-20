/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        libreria cliente=new libreria();
        libreria dependiente=new libreria();
       
        int opcion;
         do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("/1) Añadir libros. \n2) Consultar libros. \n3) Visualizar. \n4) Borrar libros. \n0 Salir"));
            switch(opcion){
            case 1: 
                cliente.añadir();
                break;
            case 2:
                cliente.consultar();
                break;
            case 3:
                cliente.visualizar();
                break;
            case 4:
                cliente.borrar();
                break;
            case 5:
                dependiente.escribirTexto(null);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        } 
}while(opcion!=0);

    
}
}
   