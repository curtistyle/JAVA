# Herencia

## Introducción

> La **herencia** es una forma de reutilización de software en la que se crea una nueva clase absorbiendo los miembros de una clase existente, y se mejoran con nuevas capacidades, o con modificaciones en las capacidades ya existentes.

> Al crear una clase, en vez de declarar miembros completamente nuevos, el programador puede designar que la nueva clase herede los miembros de una clase existente. Esta clase existente se conoce como **superclase**, y la nueva clase se conoce como **subclase**. Cada subclase puede convertirse en la superclase de futuras subclases.

> Una subclase generalmente agrega sus propios campos y metodos. Por lo tanto, una subclase es más especifica que su superclase y representa a un grupo más especializado de objetos. Generalmente la subclase exhibe los comportamientos de su superclase junto con comportamientos adicionales específicos de esta subclase. Es por ello que la herencia se le conoce algunas veces como **especialización**.

> La **superclase directa** es la superclase a partir de la cual la subclase hereda en forma explícita. Una **superclase indirecta** es cualquier clase arriba de la superclase directa en la **jerarquia de clases**, la cual define las relaciones de herencia entre las clases.

> En el caso de la **herencia simple**, una clase deriva de una superclase directa. Java, a diferencia de C++, no soporta la herencia multiple (que ocurre cuando una clase se deriva de más de una superclase directa)

## Superclases y subclases

> Es posible tratar a los objetos de subclases de manera similar; sus similitudes se expresan en los miembros de la superclase. Los objetos de todas las clases que extienden a una superclase común pueden tratarse como objetos de esa superclase (es decir, dichos objetos tienen una relación *"es un"* con la superclase). Sin embargo los objetos de una superclase no pueden tratarse como un objetos de sus subclases.  

> Un problema con la herencia es que una subclase puede puede heredar métodos que no necesita, o que no debe tener. A pesar de que un metodo de superclase sea apropiado para una subclase, a menudo esa subclase requiere una version personalizada del metodo. En dichos casos, la subclase puede **sobrescribir** (redefinir) el metodo de la superclase con una impleamentacion apropiada.

## Miembros `protected`

> Los miembros `public` de una clase son accesibles en cualquier parte en donde el programa tenga una referencia a un objeto de esa clase, o una de sus subclases. Los miembros `private` de una clase son accesibles solo dentro de la misma clase. Los miembros `private` de una superclase no son heredados por sus subclases. El uso del acceso `protected` ofrece un nivel intermedio de acceso entre `public` y `private`. Los miembros `protected` de una superclase pueden ser utilizados por los miembros de esa superclase, por los miembros de sus subclases y por los miembros de otras clases en el mismo paquete (los miembros `protected` tambien tienen acceso a nivel de paquete).

> Todos los miembros `public` y `protected` de una superclase retienen su modificador de acceso original cuando se convierten en miembros de la subclase (por ejemplo, los miembros `public` de la superclase se convierten en miembros `public` de la subclase, y los miembros  `protected` de la superclase se convierten en miembros `protected` de la subclase).

> Los metodos de la subclase pueden referirse a los miembros `public` y `protected` que se hereden de la superclase con sólo utilizar los nombres de los miembros. Cuando un metodo de la subclase sobrescribe al metodo de la superclase, este ultimo puede utilizarse desde la subclase si se antepone a su nombre en la palabra clave `super` y un punto **(.)**.

## Relacion entre las superclases y las subclases

> En esta situación usaremos una jerarquia de herencia que contienen tipos de empelados en las aplicación de nómina de una compañia, para hablar sobre la relación entre una superclase y su subclase. En esta compañia, a los empleados por comision (que se representaran como onjetos de una superclase) se les paga un porcentaje de sus ventas, mientras que los empleados por comision con salario base (que se representaran como objetos de una subclase) reciben un salario base, mas un porcentaje de sus ventas.

>## Creación y uso de una clase `EmpleadoPorComision`

*Archivo: EmpleadoPorComision*

Los programadores de Java utilizan la herencia para crear clases a partir de clases existente. De hecho, todas las clases Java (excepto `Object`) extienden a una clase existente. Como la clase `EmpleadoPorComision` extiende la clase `Object`, la clase `EmpleadoPorComision` hereda los metodos de la clase `Object`; la clase `Object` no tiene campos. De hecho, cada clase en Java hereda en forma directa o indirecta los metodos de `Object`. Si una clase no especifica que extiende a otra clase, la nueva clase hereda de `Object` en forma implicita. Por esta razon, es comun que los programadores no incluyan "`extends Object`" en su codigo.

Los constructores no se heredan, por lo que la clase `EmpleadoPorComision` no hereda el constructor de la clase `Object`. Sin embargo, el constructor de la clase `EmpleadoPorComision` llama al constructor de la clase `Object` de manera implicita. De echo, la primera tarea de constructor de cualquier subclase es llamar al constructor de su superclase directa, ya sea de forma explicita o implicita (si no se especifica una llamada al constructor), para asegurar que las variables de instancia heredadas de la superclase se inicializen en forma apropiada. Si el codigo no incluye una llamada explicita al constructor de la superclase, Java genera una llamada implicita al constructor predeterminado o sin argumentos de la superclase. El comentario en la linea 14 indica donde se hace la llamada implicita al constructor predeterminado de la superclase `Object` (el programador no necita escribir el codigo para esta llamada). El contructor predeterminado (vacio) de la clase `Object` no hace nada. Observe que aun si una clase no tiene constructores, el constructor predeterminado que declara el compilador de manera implicita para la clase llamará al constructor predeterminado o sin argumento de la superclase.

El metodo `toString` es especial: es uno de los metodos que hereda cualquier clase de manera directa o indirecta de la clase `Object`, la cual es la raiz de la jerarquia de clase Java. El metodo `toString` devuelve un `String` que representa a un objeto. Un programa llama a este metodo de manera implicita cada vez que un objeto debe convertirse en una representacion cadena, como cuando se imprime un objeto mediante `printf` o el metodo `format` de `String`, usando el especificador de formato %s. El metodo `toString` de la clase `Object` devuelve un `String` que incluye el nombre de la clase objeto. En esencia, es un receptáculo que puede sobrescribirse por una subclase para especificar una representación de cadena apropiada de los datos en un objeto de la subclase. Para sobrescribir a un metodo de una superclase, una subclase debe declarar un metodo con la misma firma (nombre del metodo, numero de parametros, tipos de los parametros y orden de los tipos de los parametro) que el metodo de la superclase.

*Archivo: PruebaEmleadoPorComision*

En la Linea 22 imprime en pantalla la representacion en cadena del `EmpeladoPorComision` actualizado. Observe que cuando se imprime un objeto en pantalla usando el especificador de formato %s, se invoca de manera implicita el metodo `toString` del objeto para tener su representacion de cadena. 



