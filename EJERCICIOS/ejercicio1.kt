class NumeroUtil {

    fun eliminarYDeducir(numero: Int, posicion: Int): String {
        val numeroString = numero.toString()

        if (posicion < 1 || posicion > numeroString.length) {
            return "Posición no válida"
        }


        val digitoEliminado = Character.getNumericValue(numeroString[numeroString.length - posicion])
        println(numeroString.length - posicion)
        println(digitoEliminado)

        val nuevoNumero = StringBuilder(numeroString).deleteCharAt(numeroString.length - posicion).toString().toInt()

        return when (posicion) {
            1 -> "Se eliminó la unidad $digitoEliminado y el nuevo número es $nuevoNumero"
            2 -> "Se eliminó la decena $digitoEliminado y el nuevo número es $nuevoNumero"
            3 -> "Se eliminó la centena $digitoEliminado y el nuevo número es $nuevoNumero"
            4 -> "Se eliminó el millar $digitoEliminado y el nuevo número es $nuevoNumero"
            else -> "Posición no válida"
        }
    }
}
/*
FUNCIONES HASH....|Cripto Hibrida
 */

fun main() {
    
    val util = NumeroUtil()
    val numero = 9834
    val posicion = 3 // Posición desde la derecha

    val resultado = util.eliminarYDeducir(numero, posicion)
    println(resultado)
}