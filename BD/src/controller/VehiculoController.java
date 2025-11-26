/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bd.Conexion;

import java.util.List;
import models.Vehiculo;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    
    
    
    
    public void agregarVehiculo(String patente, String marca, String modelo, Date fecha){
        
        String query = "INSERT INTO vehiculo (patente, marca, modelo, fecha) VALUES (?,?,?,?);";
        
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setString(1, patente);
            st.setString(2, marca);
            st.setString(3, modelo);
            st.setDate(4, new java.sql.Date(fecha.getTime()));
            st.executeUpdate();
            System.out.println("Vehiculo agregado");
        } catch (Exception e) {
            System.out.println("Error al agregar vehiculo: " + e.getMessage());
        }
    }
    
    
    public Vehiculo buscarAuto(String patente){
        String query = "SELECT * FROM vehiculo WHERE patente = '" + patente + "';";
        System.out.println(query);
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            
            while(rs.next()){
                 Vehiculo v = new Vehiculo(
                    rs.getString("patente"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getDate("fecha")
                );
                return v;
            }
            
            
        } catch (Exception e) {
            System.out.println("Error al buscar: " + e.getMessage());
        }
        return null;
    }
    
    
    public void actualizarVehiculo(Vehiculo v){
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String fechaFormateada = sdf.format(v.getFecha());
        
        String query = "UPDATE vehiculo SET marca = '" + v.getMarca() 
                + "', modelo = " + "'" + v.getModelo() + "'," + "fecha = '" + fechaFormateada+  "'" + 
                " WHERE patente = '" + v.getPatente() + "';"  ;
        
        System.out.println("FECHA ACTUAL  --> " + fechaFormateada );
        System.out.println("1111" + query);
        
        try {
            
            if(buscarAuto(v.getPatente()) == null){
                System.out.println("Auto no encontrado");
            }else{
                Statement st = cx.getConnection().createStatement();
                st.executeUpdate(query);
                System.out.println("Vehiculo actualizado");
            }
     
        } catch (Exception e) {
            System.out.println("Error al actulizar vehiculo: " + e.getMessage());
        }
    }
    
    public void eliminarVehiculo(String patente){
        String query = "DELETE FROM vehiculo WHERE patente = '" + patente + "';";
        System.out.println(query);
        
        try {
            if(buscarAuto(patente) == null){
                System.out.println("Auto no encontrado");
            }else{
                  Statement st = cx.getConnection().createStatement();
                  st.executeUpdate(query);
                  System.out.println("Auto eliminado!!");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
    
}
