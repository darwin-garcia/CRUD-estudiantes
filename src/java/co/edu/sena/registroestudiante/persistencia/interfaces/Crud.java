/** @author ErickG */

package co.edu.sena.registroestudiante.persistencia.interfaces;

import co.edu.sena.registroestudiante.persistencia.vo.EstudianteVO;
import java.util.List;

public interface Crud {
  
  public List listar();
  public EstudianteVO list(int id);
  public boolean add(EstudianteVO estudiante);
  public boolean edit(EstudianteVO estudiante);
  public boolean eliminar(int id);

} // fin interface Crud
