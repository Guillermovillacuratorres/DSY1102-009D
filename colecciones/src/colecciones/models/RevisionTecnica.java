/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.models;

/**
 *
 * @author Cetecom
 */
public class RevisionTecnica {
    private int anio;

    public RevisionTecnica() {
    }

    public RevisionTecnica(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "RevisionTecnica{" + "anio=" + anio + '}';
    }
    
    
    
}
