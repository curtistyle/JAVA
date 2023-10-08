# Estructura de control

## Ejercicio 1 `RegistroAutomovil`.

Los conductores se preocupan acerca del kilometraje de sus automóviles. Un conductor ha llevado el registro de
varios reabastecimientos de gasolina, registrando los kilómetros conducidos y los litros usados en cada reabastecimiento.
Desarrolle una aplicación en Java que reciba como entrada los kilómetros conducidos y los litros usados (ambos como
enteros) por cada reabastecimiento. El programa debe calcular y mostrar los kilómetros por litro obtenidos en cada
reabastecimiento, y debe imprimir el total de kilómetros por litro obtenidos en todos los reabastecimientos hasta este
punto. Todos los cálculos del promedio deben producir resultados en números de punto ﬂotante. Use la clase Scanner
y la repetición controlada por centinela para obtener los datos del usuario.

## Ejercicio 2 `ClientesTienda`.

Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha
excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos: \
&nbsp;&nbsp;&nbsp;&nbsp;a) El número de cuenta. \
&nbsp;&nbsp;&nbsp;&nbsp;b) El saldo al inicio del mes. \
&nbsp;&nbsp;&nbsp;&nbsp;c) El total de todos los artículos cargados por el cliente en el mes. \
&nbsp;&nbsp;&nbsp;&nbsp;d) El total de todos los créditos aplicados a la cuenta del cliente en el mes.
&nbsp;&nbsp;&nbsp;&nbsp;e) El límite de crédito permitido. \
El programa debe recibir como entrada cada uno de estos datos en forma de números enteros, debe calcular el nuevo
saldo (= saldo inicial + cargos – créditos), mostrar el nuevo balance y determinar si éste excede el límite de crédito del
cliente. Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje "Se excedió el
límite de su crédito".

## Ejercicio 3 `EmpresaComisiones`

Una empresa grande paga a sus vendedores mediante comisiones. Los vendedores reciben $200 por semana,
más el 9% de sus ventas brutas durante esa semana. Por ejemplo, un vendedor que vende $5000 de mercancía en una
semana, recibe $200 más el 9% de 5000, o un total de $650. Usted acaba de recibir una lista de los artículos vendidos
por cada vendedor. Los valores de estos artículos son los siguientes:

| Articulo | Valor  |
|----------|--------|
| 1        | 239.99 |
| 2        | 129.75 |
| 3        | 99.95  |
| 4        | 350.89 |


Desarrolle una aplicación en Java que reciba como entrada los artículos vendidos por un vendedor durante la última
semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que un
vendedor puede vender.

## Ejercicio 4 `SueldoBrutoEmpleado`.

Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno de tres empleados. La empresa
paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y paga cuota y media en todas las horas
trabajadas que excedan de 40. Usted recibe una lista de los empleados de la empresa, el número de horas que trabajó
cada empleado la semana pasada y la tarifa por horas de cada empleado. Su programa debe recibir como entrada esta
información para cada empleado, debe determinar y mostrar el sueldo bruto de cada empleado. Utilice la clase Scanner
para introducir los datos.

## Ejercicio 5 `GanadorConcurso`.

El proceso de encontrar el valor más grande (es decir, el máximo de un grupo de valores) se utiliza frecuentemente
en aplicaciones de computadora. Por ejemplo, un programa para determinar el ganador de un concurso de
ventas recibe como entrada el número de unidades vendidas por cada vendedor. El vendedor que haya vendido más
unidades es el que gana el concurso. Escriba un programa en seudocódigo y después una aplicación en Java que reciba
como entrada una serie de 10 números enteros, y que determine e imprima el mayor de los números. Su programa debe
utilizar cuando menos las siguientes tres variables: \
&nbsp;&nbsp;&nbsp;&nbsp;a) contador: un contador para contar hasta 10 (es decir, para llevar el registro de cuántos números se han
introducido, y para determinar cuando se hayan procesado los 10 números). \
&nbsp;&nbsp;&nbsp;&nbsp;b) numero: el entero más reciente introducido por el usuario. \
&nbsp;&nbsp;&nbsp;&nbsp;c) mayor: el número más grande encontrado hasta ahora. 