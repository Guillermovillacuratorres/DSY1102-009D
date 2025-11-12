/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import models.Persona;

/**
 *
 * @author Cetecom
 */
public class PersonaController {
    private static ArrayList<Persona> personas = new ArrayList();
    
    
    
    public void agregarPersona(Persona p){
        personas.add(p);
        System.out.println("Persona agregada");
    }
    
    
    public ArrayList<Persona> listarPersonas(){
        return personas;
    }


    
}
