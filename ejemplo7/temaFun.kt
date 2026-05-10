fun mostrarMayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor: ")

    if (v1 > v2 && v1 > v3)
        println(v1)
    else if (v2 > v3)
        println(v2)
    else
        println(v3)
}

fun retornarMayor2 (v1: Int, v2: Int): Int{
    if (v1 > v2)
        return v1
    else 
        return v2
}

fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main() {
    limpiarPantalla()

    print("Ingrese primer valor: ")
    val valor1 = readln().toInt()

    print("Ingrese segundo valor: ")
    val valor2 = readln().toInt()

    print("Ingrese tercer valor: ")
    val valor3 = readln().toInt()

    mostrarMayor(valor1, valor2, valor3)
}

/* 
Figuras: Crear un programa que permita calcular el área de 4 figuras,
mostrar un menú para elegir la figura a calcular el área, pedira los 
valores necesarios y mostrara el resultado, a continuación, mostrara 
nuevamente el menú termina al elegir opción 5 
*/
