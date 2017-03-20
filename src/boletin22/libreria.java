/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static libreria.milibreria.titulo;
import static libreria.milibreria.autor;
import static libreria.milibreria.precio;
import static libreria.milibreria.unidades;

/**
 *
 * @author ped90
 */
public class libreria {
    ArrayList <libros> biblioteca = new ArrayList<libros>();
    
    public void añadir(){
    biblioteca.add(new libros(titulo(),autor(), precio(), unidades()));
}
    public void consultar(){
    String libros=JOptionPane.showInputDialog("Consulta ->");
            boolean consulta=false;
            for(int i=0;i<biblioteca.size();i++){
                if(biblioteca.get(i).titulo.equals(libros)){
                System.out.println("Libro encontrado");
                consulta=true;
                System.out.println("Titulo: "+biblioteca.get(i).titulo+" Precio: "+ (biblioteca.get(i).precio));
                }
            }
            if(consulta==false)
                System.out.println("Libro no encontrado");
            
} 
    public void visualizar(){
     for(int i=0; i<biblioteca.size();i++)
         System.out.println(biblioteca.get(i));
    }
    
    public void borrar(){
    for(int i=0;i<biblioteca.size();i++){
        if(biblioteca.get(i).unidades==0)
            biblioteca.remove(i);

    }
}
    public void escribirTexto(String nombre){
         File fich;
         PrintWriter f = null;
        try{
            fich = new File (nombre);
            f= new PrintWriter(fich);
            for(int i=0;i<biblioteca.size();i++){
              f.println(biblioteca.get(i));  
          
            }
           
        }catch (FileNotFoundException ex){
            System.out.println("Not Found" + ex.getMessage());  
        }
        finally{
            f.close();
        }      
}   
    

 
}
