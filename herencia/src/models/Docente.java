/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Docente extends Persona{
    private LocalDate fechaEgreso; 
    private int sueldo;
    private String titulo;

    public Docente() {
    }

    public Docente(LocalDate fechaEgreso, int sueldo, String titulo) {
        this.fechaEgreso = fechaEgreso;
        this.sueldo = sueldo;
        this.titulo = titulo;
    }

    public Docente(LocalDate fechaEgreso, int sueldo, String titulo, String nombre, String rut, String correo, String telefono, String direccion, int edad) {
        super(nombre, rut, correo, telefono, direccion, edad);
        this.fechaEgreso = fechaEgreso;
        this.sueldo = sueldo;
        this.titulo = titulo;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    
    public void mostrarNombre(){
        super.getNombre();
    }


    public void robar(){
        super.saludar();
        System.out.println(super.sumar(10,10));
    }
    
}
