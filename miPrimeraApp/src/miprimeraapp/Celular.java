/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimeraapp;

/**
 *
 * @author Cetecom
 */
public class Celular {
    private float tamanio_pantalla, peso; 
    private String marca,color;
    private int almacenamiento, precio;
    private double bateria;
    private boolean disponible;

    public Celular() {
    }

        public Celular(float tamanio_pantalla, float peso, String marca, String color, int almacenamiento, int precio, double bateria, boolean disponible) {
        this.tamanio_pantalla = tamanio_pantalla;
        this.peso = peso;
        this.marca = marca;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.bateria = bateria;
        this.disponible = disponible;
    }

    public float getTamanio_pantalla() {
        return tamanio_pantalla;
    }

    public void setTamanio_pantalla(float tamanio_pantalla) {
        this.tamanio_pantalla = tamanio_pantalla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Celular{" + "tamanio_pantalla=" + tamanio_pantalla + ", peso=" + peso + ", marca=" + marca + ", color=" + color + ", almacenamiento=" + almacenamiento + ", precio=" + precio + ", bateria=" + bateria + ", disponible=" + disponible + '}';
    }

   

  
   
    

    
}
