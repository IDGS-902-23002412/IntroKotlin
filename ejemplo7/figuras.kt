import kotlin.math.PI

fun areaTriangulo() {
    print("Ingresa la base del triangulo: ")
    val base = readln().toDouble()

    print("Ingresa la altura del triangulo: ")
    val altura = readln().toDouble()

    val area = (base * altura) / 2
    println("El area del triangulo es: $area")
}

fun areaRectangulo() {
    print("Ingresa la base del rectangulo: ")
    val base = readln().toDouble()

    print("Ingresa la altura del rectangulo: ")
    val altura = readln().toDouble()

    val area = base * altura
    println("El area del rectangulo es: $area")
}

fun areaCirculo() {
    print("Ingresa el radio del circulo: ")
    val radio = readln().toDouble()

    val area = PI * radio * radio
    println("El area del circulo es: $area")
}

fun areaCuadrado() {
    print("Ingresa el lado del cuadrado: ")
    val lado = readln().toDouble()

    val area = lado * lado
    println("El area del cuadrado es: $area")
}

fun main() {

    var opcion: Int

    do {
        println("****MENU****")
        println("1. Area de Triangulo")
        println("2. Area de Rectangulo")
        println("3. Area de Circulo")
        println("4. Area de Cuadrado")
        println("5. Salir")
        print("Elige una opcion: ")

        opcion = readln().toInt()

        when (opcion) {
            1 -> areaTriangulo()
            2 -> areaRectangulo()
            3 -> areaCirculo()
            4 -> areaCuadrado()
            5 -> println("Saliendo...")
            else -> println("Opcion invalida.")
        }

        println()

    } while (opcion != 5)
}