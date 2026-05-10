/*
Problema 3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad. 
*/

/*
Problema 3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad.
*/

fun main() {

    val claveCorrecta = "0803"
    var intentos = 0
    var acceso = false

    while (intentos < 3 && !acceso) {
        println("Ingresa la clave de seguridad:")
        val clave = readln()

        if (clave == claveCorrecta) {
            println("Acceso permitido")
            acceso = true
        } else {
            intentos++
            println("Incorrecto.Intento $intentos / 3")
        }
    }

    if (!acceso) {
        println("Acceso bloqueado.")
    }
}