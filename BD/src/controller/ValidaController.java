/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Cetecom
 */
public class ValidaController {
    
    public boolean validarTexto(String valor){
        if(valor.length() <= 0){
            System.out.println("El largo del texto debe ser mayor.");
            return false;
        } else if (valor.isBlank() || valor.isEmpty()){
            System.out.println("EL valor no puede estar vacio.");
            return false;
        }else{
            return true;
        }
    }
    
}
