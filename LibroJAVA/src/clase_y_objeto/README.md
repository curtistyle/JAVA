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

## Enumeraciones

*Archivo: Libro*

> Un tipo `enum` se declara como una **declaración `enum`**, la cual es una lista separada por comas de constantes `enum`; la declaración puede incluir, de manera opcional, otros componentes de la clases tradicionales, como constructores, campos y métodos. Cada declaración `enum`  declara a una clase `enum` con las siguientes restricciones: 
> - Los tipos `enum` son implicitamente `final`, ya que declaran constantes que no deben modificarse.
> - Las constantes `enum` son implícitamente `static`.
> - Cualquier intento por crear un objeto de un tipo `enum` con el operador `new` produce un error de compilación.

> Las constantes `enum` pueden usarse en cualquier parte en donde pueden usarse las constantes, como en las etiquetas `case` de las instrucciones `switch`, y para controlar las instrucciones `for` mejoradas.

> Al igual que los constructores que hemos visto en las clases, un constructor de `enum` puede especificar cualquier números de parametros y puede sobrecargarse.

*Archivo: PruebaLibro*

Cada constante `enum` en `Libro` en realidad es un objeto de tipo `Libro` que tiene su propia copia de las variables de instancia `titulo` y `anioCopyright`.

Para cada `enum`, el compilador genera el método `static values` que devuelve un arreglo de las constantes de `enum`, en el orden en que se declararon.

Observe que cuando se convierte una constante `enum` en un objeto `String` *(por ejemplo `libro` Linea 14)*, el identificador de la constante se utiliza como la representacion `String` *(por ejemplo, `JHTP6` para la primera constante `enum`)*.

En la Linea 19 se utiliza el método `static range` de la clase `EnumSet` *(del paquete java.util)* para mostrar un rango de las constantes de la `enum Libro`. El método `range` recibe dos parametros (la primera y la ultima constantes `enum` en el rango) y devuelve un objeto `EnumSet` que contiene todas las contantes entre estas dos contantes.

## Miembros de clase `static`

>Cada objeto tiene su propia copia de todas las variables de instancia de la clase. En ciertos casos, sólo debe compartirse una copia de cierta variable entre todos los objetos de una clase. En estos casos se utiliza un **campo `static`** (al cual se le conoce como una **variable de clase**). Una variable `static` representa **información en toda la clase** (todos los objetos de la clase comparten la misma pieza de datos). La declaración de una variable `static` comienza con la palabra clave `static`.

> Las variables `static` tienen alcance a nivel de clase. Los miembros `public static` de una clase pueden utilizarse a través de una referencia a cualquier objeto de esa clase, o calificando el nombre del miembro con el nombre de la clase y un punto (.), como en `Math.random()`. Los miembros `private static` de una clase pueden utilizarse solamente a traves de los metodos de la clase.

*Archivo: Empleado2*

Cuando existen objetos `Empleado`, el miembro `cuenta` se pude utilizar en cualquier método de un objeto `Empleado`; este ejemplo incrementa `cuenta` en el constructor (linea 17) y la decrementa en el metodo `finalize` (linea 25). Cuando no existen objetos de la clase `Empleado`, se puede hacer referencia de todas formas al miembro `cuenta`, pero solo a traves de una llamada al metodo `public static obtenerCuenta`, como en `Empelado.obtenerCuenta()`, lo cual devuelve el numero de bojetos `Empleado` que se encuentran actualmente en memoria.

Observe que la clase `Empleado` tiene un metodo `finalize`. Este método se incluye solo para mostrar cuando se ejecuta el recolector de basura en este programa. Por lo general, el metodo `finalize` se declara como `protected`, por lo que no forma parte de los servicios public de una clase.

Cuando se invoca el constructor de cada objeto `Empleado`, en las lineas 14 y 15 se asigna el primer nombre y apellido paterno del `Empleado` a las variables de instancia `primerNombre` y `apellidoPaterno`. Obeserve que estas dos instrucciones no sacan copias de los argumentos `String` originales. En realidad, los objetos `String` Java son inmutables (no pueden modificarse una vez que son creado). Por lo tanto, es seguro tener muchas referencias a un solo objeto `String`. Este no es normalmente el caso para los objetos de la mayoria de las otras clases en Java. Si los objetos `String` son inmutables tal vez se pregunte por que podemos utilizar los operadores + y += para concatenar objetos `String`. En realidad las operaciones de concatenacion de objetos `String` producen un nuevo objeto `String`, el cual contiene los valores concatenados. Los objetos `String` originales no se modifican.

*Archivo: PruebaEmpelado2*

Cuando `main` ha terminado de usar los dos objetos `Empleado`, las referencias `e1` y `e2` se establecen en `null`. En este punto las referencias `e1` y `e2` ya no hacen referencia a los objetos que se instanciaron en las lineas 11 y 12. Esto "marca a los objetos para la recolección de basura", ya que no existen mas referencias a esos objetos en el programa.

De un momento a otro, el recolector de basura puede podria reclamar la memoria para estos objetos (o el sistema operativo reclama la memoria cuando el programa termina). La JVM no garantiza cuando se va a ejecutar el recolector de basura (o si acaso se va a ejecutar), por lo que este programa hace una llamada explícita al recolector de basura en la linea 29 utilizando el metodo `static` llamado `gc`, de la clase `System` para indicar que el recolector de basura sebe realizar su mejor esfuerzo por tratar de reclamar objetos que sean elegibles para la recoleccion de basura. Esto solo es el mejor esfuerzo; es posible que no se recolecten objetos, o que se recolecte solo un conjunto de los objetos que sean candidatos.

>Un método declarado como `static` no puede tener acceso a los miembros no `static` de una clase, ya que un metodo `static` puede llamarse aun cuando no se hayan creado instancias de objetos de la clase. Por la misma razon, esta referencia `this` no puede usarse en un metodo `static`; debe referirse a un objeto especifico de la clase, y a la hora de llamar a un metodo `static`, podria no haber objetos de su clase en la memoria. La referencia `this` se requiere para permitir a un método de una clase acceder a otros miembros no `static` de la misma clase.

## Declaracion `static` import 

>Una declaracion **`static` import** nos permite hacer referencia a los miembros `static` importados, como si se hubieran declarando en la clase que los utiliza; el nombre de la clase y el punto (.) no se requieren para usar un miembro `static` importado. 

>Una **declaracion `static` import individual** y una que importa a todos los miembros `static` de una clase (**declaracion `static` import sobre demanda**). la siguiente sintazis importa un miembro `static` especifico:
>>`import static` *nombrePaquete.NombreClase.nombreMiembroEstatico;*

>en donde *nombrePaquete* es el paquete de la clase (por ejemplo, java.lang) y *nombreClase* es el nombre de la clase (por ejemplo, `Math`). El asterisco (*) indica que todos los miembros `static` de la clase especificada deben estar disponible para usarlos en la(s) clase(s) en el archivo. Observe que las declaraciones `static` 
