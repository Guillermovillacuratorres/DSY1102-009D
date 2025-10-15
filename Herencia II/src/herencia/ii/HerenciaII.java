/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia.ii;

import java.util.InputMismatchException;
import java.util.Scanner;
import models.Animal;
import models.Gato;
import models.Perro;

/**
 *
 * @author Cetecom
 */
public class HerenciaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perrito = new Perro();
        Animal gatito = new Gato();
        
        //Animal pajaro = new Animal();
        
        perrito.hacerSonido();
        gatito.hacerSonido();
        
        ((Gato) gatito).setGarras(true);
        
        ((Perro) perrito).setCantidad_patas(4);
        System.out.println(((Perro) perrito).getCantidad_patas());
        
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        try {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            if(edad < 0){
                System.out.println("Solo puede ingresar numeros enteros positivos.");
            }
        } catch (InputMismatchException e) {
            //java.util.InputMismatchException
            System.out.println("Solo se pueden ingresar nuemeros.");
        }
        
    }
    
}
