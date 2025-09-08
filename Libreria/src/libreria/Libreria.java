/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Estudiante Pedrito = new Estudiante();
        Proveedor pro1 = new Proveedor();
        Producto harry = new Producto();
        Pedido p1 = new Pedido();
        
        while(true){
            System.out.println("--MENU--");
            System.out.println("[1] - Agregar estudiante");
            System.out.println("[2] - Agregar proveedor");
            System.out.println("[3] - Agregar producto");
            System.out.println("[4] - Agregar pedido");
            System.out.println("[5] - Salir");
            
            System.out.println("Seleccione una opcion:");
            int opcion = sc.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("Opcion 1");
                case 2:
                    while(true){
                        System.out.println("Ingrese la fecha de contratacion:");
                        String fechaContratacion = sc.nextLine();

                        LocalDate fechaConFormato = LocalDate.parse(fechaContratacion);

                        LocalDate hoy = LocalDate.now();
                        
                        if(fechaConFormato.isAfter(hoy)){
                            System.out.println("La fecha debe ser antes de hoy");
                            continue;
                        }else{
                            pro1.setFechaContratacion(fechaConFormato);
                            break;
                        }
                    }
                    
                    
                    
                    
                    
                    
                case 3:
                    System.out.println("Opcion 1");
                case 4:
                    System.out.println("Opcion 1");
                case 5:
                    System.out.println("Opcion 1");
                default:
                    System.out.println("Opción no valida!!!");
                        
            }
            
        }
    }
    
}
