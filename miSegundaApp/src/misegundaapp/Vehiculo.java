/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misegundaapp;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String marca,color,modelo;
    private int cantidadPuertas, velocidad;
    private boolean disponible; 
    private double km;
    

    public Vehiculo() {
    }

    public Vehiculo(String marca,String modelo, String color, int cantidadPuertas, int velocidad, boolean disponible, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
        this.velocidad = velocidad;
        this.disponible = disponible;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cantidadPuertas=" + cantidadPuertas + ", velocidad=" + velocidad + ", disponible=" + disponible + ", km=" + km + '}';
    }




    public void acelerar(){
        if(this.velocidad >= 50){
            System.out.println("Llegaste al limite de la velocida.");
        }else{  
            System.out.println("Subiendo velocidad!!!!");
            this.velocidad = this.velocidad + 5;  
        }
  
    }
    
}
