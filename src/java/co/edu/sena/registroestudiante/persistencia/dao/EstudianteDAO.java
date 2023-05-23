/** @author ErickG */

package co.edu.sena.registroestudiante.persistencia.dao;

import co.edu.sena.registroestudiante.persistencia.conexion.Conexion;
import co.edu.sena.registroestudiante.persistencia.interfaces.Crud;
import co.edu.sena.registroestudiante.persistencia.vo.EstudianteVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements Crud{
  
  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  EstudianteVO estudiante = new EstudianteVO();

  @Override
  public List listar() {
    ArrayList<EstudianteVO> list = new ArrayList<>();
    String sql = "SELECT * FROM tbestudiante ORDER BY apellidos, nombres";
    try {
      con = cn.getConnection();
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        EstudianteVO est = new EstudianteVO();
        est.setId(rs.getInt("id"));
        est.setDocumento(rs.getString("documento"));
        est.setNombres(rs.getString("nombres"));
        est.setApellidos(rs.getString("apellidos"));
        list.add(est);
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    return list;
  }

  @Override
  public EstudianteVO list(int id) {
    //To change body of generated methods, choose Tools | Templates.
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean add(EstudianteVO estudiante) {
    //To change body of generated methods, choose Tools | Templates.
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean edit(EstudianteVO estudiante) {
    //To change body of generated methods, choose Tools | Templates.
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean eliminar(int id) {
    //To change body of generated methods, choose Tools | Templates.
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  

} // fin clase EstudianteDAO
