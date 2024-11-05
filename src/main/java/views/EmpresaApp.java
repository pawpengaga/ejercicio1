package views;

import java.util.Collection;
import java.util.Scanner;

import services.EmpleadoService;
import services.ProyectoService;
import services.TareaService;

public class EmpresaApp {

  // VARIABLES
  static EmpleadoService empleadoService = new EmpleadoService();
  static ProyectoService proyectoService = new ProyectoService();
  static TareaService tareaService = new TareaService();

  // AQUI VA EL EXPORTER PIPIPI

  static Scanner myscan = new Scanner(System.in);
  static boolean salirMenu = false;

  // Agregar empleados

  // Crear proyecto

  // Crear tareas

  // Ver empleados

  // Ver proyectos

  // Despedir empleados

  // Eliminar tareas

  // Finiquitar proyectos

  // Generar reporte (Vacio de momento)

  // Salir
  
  // UTIL
  public static <T> void listarServicios(Collection<T> servicio_in){
    servicio_in.forEach(System.out::println);
  }

  // Main

  public static void main(String[] args) {
    /* AQUI VA LA EJECUCION DEL PROGRAMA */
  }
}
