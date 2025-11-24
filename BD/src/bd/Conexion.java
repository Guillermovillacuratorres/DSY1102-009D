/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Guillermo Villacura
 */
public class Conexion {
    String bd = "automotora";
    String host = "localhost";
    String port = "3306";
    String url = "jdbc:mysql://" + host + ":" + port + "/" + bd;
    String user = "root";
    String pass = "system";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    
    Connection cx;
    
    
    
    public void conectar() {
    try {
      Class.forName(driver);
      cx = DriverManager.getConnection(url, user, pass);
      System.out.println("Conexión exitosa");
    }catch (ClassNotFoundException | SQLException e) {
      System.out.println("Error de conexión: " + e.getMessage());
    }

   }





  public void desconectar(){
    try {
      cx.close();
      System.out.println("Desconexión exitosa");
    } catch (Exception e) {
      System.out.println("Error desconectando de la BD: - " );
    }

  }







  public ResultSet EjecutarQuery(String query) throws SQLException {
      Statement st = cx.createStatement();
      return st.executeQuery(query);

  }

   



   

  public Connection getConnection(){
    return cx;
  }

   
    
}
