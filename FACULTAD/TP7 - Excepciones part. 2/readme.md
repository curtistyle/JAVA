# TP7 - Exvepciones - Parte 2



## Consignas:

1. Modificar el ejercicio 5, TP2, para que los métodos devuelvan excepciones: \
**Clase Empleado** \
- `public Empleado(String nombre, Integer sueldo)`
  - Debe devolver una StringException si el nombre es null o tiene menos de 3 caracteres.
  - Mensaje: El nombre del empleado debe tener 3 o mas caracteres.\
  ㅤ
  - Debe devolver una EnteroPositivoException si el sueldo es null o menor o igual a 0.
  - Mensaje: El sueldo del empleado debe ser mayor a 0. \
 ㅤ
- `public void setNombre(String nombre)`
  - Debe devolver una StringException si el nombre es null o tiene menos de 3 caracteres.
  - Mensaje: El nombre del empleado debe tener 3 o mas caracteres. \
  ㅤ
- `public void setSueldo(Integer sueldo)`
  - Debe devolver una EnteroPositivoException si el sueldo es null, o menor o igual a 0.
  - Mensaje: El sueldo del empleado debe ser mayor a 0. \
 ㅤ
- `public void setLegajo(Integer legajo)`
  - Debe devolver una EnteroPositivoException si el legajo es null, o menor o igual a 0.
  - Mensaje: El legajo del empleado debe ser mayor a 0.
 --------------------------

**Clase EmpleadoService**
- `public static Boolean agregar(Empleado empleado)`
  - Debe retornar la  EnteroPositivoException que puede retornar el método setLegajo(Integer legajo) de la clase Empleado que se llama en esté método. \
ㅤ
- `public static Empleado mayorSueldo()`
  - Debe devolver una CollectionVaciaException si no hay empleados en el List.
  - Mensaje: No hay empleados.\
ㅤ
- `public static Double sueldoPromedio()`
  - Debe devolver una CollectionVaciaException si no hay empleados en el List.
  - Mensaje: No hay empleados.\
ㅤ
- `public static void eliminar(String nombre)`
  - Debe devolver una CollectionVaciaException si no hay empleados en el List.
  - Mensaje: No hay empleados. \
ㅤ
  - Debe devolver una NoEncontradoException si no encuentra el empleado.
  - Mensaje: No se encontro el empleado. \
ㅤ

Se adjuntan las clases Empleado, EmpleadoService y Ejercicio5