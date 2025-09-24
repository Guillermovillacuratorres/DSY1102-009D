/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String patente;
    private int tamanioMotor;
    private ArrayList<RevisionTecnica> revisiones = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(String patente, int tamanioMotor) {
        this.patente = patente;
        this.tamanioMotor = tamanioMotor;
    }

    public ArrayList<RevisionTecnica> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(ArrayList<RevisionTecnica> revisiones) {
        this.revisiones = revisiones;
    }    
    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getTamanioMotor() {
        return tamanioMotor;
    }

    public void setTamanioMotor(int tamanioMotor) {
        this.tamanioMotor = tamanioMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", tamanioMotor=" + tamanioMotor + ", revisiones=" + revisiones + '}';
    }


    public void agregarRevisionTecnica(RevisionTecnica revision){
        this.revisiones.add(revision);
        System.out.println("Revision agregada correctamente!");
    }
    
    
}
