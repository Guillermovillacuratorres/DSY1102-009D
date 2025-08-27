/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimeraapp;

/**
 *
 * @author Cetecom
 */
public class MiPrimeraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Celular celUno = new Celular();
         celUno.setAlmacenamiento(256);
         celUno.setBateria(50);
         celUno.setColor("Rojo");
         
         Celular celDos = new Celular(11.5f, 250.2f,"Samsung","Rosa", 128, 500, 95.5, true);
         
         System.out.println(celUno);
         
    }
    
}
