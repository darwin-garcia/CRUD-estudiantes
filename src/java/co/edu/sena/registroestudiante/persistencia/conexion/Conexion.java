/** @author ErickG */

package co.edu.sena.registroestudiante.persistencia.conexion;

import java.sql.*;

public class Conexion {
  
  private Connection con;

  public Conexion() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud-estudiantes-1694493", "root", "");
    } catch (Exception e) {
      System.err.println("Error: " + e);
    }
  }
  
  public Connection getConnection(){
    return con;
  }

} // fin clase Conexion
