/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bd.Conexion;
import java.util.List;
import models.Vehiculo;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class VehiculoController {
    
    
    Conexion cx;

    public VehiculoController() {
        cx = new Conexion();
        cx.conectar();        
    }
    
    
    public List<Vehiculo> listarVehiculos(){
        List<Vehiculo> autos = new ArrayList();
        String query = "SELECT * FROM vehiculo;";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            
            while(rs.next()){
                autos.add(new Vehiculo(
                    rs.getString("patente"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getDate("fecha")
                ));
            }

        } catch (Exception e) { 
            System.out.println("Error al obtener los vehiculos: " + e.getMessage());
        }
        return autos;
    }
    
    
}
