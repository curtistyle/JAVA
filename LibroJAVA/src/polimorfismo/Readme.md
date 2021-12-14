# Programación Orientada a Objetos: Polimorismo

## Introduccion

> El Polimordismo nos permite "*Programar en forma general*", en vez de "*Programar en forma especifica*". Nos permite escribir programas que procesen objetos que compartan la misma superclase en una jerarquia de clases, como si todos fueran objetos de la superclase; esto puede simplificar la programación.

> Con el **polimorfismo** podemos diseñar e implementar sistemas que puedan extenderse con fasilidad; pueden agragarse nuevas clases con sólo modificar un poco, (o nada) las porciones generales de la aplicación, siempre y cuando las nuevas clases sean parte de la jerarquia de herencia que la aplicación procesa en forma generica. Las unicas partes de un programa que deben alterarse para dar cabida a las nuevas clases son las que requieren un conocimiento directo de las nuevas clases que el programador agregará a lajerarquia. 

> Una **interface** describe a un conjunto de metodos que pueden llamarse en un objeto, pero no proporciona implementaciones concretas para ellos. Los programadores pueden declarar clases que **implementan** a (es decir, que proporcionen implementacion concreta para los metodos de) una o mas interfaces. Cada metodo de una interfaz debe declararse en todas las clases que implementen a la interface. Una vez que una clase implementan a una interfaz, todos los objetos de esa clase tienen una relacion "*es un*" con el tipo de la interfaz. Esto se aplica tambien para todas las subclases de esa clase. 

> En especial, las **interfaces** son utiles para asignar la funcionabilidad común a clases que posiblemente no estén relacionadas. Esto permite que los objetos de clases no relacionadas se procesen en forma polimorfica; los objetos de las clases que implementan la misma interfaz pueden responder a las mismas llamadas a los métodos. 

## Ejemplos de Polimorfismo

> El polimorfismo ocurre cuando un programa invoca a un metodo a traves de una variable de la superclase; en tiempo de ejecución, se hace una llamada a la versión correcta del metodo de la subclase, con base en el tipo de la referencia almacenada en la variable de la superclase.

