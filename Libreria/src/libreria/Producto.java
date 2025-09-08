/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author Cetecom
 */
public class Producto {
    private String codigoUnico, nombre, tipo;
    private int precio;

    public Producto() {
    }

    public Producto(String codigoUnico, String nombre, String tipo, int precio) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoUnico=" + codigoUnico + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    
}
