package interfaces;

import java.util.Collection;

import models.Tarea;

public interface ITarea {
  
  // Se escribe todo en el orden propuesto
  public void nuevaTarea(Tarea tarea);
  public Tarea obtenerTarea(long codTarea); // El codigo es un long eeeeeee
  public Collection<Tarea> listarTareas();
  public void actualizarTarea(Tarea tarea);
  public void eliminarTarea(long codTarea);


}
