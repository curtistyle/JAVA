# TP7 - Excepciones - Parte 2

### 1. Manejo de excepciones y de errores: 
Gestionamos situaciones inesperadas o errores durante la ejecución de un programa

### 2. Utilizar `try`, `throw` y `cath` para detectar, indicar y manejar excepciones, respectivamente.
Utilizamos `try` oara envolver ell código que puede generar una excepción. `throw` para lanzar manualmente una excepcion. `catch` para capturar y manejar excepciones.

### 3. Bloque `finally` para liberar recursos.
Este es un bloque opcional que se ejecuta siempre, independientemente de si ocurre o no una excepcion. La utilizamos para liberar recursos o realizar acciones de limpezas necesarias.

### 4. Limpieza de la pila y manejo de excepciones no capturadas.
i una excepción no se captura en un alcance específico, se propaga hacia arriba en la pila de llamadas hasta que se encuentra un bloque `catch` que pueda manejarla.

### 5. Comprender cómo se ordenan las excepciones en una jerarquia de clases de excepciones.
Las excepciones en Java están organizadas en una jerarquía de clases. Las excepciones más específicas heredan de las más generales. Esto permite capturar excepciones de manera más precisa.

### 6. Declarar nuevas clases de excepciones.
En Java, es posible crear clases de excepciones personalizadas que extiendan la clase `Exception` o sus subclases. Esto te permite definir tus propias excepciones para situaciones específicas.


## Consignas:

1. Modificar el ejercicio 5, TP2, para que los métodos devuelvan excepciones: \
**Clase Empleado** 
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