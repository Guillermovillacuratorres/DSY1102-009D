/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionpersonas;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class GestionPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Persona p1 = new Persona();
        while(true){
            System.out.println("*****MUENU*****");
            System.out.println("[1] Agregar persona");
            System.out.println("[2] Editar persona");
            System.out.println("[3] Eliminar persona");
            System.out.println("[4] Mostrar persona");
            System.out.println("[5] Salir");
            
            System.out.println("Seleccione un aopcion: ");
            int opc = sc.nextInt();
            /*
            if(opc == 1){
                System.out.println("Opcion 1");
            }
            else if(opc == 2){
                System.out.println("Opcion 2");
            }
            else if(opc ==3){
                System.out.println("Opcion 3");
            }
            */
            
            
            
            
            switch(opc){
                case 1:
                    System.out.println("Ingrese el rut: ");
                    p1.setRut(sc.next());
                    System.out.println("Ingrese el nombre: ");
                    p1.setNombre(sc.next());
                    System.out.println(p1);
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 4:
                    System.out.println(p1);
                default:
                    System.out.println("Opcion no valida!");
                    break;

            }
        }
    }
    
}
