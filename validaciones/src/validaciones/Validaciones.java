/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaciones;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Validaciones {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //String nombre = validarTexto("Ingrese su nombre:");
        //System.out.println("Nombre: " + nombre);
        
        int edad = validaNumeros("Ingrese su edad:");
        System.out.println("Edad: " + edad);
    }
    
    private static String validarTexto(String msg){
        while(true){
            System.out.println(msg);
            String valor = sc.nextLine();
            
            if(valor.isBlank() || valor.isEmpty()){
                System.out.println("El valor no puede estar vacío.");
            }else if(textoContieneNumeros(valor) == true){
                System.out.println("El valor no puede contener numeros.");
            }else if(valor.length() < 3){
                System.out.println("El valor no puede ser menor a 3 caracteres.");
            }else if(valor.length() > 10){
                System.out.println("El valor no debe ser mayor a 10 caracteres.");
            }else{
                return valor;
            }
        }
    }
    
    //Bienvenidos
    private static boolean textoContieneNumeros(String valor){
        String numeros = "1234567890";
        for(char i :valor.toCharArray()){
            for(char j :numeros.toCharArray()){
                if(i == j){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    private static int validaNumeros(String msg){
        while(true){
            try {
                System.out.println(msg);
                int valor = sc.nextInt();
                if(valor > 0){
                    return valor;
                }else{
                    System.out.println("El valor debe ser positivo.");
                }
            } catch (Exception e) {
                System.out.println("Solo se puede ingresar numeros.");
                sc.nextLine();
            }
            
                    
        }
    }
}
