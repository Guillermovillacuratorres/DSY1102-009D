/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpersonas;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String rut, nombre;
    private int edad;
    private double altura;
    private boolean casado;

    public Persona() {
    }

    public Persona(String rut, String nombre, int edad, double altura, boolean casado) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", casado=" + casado + '}';
    }
    
    
    
    
}
