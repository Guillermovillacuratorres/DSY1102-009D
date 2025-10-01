/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.time.LocalDate;
import java.util.ArrayList;
import models.Docente;
import models.Estudiante;
import models.Persona;

/**
 *
 * @author Cetecom
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fecha = "2025-10-01";
        LocalDate now = LocalDate.parse(fecha);
        
        Docente profe = new Docente(now,500,"Informatico","Pedro","123-9","asd@duoc.cl","133","mi casa",10);
        Docente profeDos = new Docente(now,500,"Informatico","Pedro","123-9","asd@duoc.cl","133","mi casa",10);
        Estudiante estu = new Estudiante("Mecanica","Juan","321-0","mecanico@duoc.cl","133","taller",20);
        
        
        profe.saludar();
        
        
        ArrayList<Persona> muchasPersonas = new ArrayList<>();
        
        
        
        muchasPersonas.add(profe);
        muchasPersonas.add(profeDos);
        muchasPersonas.add(estu);
        
        
        for(Persona i : muchasPersonas){
            System.out.println("111111" + i);
            i.saludar();
            if(i instanceof Docente){
                System.out.println("hay un docente");
            }
        }
        
        
    }
    
}
