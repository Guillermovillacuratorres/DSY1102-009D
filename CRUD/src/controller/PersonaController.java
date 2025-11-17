/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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

    
    public Persona buscarPersona(String rut){
        for(Persona p : personas){
            if(p.getRut().equals(rut)){
                return p;
            }
        }
        return null;
    }
    
    
    public void eliminarPersona(String rut){
     Persona personaEncontrada = buscarPersona(rut);
     if(personaEncontrada != null){
         personas.remove(personaEncontrada);
         //System.out.println("Persona eliminada.");
         JOptionPane.showMessageDialog(null, 
                 "Persona eliminada correctamente",
                 "Informacion",
                 JOptionPane.INFORMATION_MESSAGE);
     }else{
         System.out.println("Persona no encontrada");
     }
    }
    
    
    
    public void actualizarPersona(Persona p){
        Persona personaEncontrada = buscarPersona(p.getRut());
        if(personaEncontrada != null){
            personaEncontrada.setNombre(p.getNombre());
            personaEncontrada.setEdad(p.getEdad());
            System.out.println("Persona actualizada.");
        }else{
            System.out.println("Persona no encontrada.");
        }
    }

    
}
