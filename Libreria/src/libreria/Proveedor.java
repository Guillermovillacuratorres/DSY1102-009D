/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Proveedor {
    private String rut, nombre, codigo,especialidad;
    private LocalDate fechaContratacion;

    public Proveedor() {
    }

    public Proveedor(String rut, String nombre, String codigo, String especialidad, LocalDate fechaContratacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.fechaContratacion = fechaContratacion;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "rut=" + rut + ", nombre=" + nombre + ", codigo=" + codigo + ", especialidad=" + especialidad + ", fechaContratacion=" + fechaContratacion + '}';
    }
    
    
}
