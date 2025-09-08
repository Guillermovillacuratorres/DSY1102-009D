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
public class Pedido {
    private Estudiante estudiante;
    private Producto producto;
    private Proveedor proveedor;
    private int cantidad;
    private LocalDate fechaPedido;

    public Pedido() {
    }

    public Pedido(Estudiante estudiante, Producto producto, Proveedor proveedor, int cantidad, LocalDate fechaPedido) {
        this.estudiante = estudiante;
        this.producto = producto;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "estudiante=" + estudiante + ", producto=" + producto + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", fechaPedido=" + fechaPedido + '}';
    }
    
    public int calcularTotalBruto(){
        return cantidad * producto.getPrecio();
    }
    
    public double calcularDescuento(){
        if(calcularTotalBruto() > 30000){
            return calcularTotalBruto() - (calcularTotalBruto() * 0.15 );
        }else if(calcularTotalBruto() > 60000){
            return calcularTotalBruto() - (calcularTotalBruto() * 0.25);
        }else{
            return calcularTotalBruto();
        }
    }
    
    
    public String calcularEnvio(){
        if(estudiante.getEdad() >= 18 && calcularDescuento() > 40000){
            return "Envio gratis";
        }else{
            return "Debe pagar por el envio";
        }
    }
    
    // && ---> and - Y
    // || ---> or - O
}
