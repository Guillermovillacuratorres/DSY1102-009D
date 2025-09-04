/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpersonas;

/**
 *
 * @author Cetecom
 */
public class Genero {
    private int id;
    private String nombreGenero;

    public Genero() {
    }

    public Genero(int id, String nombreGenero) {
        this.id = id;
        this.nombreGenero = nombreGenero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", nombreGenero=" + nombreGenero + '}';
    }
    
    
}
