/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Medicamento {
    private String codigo, nombre,tipo;
    private int stock;
    private Date caducidad;

    public Medicamento() {
    }

    public Medicamento(String codigo, String nombre, String tipo, int stock, Date caducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + ", caducidad=" + caducidad + '}';
    }
    
    public void vender(Cliente cli){
        if(stock > 0){
            stock --;
            System.out.println("Venta realizada " + nombre + " " 
                                + cli.getNombre());
        }else{
            System.out.println("No tenemos stock.");
        }
    }
    
    
    
}
