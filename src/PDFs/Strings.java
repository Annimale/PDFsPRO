/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PDFs;

/**
 *
 * @author skril
 */
public class Strings {

    /**
     * Comparación entre objetos String
 Disponemos de los métodos
 cadena1.equals(cadena2)
El resultado es true si la cadena1 es igual a la cadena2
Ambas cadenas son variables de tipo String

*  cadena1.equalsIgnoreCase(cadena2)
Como la anterior, pero en este caso no se tienen en cuenta
mayúsculas y minúsculas

*  s1.compareTo(s2)
Compara ambas cadenas considerando el orden alfabético (de la
tabla ASCII)
Si la primera cadena es mayor en orden alfabético que la segunda
devuelve 1, si son iguales devuelve 0 y si es la segunda la mayor
devuelve -1

*  s1.compareToIgnoreCase(s2)
Igual que la anterior, sólo que además ignora las mayúsculas
* 
* 
*  .length
 Permite devolver la longitud de una cadena (el número
de caracteres de la cadena)
String texto1=”Prueba”;
System.out.println(texto1.length()); // Escribe 6

*  Para concatenar cadenas se puede hacer de dos formas,
utilizando el método concat o con el operador +
String s1=”Buenos ”, s2=”días”, s3, s4;
s3 = s1 + s2;
s4 = s1.concat(s2);
* 
* charAt
Devuelve un carácter de la cadena
El carácter a devolver se indica por su posición
Si la posición es negativa o sobrepasa el tamaño de la cadena,
ocurre un error de ejecución
String s1=”Prueba”;
char c1=s1.charAt(2); // c1 valdrá ‘u’

* 
*  substring
Da como resultado una porción del texto de la cadena
La porción se toma desde una posición inicial hasta una posición
final (sin incluir esa posición final)
Si las posiciones indicadas no son válidas ocurre una excepción
String s1=”Buenos días”;
String s2=s1.substring(7,10); // s2 = día
* 
* 
*  indexOf
Devuelve la primera posición en la que aparece un determinado
texto en la cadena
En el caso de que la cadena buscada no se encuentre, devuelve -1
El texto a buscar puede ser char o String
String s1=”Quería decirte que quiero que te vayas”;
System.out.println(s1.indexOf(“que”)); // Da 15
Se puede buscar desde una determinada posición. En el ejemplo anterior:
System.out.println(s1.indexOf(“que”,16)); // Ahora da 26

* 
*  lastIndexOf
Devuelve la última posición en la que aparece un determinado texto
en la cadena
Es casi idéntica a la anterior, sólo que busca desde el final
String s1=”Quería decirte que quiero que te vayas”;
System.out.println(s1.lastIndexOf(“que”); // Da 26
También permite comenzar a buscar desde una determinada posición
* 
* 
* 
* endsWith
Devuelve true si la cadena termina con un determinado
texto
String s1=”Quería decirte que quiero que te vayas”;
System.out.println(s1.endsWith(“vayas”); //Da true

* 
*  startsWith
 Devuelve true si la cadena empieza con un determinado
texto
* 
* 
* 
* replace
Cambia todas las apariciones de un carácter por otro en el texto que se
indique y lo almacena como resultado
El texto original no se cambia, por lo que hay que asignar el resultado de
replace a un String para almacenar el texto cambiado:
String s1=”Mariposa”;
System.out.println(s1.replace(‘a’,’e’)); // Da Meripose
System.out.println(s1); // Sigue valiendo Mariposa

* 
*  replaceAll
Modifica en un texto cada entrada de una cadena por otra y devuelve el
resultado
El primer parámetro es el texto que se busca (que puede ser una
expresión regular), el segundo parámetro es el texto con el que se
reemplaza el buscado. La cadena original no se modifica
String s1=”Cazar armadillos”;
System.out.println(s1.replaceAll(“ar”,”er”)); // Da Cazer ermedillos
System.out.println(s1); // Sigue valiendo Cazar armadilos
* 
* 
* toUpperCase
Devuelve la versión en mayúsculas de la cadena

*  toLowerCase
Devuelve la versión en minúsculas de la cadena

*  toCharArray
Obtiene un array de caracteres a partir de una cadena
* 
* 
* 
     */
   
    }
    

