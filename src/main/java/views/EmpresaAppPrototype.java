package views;

import java.util.Collection;

import models.Empleado;
import services.EmpleadoService;

public class EmpresaAppPrototype {
  public static void main(String[] args) {

    System.out.println("---------------------------------------------\n");
    
    EmpleadoService empleadoService = new EmpleadoService();
    Empleado ana = new Empleado("12345678-9", "Ana Banana");

    empleadoService.nuevoEmpleado(ana);
    listarServicios(empleadoService.listarEmpleados());

  }

  public static <T> void listarServicios(Collection<T> servicio_in){
    servicio_in.forEach(System.out::println);
  }
}
