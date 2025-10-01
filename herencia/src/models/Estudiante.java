/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Estudiante extends Persona{
    private String nombreCarrera;

    public Estudiante() {
    }

    public Estudiante(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Estudiante(String nombreCarrera, String nombre, String rut, String correo, String telefono, String direccion, int edad) {
        super(nombre, rut, correo, telefono, direccion, edad);
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombreCarrera=" + nombreCarrera + '}';
    }
    
    
    
        @Override
    public void saludar(){
        System.out.println("Hola soy un estudiante");
    }
    
}
