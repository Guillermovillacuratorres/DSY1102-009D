/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Cetecom
 */
public class SistemaGestionInventario {
    private String medicamentoActual, clienteActual, proveedorActual;

    public SistemaGestionInventario() {
    }

    public SistemaGestionInventario(String medicamentoActual, String clienteActual, String proveedorActual) {
        this.medicamentoActual = medicamentoActual;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    @Override
    public String toString() {
        return "SistemaGestionInventario{" + "medicamentoActual=" + medicamentoActual + ", clienteActual=" + clienteActual + ", proveedorActual=" + proveedorActual + '}';
    }
    
    public void registrarMedicamento(Medicamento medi){
        this.medicamentoActual = medi.getNombre();
    }
    
    public void registrarCliente(Cliente cli){
        this.clienteActual = cli.getNombre();
    }
    
    
}
