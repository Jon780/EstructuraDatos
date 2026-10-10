# Tipos de datos abstractos

La idea centrales qque no se memorize TDA como una definicion.

La secuencia para entenderlo:
** =>**datos**=>**operaciones**=>**reglas**=>**abstraccion**TDA*=>**implementacion**=>**clase java**=>**estructura de Datos**

para despues entrar a lo que esuna *pila*, 'cola', **lista* y *arboles*

1. problema

>supongamos que tenemos un sistema escolar y queremos manejar estudiante

Cada estudiante:

-matricula
-nombre
-carrera
-promedio

Hasta ahora estamo de **datos**

pero el programa no solamente necesita almacenar esos datos.
Tambien nesita hacer cosas con ellos:

-registrar un cliente
-consultar sus datos
-cambiar su promedio
-verificar si esta aprobado
-mostrar informacion

Entonces aparece una idea importate:
en programacion no solamente importa **que datos tenemos**, sino tambien **que operaciones podemos realizar sobre esos datos**

NOTA: Este es el primer paso hacia un TDA

2. Dato simple vs algo mas complejo

Ya conocemos:

```java
int edad;
double promedio;
String nombre;
```
Estos tipos de datos ya los conoce java.

por ejemplo:

`int edad = 20;`

Java sabe:

-que tipo de valor puede almacenar
-cuanto espacio requiere
-que operaciones se pueden realizar

con un int:

```java
edad + 1
edad - 1
edad > 10
edad++
++edad
```

pero si pensamos en:

`estudiante`

Java originalmente no tiene un tipo llamado **Estudiante**

Nesecitamos construirlo

Aqui comienza a aparecer la idea de **crear nuestros propios tipos de datos**

3. ¿que seria un tipo de dato?

se puede definir inicialmente asi;

>un tipo de dato define que valores pueden existir y que operaciones puede realizarse con esos valores

por ejemplo:

*int*
valores posibles:

-10
0
5
100
2500

Operaciones: Aritmeticas y Relacionales

boolean

Valores:
```
true
false
```
Operaciones: