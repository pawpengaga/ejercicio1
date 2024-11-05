package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.ITarea;
import models.Tarea;

public class TareaService implements ITarea {

  private Map<Long, Tarea> tareas = new HashMap<>();

  @Override
  public void nuevaTarea(Tarea tarea) {
    if(tareas.containsKey(tarea.getCodTarea())){
      System.out.println("La tarea ya existe...");
    } else {
      tareas.put(tarea.getCodTarea(), tarea);
      System.out.println("Tarea registrada con exito!");
    }
  }

  @Override
  public Tarea obtenerTarea(long codTarea) {
    Tarea tareaBuscada = tareas.get(codTarea);
    if(tareaBuscada == null){
      System.out.println("La tarea no existe...");
      return null;
    }
    return tareaBuscada;

  }

  @Override
  public Collection<Tarea> listarTareas() {
    return tareas.values();

  }

  @Override
  public void actualizarTarea(Tarea tarea) {
    Tarea nuevaTarea = tareas.get(tarea.getCodTarea());

    if (nuevaTarea == null) {
      System.out.println("La tarea que busca actualizar no existe...");
    } else {
      tareas.put(tarea.getCodTarea(), tarea);
    }

  }

  @Override
  public void eliminarTarea(long codTarea) {
    if(tareas.containsKey(codTarea)){
      tareas.remove(codTarea);
      System.out.println("Tarea ELIMINADA exitosamente!!");
    } else {
      System.out.println("El ID de la tarea que busca no figura en nuestra base de datos...");
    }
  }

}
