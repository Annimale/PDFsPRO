/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDFs;

/**
 *
 * Cómo utilizar la instrucción try…catch
 Poner el código que podría lanzar excepciones en un
bloque try
 Gestionar las excepciones en uno o más bloques catch

* try {
‘código que puede provocar errores
} catch (ExceptionA a) {
....
} catch (ExceptionB b) {
....
}

* 
 * Algunos Métodos de Exception

*  String getMessage()
 Obtiene el mensaje descriptivo de la excepción o una indicación
específica del error ocurrido

*  String toString()
 Escribe una cadena sobre la situación de la excepción. Suele indicar la
clase de excepción y el texto de getMessage()

*  void printStackTrace()
 Escribe el método y mensaje de la excepción (la llamada información de
pila)

*  El resultado es el mismo mensaje que muestra el ejecutor (la máquina
virtual de Java) cuando no se controla la excepción
try{
....
} catch (IOException ioe){
System.out.println(ioe.getMessage());
}
 * 
 * @author skril
 */
public class Excepciones {
    
}
