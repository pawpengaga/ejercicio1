package views;

import models.Empleado;
import models.Tarea;
import services.EmpleadoService;
import services.ProyectoService;
import services.TareaService;
import utilitary.EmpresaUtil;

public class EmpresaAppProtoDos {

  public static void main(String[] args) {

    System.out.println("-------------------------------------------------------------\n");
    
    EmpleadoService empleadoService = new EmpleadoService();
    ProyectoService proyectoService = new ProyectoService();
    TareaService tareaService = new TareaService();

    empleadoService.nuevoEmpleado(new Empleado("12345678-9", "Ana Banana"));
    empleadoService.nuevoEmpleado(new Empleado("57464434-2", "Maria Sandia"));
    empleadoService.nuevoEmpleado(new Empleado("23423321-1", "Mili Pili"));
    empleadoService.nuevoEmpleado(new Empleado("97995423-3", "Riyu Kosaka"));

    tareaService.nuevaTarea(new Tarea(45646, "Podar el pasto", null, null));


    EmpresaUtil.listarServicios(empleadoService.listarEmpleados());

  }

}
