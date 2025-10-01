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
public class Persona {
    protected String nombre, rut,correo, telefono, direccion;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, String rut, String correo, String telefono, String direccion, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
    public void saludar(){
        System.out.println("Hoooola" + nombre);
    }
    
    
    public int sumar(int x, int y){
        return x + y;
    }
    
  
    
}
