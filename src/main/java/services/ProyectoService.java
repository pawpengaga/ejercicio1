package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.IProyecto;
import models.Proyecto;

public class ProyectoService implements IProyecto {

  private Map<Long, Proyecto> proyectos = new HashMap<>();

  @Override
  public void nuevoProyecto(Proyecto proyecto) {
    if(proyectos.containsKey(proyecto.getIdProyecto())){
      System.out.println("El proyecto ya existe...");
    } else {
      proyectos.put(proyecto.getIdProyecto(), proyecto);
      System.out.println("Proyecto registrado con exito!");
    }
  }

  @Override
  public Proyecto obtenerProyecto(long idProyecto) {
    
    Proyecto proyectoBuscado = proyectos.get(idProyecto);
    if (proyectoBuscado == null) {
      System.out.println("El proyecto buscado no existe...");
      return null;
    }

    return proyectoBuscado;

  }

  @Override
  public Collection<Proyecto> listarProyectos() {
    return proyectos.values();
  }

  @Override
  public void actualizarProyecto(Proyecto proyecto) {

    Proyecto nuevoProyecto = proyectos.get(proyecto.getIdProyecto());

    if (nuevoProyecto == null) {
      System.out.println("El proyecto que busca actualizar no existe...");
    } else {
      proyectos.put(proyecto.getIdProyecto(), proyecto);
    }

  }

  @Override
  public void eliminarProyecto(long idProyecto) {

    if (proyectos.containsKey(idProyecto)) {
      proyectos.remove(idProyecto);
      System.out.println("Proyecto ELIMINADO exitosamente!!");
    } else {
      System.out.println("El ID del proyecto que busca no figura en nuestra base de datos...");
    }
    
  }


}
