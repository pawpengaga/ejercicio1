package interfaces;

import java.util.Collection;

import models.Proyecto;

public interface IProyecto {

  public void nuevoProyecto(Proyecto proyecto);
  public Proyecto obtenerProyecto(long idProyecto);
  public Collection<Proyecto> listarProyectos();
  public void actualizarProyecto(Proyecto proyecto);
  public void eliminarProyecto(long idProyecto);


}
