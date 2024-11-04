package models;

public class Tarea {

  // Segunda clase, tiene un empleado asignado y es eliminada de la lista una vez completada

  private long codTarea;
  private String descripcionTarea;
  private Empleado empleadoAsignado;
  private boolean estaFinalizada;


  public Tarea(long codTarea, String descripcionTarea, Empleado empleadoAsignado) {
    this.codTarea = codTarea;
    this.descripcionTarea = descripcionTarea;
    this.empleadoAsignado = empleadoAsignado;
    this.estaFinalizada = false; // Una vez creada la tarea siempre parte como no finalizada
  }

  public long getCodTarea() {
    return codTarea;
  }

  public void setCodTarea(long codTarea) {
    this.codTarea = codTarea;
  }

  public String getDescripcionTarea() {
    return descripcionTarea;
  }

  public void setDescripcionTarea(String descripcionTarea) {
    this.descripcionTarea = descripcionTarea;
  }

  public Empleado getEmpleadoAsignado() {
    return empleadoAsignado;
  }

  public void setEmpleadoAsignado(Empleado empleadoAsignado) {
    this.empleadoAsignado = empleadoAsignado;
  }

  public boolean isEstaFinalizada() {
    return estaFinalizada;
  }

  public void setEstaFinalizada(boolean estaFinalizada) {
    this.estaFinalizada = estaFinalizada;
  }


  @Override
  public String toString() {
    
    String statusMessage = isEstaFinalizada() ? "FINALIZADA" : "No finalizada...";
    
    return "{" +
      " codTarea='" + getCodTarea() + "'" +
      ", descripcionTarea='" + getDescripcionTarea() + "'" +
      ", empleadoAsignado='" + getEmpleadoAsignado() + "'" +
      ", estaFinalizada='" + statusMessage + "'" +
      " }";
  }


  public void finalizarTarea(){
    
    if(this.estaFinalizada == true){
      System.out.println("No se puede re abrir la tarea...");
    }
    // En el futuro dar la posibilidad de reabrir tickets como en Jira
    this.estaFinalizada = true;
  }


}
