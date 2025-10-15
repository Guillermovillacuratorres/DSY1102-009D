/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public final class Gato extends Animal{
    private boolean garras;

    public Gato() {
    }

    public Gato(boolean garras) {
        this.garras = garras;
    }

    public Gato(boolean garras, String nombre) {
        super(nombre);
        this.garras = garras;
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    @Override
    public String toString() {
        return "Gato{" + "garras=" + garras + '}';
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("miauuu miaaauuuuuuuuu");
    }
    
    
    @Override
    public void velocidad() {
        System.out.println("Gato corriendo a 10 km/h");
    }
    
}
