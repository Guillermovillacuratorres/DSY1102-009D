/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author Cetecom
 */
public class Estudiante {
    private String rut, nombre, carrera;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, String carrera, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "rut=" + rut + ", nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
    
    
    
}
