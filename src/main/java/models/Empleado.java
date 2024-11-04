package models;

public class Empleado {

  // El empleado es la especialidad primigenia de la que no depende nada
  // Añadir mas atributos en el futuro

  private String rut;
  private String nombre;


  public Empleado(String rut, String nombre) {
    super();
    this.rut = rut;
    this.nombre = nombre;
  }


  public String getRut() {
    return rut;
  }


  public void setRut(String rut) {
    this.rut = rut;
  }


  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  @Override
  public String toString() {
    return "{" +
      " rut='" + getRut() + "'" +
      ", nombre='" + getNombre() + "'" +
      " }";
  }


}
