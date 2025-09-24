/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import colecciones.models.RevisionTecnica;
import colecciones.models.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        
        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Pedrito");
        nombres.add("Juanito");
        nombres.add("Alejandro");
        
        //System.out.println(nombres);
        
        int contador = 0;
        for(String i:nombres){

            //System.out.println(i);
            if(i.equals("Pedrito")){
                System.out.println("Lo encontre --> " + i  + " - " + contador);
            }
            contador ++;
        }
        
        
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while(true){
            System.out.println("[1] - Agregar revision tecnica ");
            System.out.println("[2] - Agregar vehiculo");
            System.out.println("[3] - Mostrar vehiculo]");
            System.out.println("[4] - Salir");
            
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            
            
            
            
            switch(opcion){
                case 1:
                    RevisionTecnica r1 = new RevisionTecnica();
                    System.out.println("Ingrese el año de la revision:");
                    r1.setAnio(sc.nextInt());
                    auto.agregarRevisionTecnica(r1);
                    break;
                case 2: 
                    System.out.println(auto.getRevisiones().get(0).getAnio());
                    break;
                case 3: 
                    System.out.println("opcion 3");
                    break;
                case 4: 
                    System.out.println("Saliendo");
                    break;
            }
        }
        
        
        
        
        
    }
    
}
