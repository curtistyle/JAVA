# TP6 - Auto, Figuras - Herencia y Polimorfismo

## Estos fueron los objetivos que se cumplieron y los conocimientos que se aplicaron para realizar este ejercicio:

## Herencia: 

### 1. Utilizamos la herencia para fomentar la reutilizacion de codigo.
> La herencia permite a una clase (subclase) heredar atributos y métodos de otra clase (superclase), promoviendo la reutilización de código.

### 2. Superclases y las Subclases. 
> Creamos las superclases que son las clases de las que se hereda, mientras que las subclases son las clases que heredan de una superclase.

### 3. Utilizar la palabra clave `extends` para crear una clase que herede los atributos y comportamiento de otra clase.
> La utilizamos para crear una clase que hereda los atributos y comportamientos de otra clase. La subclase extiende la superclase.

### 4. Comprender el uso del modificador de acceso `protected` para dar a los métodos de la subclase acceso a los miembros de la superclase.
> El modificador `protected` nos permiio que los métodos de la subclase tengan acceso a los miembros (atributos y métodos) de la superclase, pero no son accesibles desde fuera de la jerarquía de herencia.

### 5. Utilizar los miembros de superclase mediante `super`.
> Esta función nos permitio para llamar a un método de la superclase desde la subclase. Permite acceder y usar métodos de la superclase en la subclase.

### 6. Comprender como se utilizan los constructores en las jerarquias de herencia.
> En una jerarquía de herencia, los constructores de las subclases pueden llamar al constructor de la superclase.
> *-"El constructor de cada subclase debe llamar en forma implícita al constructor de su superclase, para asegurar que las variables de instancia heredadas de la superclase si inicialicen en forma apropiada."*

## Polimorfismo

### 1. Comprender el concepto de polimorfismo.
> Es la capacidad de una misma operación (método) tener diferentes implementaciones en distintas clases o interfaces. Esto nos permite que un mismo método pueda comportarse de manera diferente en diferentes contextos.

### 2. Métodos sobrescritos para polimorfismo.
> Podemos sobrescribir métodos de una superclase en sus subclases. Esto significa que una subclase puede proporcionar una implementación específica de un método heredado.

### 3. Distinguir entre clases abstractas y concretas.
> Una clase abstracta es una clase que no puede ser instanciada directamente, sino que sirve como un modelo para otras clases. Una clase concreta puede ser instanciada normalmente.

### 4. Declaramos de métodos `abstract`.
> Declaramos métodos como abstract en una clase abstracta. Esto significa que la subclase debe proporcionar una implementación concreta para ese método.

### 5. Extensibilidad y mantenimiento con polimorfism.
> El polimorfismo en Java nos facilita la extensión de sistemas, ya que podemos agregar nuevas subclases que implementen el mismo método de manera específica. Esto permite agregar nuevas funcionalidades sin modificar el código existente.

### 6. Aprender a declarar e implementar interfaces.
> Una interfaz en Java es una colección de métodos abstractos que una clase puede implementar. Esto proporciona una forma de definir un conjunto de métodos que una clase debe tener, sin especificar cómo deben ser implementados.

## Consignas:

1. Describa las formas en las que la herencia fomenta la re-utilización de software, ahorra tiempo
durante el desarrollo de los programas y ayuda a prevenir errores.

2. Conteste con verdadero o falso a cada una de las siguientes proposiciones; en caso de ser falso,
explique por qué.
> a) Los constructores de la superclase no son heredados por las subclases. \
> b) Una relación “tiene un” se implementa mediante la herencia. \
> c) Una clase Auto tiene una relación “es un” con las clases Volante, Dirección y Frenos. \
> d) La herencia fomenta la re-utilización de software comprobado, de alta calidad. \
> e) Cuando una subclase re-define al método de una superclase utilizando la misma firma, se dice que la subclase sobrecarga a ese método de la superclase.

3. Explique la herencia con un ejemplo. ¿Aplicaría herencia porque detecta que en un conjunto de
clases hay atributos compartidos, o porque estas clases comparten comportamiento/? Justifique.

4. ¿Cuál es la principal desventaja de la herencia? Explique.

5. ¿Cómo modifica la visibilidad de atributos y métodos el modificador de visibilidad protected? ¿Qué opina de su uso en atributos?

6. A través de la herencia se puede sobre-escribir un método de la superclase en la subclase ¿Qué
beneficios supone esto para la creación de sus aplicaciones?