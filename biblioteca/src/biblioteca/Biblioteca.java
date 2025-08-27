/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Guillermo Villacura
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //f6  atajo compilar el proyecto.
        System.out.println("hola");   //println - print
        
        Libro papelucho = new Libro(); // Constructor sin argumentos 
        
        
        papelucho.setTitulo("Papelucho y el marciano");
        papelucho.setCantidad(3);
        
        
        //Constructor con argumentos
        Libro harry = new Libro("Harry Potter y el caliz de fuego", "Español", "Nuevo mundo", 350, 1500, 4, true, 3.5f);
        
        harry.prestarLibro();
        harry.prestarLibro();
        harry.prestarLibro();
        harry.prestarLibro();
        harry.prestarLibro();
        
        System.out.println(harry);
        
    }
    
}
