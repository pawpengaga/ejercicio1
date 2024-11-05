package models;

public class Tarea {

  // Segunda clase, tiene un empleado asignado y es eliminada de la lista una vez completada

  private long codTarea;
  private String descripcionTarea;
  private Empleado empleadoAsignado;
  private Proyecto proyectoPerteneciente;
  private boolean estaFinalizada;


  public Tarea(long codTarea, String descripcionTarea, Empleado empleadoAsignado, Proyecto proyectoPerteneciente) {
    this.codTarea = codTarea;
    this.descripcionTarea = descripcionTarea;
    this.empleadoAsignado = empleadoAsignado;
    this.proyectoPerteneciente = proyectoPerteneciente;
    this.estaFinalizada = false; // Una vez creada la tarea siempre parte como no finalizada
  }

  public long getCodTarea() {
    return this.codTarea;
  }

  public void setCodTarea(long codTarea) {
    this.codTarea = codTarea;
  }

  public String getDescripcionTarea() {
    return this.descripcionTarea;
  }

  public void setDescripcionTarea(String descripcionTarea) {
    this.descripcionTarea = descripcionTarea;
  }

  public Empleado getEmpleadoAsignado() {
    return this.empleadoAsignado;
  }

  public void setEmpleadoAsignado(Empleado empleadoAsignado) {
    this.empleadoAsignado = empleadoAsignado;
  }

  public boolean isEstaFinalizada() {
    return this.estaFinalizada;
  }

  public boolean getEstaFinalizada() {
    return this.estaFinalizada;
  }

  public void setEstaFinalizada(boolean estaFinalizada) {
    this.estaFinalizada = estaFinalizada;
  }

  public Proyecto getProyectoPerteneciente() {
    return proyectoPerteneciente;
  }

  public void setProyectoPerteneciente(Proyecto proyectoPerteneciente) {
    this.proyectoPerteneciente = proyectoPerteneciente;
  }

  @Override
  public String toString() {
    
    String statusMessage = isEstaFinalizada() ? "FINALIZADA" : "No finalizada...";
    
    return "{" +
      " codTarea='" + getCodTarea() + "'" +
      ", descripcionTarea='" + getDescripcionTarea() + "'" +
      ", empleadoAsignado='" + getEmpleadoAsignado() + "'" +
      ", proyectoPerteneciente='" + getProyectoPerteneciente() + "'" +
      ", estaFinalizada='" + statusMessage + "'" +
      " }";
  }

  // Esto debe ir en una clase servicio luego...
  public void finalizarTarea(){
    
    if(this.estaFinalizada == true){
      System.out.println("No se puede re abrir la tarea...");
    }
    // En el futuro dar la posibilidad de reabrir tickets como en Jira
    this.estaFinalizada = true;
  }


}
