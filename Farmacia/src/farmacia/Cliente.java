/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private String numeroCliente, nombre, medicamentoAdquirido;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String medicamentoAdquirido) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", medicamentoAdquirido=" + medicamentoAdquirido + '}';
    }
    
    
    public void realizarCompra(Medicamento medi){
        this.medicamentoAdquirido = medi.getNombre();
    }
    
    public void devolverMedicamento(){
        if(this.medicamentoAdquirido.isEmpty()){
            System.out.println("No hay medicamento para devolver.");
        }else{
            this.medicamentoAdquirido = null;
            System.out.println("Medicamento devuelto.");
        }
    }
    
}
