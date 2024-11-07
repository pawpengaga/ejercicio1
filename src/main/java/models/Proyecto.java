package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proyecto {

  // Clase final de la que dependen mas elementos
  
  private long idProyecto;
  private String nombreProyecto;
  private Map<Long, Empleado> equipoAsignado = new HashMap<>();
  private List<Tarea> tareas;
  // El proyecto en el futuro deberia tener tambien estado de finalizacion...

  public Proyecto(long idProyecto, String nombreProyecto, Map<Long, Empleado> equipoAsignado) {
    // Las tareas se añaden despues, el equipo es definido desde el inicio, nadie entra, nadie sale
    this.idProyecto = idProyecto;
    this.nombreProyecto = nombreProyecto;
    this.equipoAsignado = equipoAsignado;
    this.tareas = new ArrayList<>();
    
  }

  public long getIdProyecto() {
    return idProyecto;
  }

  public void setIdProyecto(long idProyecto) {
    this.idProyecto = idProyecto;
  }

  public String getNombreProyecto() {
    return nombreProyecto;
  }

  public void setNombreProyecto(String nombreProyecto) {
    this.nombreProyecto = nombreProyecto;
  }

  public Map<Long, Empleado> getEquipoAsignado() {
    return equipoAsignado;
  }

  public void setEquipoAsignado(Map<Long, Empleado> equipoAsignado) {
    this.equipoAsignado = equipoAsignado;
  }

  public List<Tarea> getTareas() {
    return tareas;
  }

  public void setTareas(List<Tarea> tareas) {
    this.tareas = tareas;
  }

  @Override
  public String toString() {
    return "{" +
      " idProyecto='" + getIdProyecto() + "'" +
      ", nombreProyecto='" + getNombreProyecto() + "'" +
      ", equipoAsignado='" + getEquipoAsignado() + "'" +
      ", tareas='" + getTareas() + "'" +
      " }";
  }

    


}
