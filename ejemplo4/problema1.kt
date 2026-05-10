/*
Problema 1: Un programa solicita al usuario ingresar el diametro de una tuberia.
No se permiten valores negativos o cero. El programa debe pedir el dato repetidamente
hasta que el usuario ingrese un valor valido.
*/

fun main() {

    var diametro = 0.0

    do {
        println("Ingresa el diametro de la tuberia:")
        diametro = readln().toDouble()

        if (diametro <= 0) {
            println("El diametro no puede estar negativo o ser 0")
        }

    } while (diametro <= 0)

    println("Diametro: $diametro")

}