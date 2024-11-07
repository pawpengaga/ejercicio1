package interfaces;

import java.util.Collection;
import java.util.List;

import models.Empleado;
import models.Proyecto;
import models.Tarea;

public interface IProyecto {

  public void nuevoProyecto(Proyecto proyecto);
  public Proyecto obtenerProyecto(long idProyecto);
  public Collection<Proyecto> listarProyectos();
  public void actualizarProyecto(Proyecto proyecto);
  public void eliminarProyecto(long idProyecto);

  // public void asignarEquipo(List<Empleado> equipo);
  // public void agregarTarea(Tarea tarea);

}
