/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misegundaapp;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class MiSegundaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        
        Vehiculo auto = new Vehiculo("Honda","Civic","Negro",5,31,true,550);
        

        System.out.println("Ingrese la marca:");
        String marca = teclado.next();
        System.out.println("ingrese el modelo:");
        String modelo = teclado.next();
        System.out.println("color: ");
        String color = teclado.next();
        System.out.println("Puertas: ");
        int puertas = teclado.nextInt();
        System.out.println("Velocidad: ");
        int velocidad = teclado.nextInt();
        System.out.println("Disponibilidad: ");
        boolean disponible = teclado.nextBoolean();
        System.out.println("Kilometros: ");
        double km = teclado.nextDouble();
        
        Vehiculo camioneta = new Vehiculo(marca,modelo,color,puertas,velocidad,disponible,km);
        
        
        
        System.out.println(camioneta);
        
        teclado.close();
        
    }
    
}
