package services;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import interfaces.IEmpleado;
import models.Empleado;

public class EmpleadoService implements IEmpleado {

  // El map es <RUT, Empleado@a5645>
  private Map<String, Empleado> empleados = new HashMap<>();

  @Override
  public void nuevoEmpleado(Empleado empleado) {
    if(empleados.containsKey(empleado.getRut())){
      System.out.println("El empleado ya existe...");
    } else {
      empleados.put(empleado.getRut(), empleado);
      System.out.println("Empleado ingresado con exito!");
    }
  }

  @Override
  public Empleado obtenerEmpleado(String rut) {
    // Buscamos al empleado y lo almacenamos
    Empleado empleadoBuscado = empleados.get(rut);
    // Si no existe es null, y si es null retornamos eso
    // Si no es null hay un empleado, lo retornamos
    if(empleadoBuscado == null){
      System.out.println("El empleado no existe...");
      return null;
    }
    return empleadoBuscado;
  }

  @Override
  public Collection<Empleado> listarEmpleados() {
    return empleados.values();
  }

  @Override
  public void actualizarEmpleado(Empleado empleado) {
    // Lo que entrara es un empleado con distintos datos pero con el mismo RUT
    // Lo almacenamos en una variable solo con fines de validacion
    Empleado nuevoEmpleado = empleados.get(empleado.getRut());

    if (nuevoEmpleado == null) {
      System.out.println("El empleado que busca actualizar no existe...");
    } else {
      // Debido al comportamiendo del hashmap, si una misma clave se busca poner 2 veces, el valor mas reciente la va a sobre escrbir
      // Hace solo el update
      empleados.put(empleado.getRut(), empleado);
    }


  }

  @Override
  public void eliminarEmpleado(String rut) {
    if(empleados.containsKey(rut)){
      empleados.remove(rut);
      System.out.println("Empleado ELIMINADO exitosamente!!");
    } else {
      System.out.println("El ID del empleado que busca no figura en nuestra base de datos...");
    }
  }



}
