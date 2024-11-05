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

  /*
   *  Estructura
   * 1. Agregar Empleados
   * 2. Crear proyecto 
   *  2.1 Seleccione empleados para un equipo
   *  2.2 Agregar nuevo empleado desde aqui
   * 3. Crear tareas
   *  3.1 Seleccione un proyecto al que agregar tareas
   * 4. Despedir Empleados
   * 5. Eliminar tareas
   * 6. Finiquitar Proyectos
   * 7. SALIR
   *
   */

  public static <T> void listarServicios(Collection<T> servicio_in){
    servicio_in.forEach(System.out::println);
  }
}
