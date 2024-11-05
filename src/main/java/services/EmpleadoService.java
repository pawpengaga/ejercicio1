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
    return null;
  }

  @Override
  public Collection<Empleado> listarEmpleados() {
    return empleados.values();
  }

  @Override
  public void actualizarEmpleado(Empleado empleado) {
  }

  @Override
  public void eliminarEmpleado(String rut) {
  }



}
