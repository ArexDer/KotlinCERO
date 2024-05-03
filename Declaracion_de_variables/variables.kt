/*
En resumen: "Any" se utiliza para declarar una variable que puede contener
 cualquier tipo de valor y "Any?" se utiliza para declarar una variable opcional
  que también puede contener cualquier tipo de valor.
 */


fun main() {
    var variable: Any = "Hola mundo"
        variable = 10
        print(variable)

        var variableAn: Any? = null
        print(variableAn)
}

/*
VARIABLE MUTABLE

var x = 5 // x es una variable mutable con un valor inicial de 5

x = 7 // se puede cambiar el valor de x
 */

 /*
 VARIABLE INMUTABLE

 val y = "Hello" // y es una variable inmutable con un valor inicial de "Hello"

y = "Bye" // esto causaría un error, ya que no se puede cambiar el valor de y


ASIGNACION DE VARIABLES MEDIANTE "="
var num = 2


-----IMPORTANTE-----
 "destructuring declarations"

 val (x, y) = Pair(1, 2) // asigna el valor 1 a x y el valor 2 a y

 val name: String = "John"
 
  */