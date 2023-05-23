/** @author ErickG */

package co.edu.sena.registroestudiante.persistencia.vo;

public class EstudianteVO {
  
  private int id;
  private String documento;
  private String nombres;
  private String apellidos;

  public EstudianteVO() {
  }

  public EstudianteVO(String documento, String nombres, String apellidos) {
    this.documento = documento;
    this.nombres = nombres;
    this.apellidos = apellidos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  @Override
  public String toString() {
    return "EstudianteVO{" + "id=" + id + ", documento=" + documento + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
  }
  
} // fin clase EstudianteVO
