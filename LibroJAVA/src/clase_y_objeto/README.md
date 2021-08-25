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



