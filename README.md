# Ejercicio 1 sesion 33 modulo 4

Diagrama de clases propuesto: (No incluye métodos)

![Diagrama de clases](diagrama-de-clases.png)

> Limitado solo a la estructura general del proyecto

## Cosas hechas distintas por el profesor:

- Creacion de una interfaz generica llamada CRUD
- Se crear servicios de interfaz que extienden de CRUD
- En proyectos se hicieron 2 metodos de interfaz adicionales para satisfacer los requerimientos
- Se crean atributos en los modelos para unir las entidades
- El profesor usa `List` en lugar de `Map` pero ambas son validas

- Se prefirio un sistema de menu en forma de arbol donde se prueba de manera extensa el CRUD de cada entidad por separado. Es triggereado por una clase llamada `AppController` con un metodo llamado `iniciar`

### CAPTURAS DE DIFERENCIAS

Interfaz generica

![Captura1](captura1.png)

Interfaz generica siendo cargada en cada interfaz especifica, la `T` sera reemplazada por el tipo de objeto correcto en cada caso, en este caso `Empleado`

![Captura1](captura2.png)

Metodos extras solo para el caso particular de `Proyecto`, toma todos los metodos genericos, los carga para si mismo usando `extends` y añade los propios

![Captura1](captura3.png)

Creacion de una lista de `Empleado` y una lista de `Tarea` para los proyectos

![Captura1](captura4.png)


Se prefiere el uso de `Streams` y **Funciones Lambda** en vez de ciclos

![Captura1](captura5.png)

Se usa un metodo para listar las tareas por empleado

![Captura1](captura6.png)

Ejemplo de implementacion para escribir el archivo `CSV` requerido. Es un archivo regular de texto separado por comas al que se le ha dado una extensión

![Captura1](captura7.png)

> Librerías específicas para CSV no son requeridas