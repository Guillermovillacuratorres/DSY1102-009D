/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public final class Perro extends Animal implements PerritoAyuda{
    private int cantidad_patas;

    public Perro() {
    }

    public Perro(int cantidad_patas) {
        this.cantidad_patas = cantidad_patas;
    }

    public Perro(int cantidad_patas, String nombre) {
        super(nombre);
        this.cantidad_patas = cantidad_patas;
    }

    public int getCantidad_patas() {
        return cantidad_patas;
    }

    public void setCantidad_patas(int cantidad_patas) {
        this.cantidad_patas = cantidad_patas;
    }

    @Override
    public String toString() {
        return "Perro{" + "cantidad_patas=" + cantidad_patas + '}';
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("guauuu guuuuauu  guauuuu!!!");
    }

    @Override
    public void velocidad() {
        System.out.println("Perro corriendo a 15 km/h");
    }

    @Override
    public void pedirAyuda() {
        System.out.println("Ayuuuuuaaaaa!!!  " + PerritoAyuda.DIRECCION);
    }
    
    
}
