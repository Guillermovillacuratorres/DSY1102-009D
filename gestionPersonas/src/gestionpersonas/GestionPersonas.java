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

        for (int i = 0; i < 5; i++) {
            System.out.println("hola - " + i);
        }

        String nombre = "Pedrito";

        System.out.println(nombre.length());
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());

        if (nombre.isEmpty()) {
            System.out.println("Está vacío.");
        } else {
            System.out.println("no está vacío.");
        }

        if (nombre.isBlank()) {
            System.out.println("Esta en blanco");
        } else {
            System.out.println("No esta en blanco");
        }

        if (nombre.equals("Hola")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }
        //Pedrito
        //0123456
        System.out.println(nombre.subSequence(1, 4));

        if (nombre.startsWith("pe")) {
            System.out.println("Siiii");
        } else {
            System.out.println("Nooooo");
        }

        if (nombre.endsWith("ito")) {
            System.out.println("VERDADERO");
        } else {
            System.out.println("FALSO");
        }

        String nombreNuevo = nombre.replace("o", "@");
        System.out.println(nombreNuevo);

        System.out.println(nombre.trim());

        int num = 15;
        String numeroTexto = String.valueOf(num);

        int numero = Integer.parseInt(numeroTexto);

        Genero masculino = new Genero(1,"Hombre");
        Genero femenino = new Genero(2,"Mujer");
        
        
        Persona p1 = new Persona();
        p1.setGenero(masculino);
        System.out.println(p1.getGenero().getNombreGenero());
        /*  while(true){
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

 /* 
            
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
         */
    }

}
