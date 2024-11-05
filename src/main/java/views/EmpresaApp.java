package views;

import java.util.Collection;
import java.util.Scanner;

import models.Empleado;
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
  public static void agregarEmpleados(){
    System.out.println();
    
    System.out.println("Ingrese un RUT para el empleado...");
    String RutInput = myscan.nextLine();
    System.out.println("Ingrese un nombre para el empleado");
    String nombreInput = myscan.nextLine();


    System.out.println();
    System.out.println("Agregando empleado...");
    Empleado empleadoInput = new Empleado(RutInput, nombreInput);
    empleadoService.nuevoEmpleado(empleadoInput);
    System.out.println();
  }

  // Crear proyecto
  public static void crearProyecto(){
    System.out.println("Creando proyecto...");
  }

  // Crear tareas
  public static void crearTareas(){
    System.out.println("Creando tarea...");
  }

  // Ver empleados
  public static void verEmpleados(){
    System.out.println();
    System.out.println("Listando empleados...");
    listarServicios(empleadoService.listarEmpleados());
    System.out.println();
  }

  // Ver proyectos
  public static void verProyectos(){
    System.out.println("Listando proyectos...");
  }

  // Despedir empleados (PENDIENTE)
  // Eliminar tareas (PENDIENTE)
  // Finiquitar proyectos (PENDIENTE)

  // Generar reporte (Vacio de momento)
  public static void generarReporte(){
    System.out.println("Generando reporte...");
  }

  // Salir
  public static void salir(){
    System.out.println("Saliendo...");
    salirMenu = true;
  }
  
  // UTIL
  public static <T> void listarServicios(Collection<T> servicio_in){
    servicio_in.forEach(System.out::println);
  }

  // Main

  public static void main(String[] args) {
    
    /* AQUI VA LA EJECUCION DEL PROGRAMA */
    System.out.println("-----------------------------------------------------------------------\n");
    System.out.println();
    System.out.println("Bievenido al menu de la prueba de Java eeeeeeee");
    do {
      
      System.out.println("1. AGREGAR EMPLEADO");
      System.out.println("2. CREAR PROYECTO");
      System.out.println("3. CREAR TAREA");
      System.out.println("------------------------");
      System.out.println("4. LISTAR EMPLEADOS");
      System.out.println("5. LISTAR PROYECTOS");
      System.out.println("------------------------");
      System.out.println("6. GENERAR REPORTE");
      System.out.println("7. SALIR");

      System.out.println();
      System.out.println("Ingrese una opción...");
      int opcion = myscan.nextInt();
      myscan.nextLine();

      switch (opcion) {
        case 1 -> agregarEmpleados();
        case 2 -> crearProyecto();
        case 3 -> crearTareas();
        case 4 -> verEmpleados();
        case 5 -> verProyectos();
        case 6 -> generarReporte();
        case 7 -> salir();
        default -> System.out.println("Ingrese una opción valida...");
      }


    } while (!salirMenu);

    myscan.close();
  }
}
