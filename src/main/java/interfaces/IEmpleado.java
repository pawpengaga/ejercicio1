package interfaces;

import java.util.Collection;

import models.Empleado;

public interface IEmpleado {

  // Vamos a hacer un CRUD y a listar todo lo necesario supongo...XD
  // En el futuro usar una clave mas generica para los GET...
  public void nuevoEmpleado(Empleado empleado);
  public Empleado obtenerEmpleado(String rut);
  public Collection<Empleado> listarEmpleados();
  public void actualizarEmpleado(Empleado empleado); // Usaremos el metodo del hashMap
  public void eliminarEmpleado(String rut);

}
