# TP5 - Naipes - Colecciones

## Estos fueron los objetivos que se cumplieron y los conocimientos que se aplicaron para realizar este ejercicio:

### 1. Comprender las colecciones
>  Estudiamos los diferentes tipos de estructuras de datos que almacenan y organizan elementos, como listas, conjuntos y diccionarios.

### 2. Utilizar la clase `array` para manipulacion comunes de arreglo.
> Manipular listas o matrices de tipo `array` de manera eficiente.

### 3. Utilizar las implementaciones del marco de trabajo de colecciones para manipular varias colecciones (estructura de datos preempaquetada)
> Aprovechamos las estructuras de datos predefinidas para manipular colecciones, como listas, conjuntos y diccionarios.

### 4. Utilizar los algoritmos del marco de trabajo de colecciones para manipular varias colecciones (como `search`, `sort` y `fill`).
> Usamos de algoritmos predefinidos para realizar operaciones comunes en colecciones, como búsqueda, ordenamiento y llenado.

### 5. Utilizar las interfaces del marco de trabajo de colecciones para programar mediante el polimorfismo.
> Programamos utilizando el concepto de polimorfismo, lo que significa que utilizamos diferentes implementaciones de una interfaz para manipular colecciones de manera uniforme.

### 6. Utilizar iteradores para "recorrer" los elementos de una colección.
> Utilizamos iteradores para acceder a cada elemento de una colección de manera secuencial y realizar operaciones en ellos.


[^1]: Sebastian_Maldonado

## Consignas:

1. La baraja española consiste en un mazo o conjunto de cuarenta y ocho naipes.
Los naipes están divididos en cuatro "familias". Las familias son "oros", "copas", "espadas" y
"bastos", a cada uno de los cuales le corresponde su iconografía característica. 
Cada familia tiene doce cartas: nueve cartas numeradas del uno al nueve, llamadas cartas numéricas
o y tres figuras numeradas correlativamente del diez al doce, Las figuras son la "sota" (con el
número 10), el "caballero", llamado coloquialmente "caballo" a pesar de que es un caballero
montado (con el número 11) y el "rey" (con el número 12). \
Crear la clase Naipe que representa a un naipe de la baraja española. Cada naipe tiene un número y
la familia a la que pertenece. La familia se debe implementar con una enumeración (enum).
Crear la clase Mazo que inicialmente contenga a todos los Naipes en un mazo. Esta clase tendrá: 
 - Un método barajar() que permite mezclar el mazo de cartas. 
 - Un método getNaipe() nos proporciona la carta que está situada en la parte superior del
Mazo retirándola del mismo.
Utilizando este Mazo de Naipes implementar un juego donde puedan participar 2 o mas jugadores.
Se debe definir al comienzo del juego cuantas manos (rebarajes) se jugarán o con cuantos puntos se
gana el juego. \
Cada jugador elije un numero y familia de Naipe. 
Luego se comienza a sacar Naipes del Mazo. Suma un punto el jugador que primero acierte el
numero y familia del Naipe sacado del mazo. \
Luego cada jugador vuelve a elegir un numero y familia de Naipe y se continúa sacando Naipes del
Mazo hasta que un jugador acierte. \
Se continúa hasta que queden 20 Naipes en el Mazo. \
Luego se forma el Mazo nuevamente con todos los Naipes, se mezcla y comienza nuevamente otra
mano. \
Gana el jugador con mas puntos o llega primero a el puntaje definido.

2. Para el juego de la Batalla de Botes (similar a Batalla Naval, pero con barcos que ocupan un solo
casillero), se requiere una cuadrícula con filas numeradas de 1 a 8 y letras de A hasta la H.
Implementar las clases Bote y Tablero con los siguientes métodos, que provea las siguientes
funcionalidades:
> a. Agregar un bote en un casillero \
> b. Saber si un casillero está ocupado o no \
> c. Sacar un bote de un casillero (hundido) \
> d. Reiniciar el tablero con todos los casilleros vacios \
> e. Ubicar 8 botes en lugares aleatorios del tablero \

Los métodos que requieran que se les pase como parámetros lugares del tablero, para hacerlo más
intuitivo para el usuario de la clase deberían recibir un carácter y un entero (columna – fila).

Crear una segunda versión, basada en lo ya construido, donde los botes pueden ocupar hasta 3
casilleros.