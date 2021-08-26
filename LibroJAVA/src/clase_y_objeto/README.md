# Clases y objetos: un analisis mas detallado.

## Ejemplo práctico de la clase Tiempo

*Archivo: Tiempo1, PruebaTiempo1*

La clase Tiempo1 contiene los métodos `public establecerTiempo()`, `aStringUniversal` y `toString`. A estos métodos también se les llama **servicios `public`** o la **interfaz `public`** que proporciona la clase a sus clientes. En este ejemplo, la clase Tiempo1 no declara un constructor, por lo que tiene un constructor predeterminado que le suministra el compilador.


En el método `establecerTiempo()` es un método public que declara tres parametros `int` y los utiliza para establecer la hora. Una expresión condicional evalúa cada argumento, para determinar si el valor se encuentra en un valor especificado.


El método `aStringUniversal()` no recibe argumentos y devuelve un objeto `String` en formato de hora universal. La instrucción `return` utiliza el metodo `static` `String` `format` de la clase `String` para devolver un objeto `String` que contiene los valores con formato hora, minuto y segundo, cada uno con dos digitos y posiblemente, un 0 a la ezquierda.

>El método `format` es similar al método `System.out.printf`, solo que el `format` devuelve un objeto `String` con formato, en vez de mostrarlo en una ventana de comando. *El método `aStringUniversal` devuelve el objeto `String` con formato*.

## Control del acceso a los miembros

> Los modificadores de acceso `public` y `private` controlan el acceso a las variables y los métodos de una clase. El principal proposito de los métodos `public` es representar a los clientes de la clase una vista de los servicios que proporciona (la interfaz publica de la clase). Los clientes de la clase no necesitan preocuparse por la forma en que la clase realiza  sus tareas. Por esta razon, las variables y métodos `private` de una clase no son directamente accesibles para los clientes de la clase.

## Referencia a los miembros del objeto actual mediante this.

*Archivo: PruebaThis*

>Cada bojeto puede acceder a una referencia a sí mismo mediante la palabra clace `this` (tambien conocida como referencia **referencia `this`**). Cuando se hace una llamada a un método no `static` para un objeto especifico, el cuerpo del método utiliza en forma implícita la palabra clave `this` para hacer referencia a las variables de instancia y los demas métodos del objeto. 

Observe  que en el constructor "`public TiempoSimple( int hora, int minuto, int segundo)`" recibe tres argumentos `int` para inicializar un objeto `TiempoSimple`. Observe que para el constructor usamos nombres de parametros identicos a los nombres de *las variables de instancia de la clase*. No recomendamos esta practica pero lo hicimos aqui para ocultar las variables de instancia correspondientes y asi poder ilustrar el uso explicito de la referencia `this`.

> Si un metodo contiene una variable local con el mismo nombre que el de un campo, hará referencia a la variable local en vez del campo.

En este caso, la variable local oculta el campo en el alcance del metodo. No obstante, el método puede utilizar la referencia `this` para hacer referencia al campo oculto de manera explicita, como se muestra en el constructor.

## Tjemplo práctico de la clase Tiempo2: constructores sobrecargados

*Archivo: Tiempo2*

La clase `Tiempo2` contiene cinco constructores sobrecargados que proporcionan formas convenientes para inicializar los objetos de la nueva clase `Tiempo2`. Cada constructor inicializa el objeto para que empiece en un estado consistente.

Para invocar el constructor apropiado, el compilador relaciona el numero, los tipos y el orden de los argumentos especificados en la llamada al constructor con el número, los tipos y el orden de los tipos de los parametros especificados en la declaracion de cada constructor.

En el primer constructor utiliza la referencia `this` en la sintaxis de la llamada al metodo para invocar al constructor de `Tiempo2` que recibe tres argumentos *(constructor de la linea 28)*. El constructor sin argumentos pasa los valores de 0 para `hora`, `minuto` y `segundo` al constructor con tres parametros *(constructor de la linea 28)*. El uso de la referencia `this` que se muestra aqui en una forma popular de reutilizar el codigo de inicializacion que proporciona otro de los constructores de la clase, en vez de definir código similar en el cuerpo del constructor sin argumentos. Utilizamos esta sintaxis en cuatro de los cinco constructores de Tiempo2 para que la clase sea mas facil de mantener y modificar. 

## Observaciones acerca de los métodos Establecer y Obtener

Los métodos *establecer* tambien se conocen comúnmente como **metodos mutadores**, porque generalmente cambia un valor. Los métodos *obtener* tambien se conocen comúnmente como **metodos de acceso** o **metodos de consulta**.

### Comparacion entre los metodos *establecer* y *obtener*

Parece ser que proporcionar herramientas para *establecer* y *obtener* es esencialmente lo mismo que hacer las variables de instancia `public`. Si una variable de instancia se declara como `public`, cualquier metodo que tenga una referencia a un objeto que contenga esta variable de instancia podrá leer o escribir en ella. Si una variable de instancia se declara como `private`, un metodo *obtener* `public` evidentemente permite a otros metodos el acceso a la varaible, pero el metodo *obtener* puede controlar la manera en que el cliente puede tener acceso a la variable. Por ejemplo, un metodo *obtener* podria controlar el formato de los datos que devuelve y, por ende, proteger el codigo cliente de la representacion actual de los datos. Un metodo *establcer* `public` puede (y debe) escudriñar cuidadosamente los intentos por modificar el valor de la variable, para asegurar que el nuevo valor sea apropiado para ese elemento de datos. Por ejemplo, un intento por *establecer* el dia del mes en una fecha 37 seria rechazado, un intento por *establecer* el peso de una personaen un valor negativo sería rechazado, y asi sucesivamente. Entonces aunque los metodos *establecer* y *obtener* proporcionan acceso a los datos privados, el programador restringe su acceso mediante la implementacion de los metodos.


## Composicion

*Archivo: Fecha, Empleado, PruebaEmpleado*

> Una clase puede tener referencias a objetos de otra clase como miembros. A dicha capacidad se le conoce como **composicion** y algunas veces como **relacion "tiene un"**. *La composicion es una forma de reutilizacion de software, en donde una clase tiene como miembros referencias a onjetos de otras clases*

Observe que en la clase `Fecha` en la linea 17 en el constructor muestra en pantalla la referencia `this` como un objeto `String`. Como `this` es una referencia al objeto `Fecha` actual, se hace una llamada implicita al método `toString` para obtener la representacion `String` del objeto.

La clase `Empleado` tiene la variables de instancia `primerNombre`, `apellidoPaterno`, `fechaNacimiento`, `fechaContratación`. Lo miembros `fechaNacimiento` y `fechaContratacion` son referencias a objetos `Fecha`. Esto demuestra que una clase puede tener como variables de instancia referencias a objetos de otras clases.

Los objetos referenciados por los parametros `fechaDeNacimiento` y `fechaDeContratacion` se asignan a las variables de instancia `fechaNacimiento` y `fechaContratacion` del objeto `Empleado`, respectivamente. Observe que cuando se hace una llamada al metodo `toString` de la clase `Empleado`, este devuelve un objeto `String` que contiene las representaciones `String` de los dos objetos `Fecha`. Cada uno de estos objetos `String` se obtiene mediante una llamada implícita al método `toString` de la clase `Fecha`.

La clase `PruebaEmpleado` crea dos objetos `Fecha` para representar la fecha de nacimiento y de contratacion de un `Empleado`,  respectivamente. La linea 12 invoca en forma implicita el metodo `toString` de `Empleado` para mostrar en pantalla los valores de sus variables de instancia y demostrar que el objeto de inicialización en forma apropiada.