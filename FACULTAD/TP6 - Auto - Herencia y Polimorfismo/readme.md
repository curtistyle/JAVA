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

8. Defina una clase Forma que tenga los siguientes miembros de datos: \
• Color \
• Coordenada del centro de la forma (objeto Punto con coordenadas x,y) \
• Nombre de la forma 

Y, al menos, las siguientes funciones miembro: \
• Imprimir \
• Obtener y cambiar el color \
• Mover la forma (o sea, su centro)

Defina una clase derivada Rectángulo que tenga los siguientes miembros como datos: \
• Lado menor. \
• Lado mayor.

Y, al menos, las siguientes funciones miembro: \
• Imprimir. Debe imprimir que se trata de un rectángulo mostrando su nombre, color, centro y
lado. Debería usarse la función Imprimir de la clase base para realizar parte de este trabajo. \
• Calcular el área (lado menor * lado mayor). \
• Calcular el perímetro. (2 * lado menor + 2 * lado mayor). \
• Cambiar el tamaño del rectángulo. Recibe como parámetro un factor de escala. Así, por
ejemplo, si el factor vale 2, el rectángulo duplicará su tamaño y si es 0,5 se reducirá a la
mitad.

**a)** Realice un programa que pruebe el funcionamiento de estas clases. Debe crear objetos y
comprobar el correcto funcionamiento de las funciones miembro.

**b)** Defina una clase Elipse derivada de forma. Recordatorio: una elipse queda definida por su
radio mayor (R) y su radio menor (r), tal que el área de una elipse es igual a π*(R*r).

**c)** Defina una clase Cuadrado derivada de la clase Rectángulo.

**d)** Defina una clase Circulo derivada de la clase Elipse

**e)** Realice un programa que defina varias formas diferentes, cree un List de punteros de la clase
Forma que apunten a los objetos creados. El programa debe realizar un bucle que recorra
todas las formas, las ponga todas del mismo color y las mueva a una determinada posición.

**f)** Analice qué ocurre en el ejercicio anterior si se intenta imprimir la información de cada
forma y qué sucede si se intenta obtener en ese bucle el área de todas las formas del vector.

**g)** Utilice la técnica de las funciones virtuales para arreglar los comportamientos anómalos
detectados en el ejercicio anterior.

**h)** ¿Cómo haría para obligar que todas las clases futuras derivadas tengan al menos los métodos
“área” y “perímetro”. ¿Tiene sentido incluir definir dichos métodos en la clase Forma?

**i)** Haga un diagrama de clases que refleja la estructura definida hasta el momento. Añádale las
clases: Punto, Línea, Triángulo, Triángulo Rectángulo y Polígono. ¿Dónde irían? ¿Cuáles
serían sus atributos y propiedades?