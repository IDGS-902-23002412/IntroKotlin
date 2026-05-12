/*
--- Suma de dos matrices 3x3 en Kotlin ---
Crear un programa que permita el usuario ingresar por teclado los valores de
dos matrices de tamaño 3x3 y posteriormente realiza la suma de ambas matrices 
mostrando el resultado en pantalla. 

--- Explicación del programa ---
Se crean tres matrices:
1. Matriz1 para almacenar la primera matriz.
2. Matriz2 para almacenar la segunda matriz.
3. Matriz3 para guardar la suma. 
*/

fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val matriz3 = Array(3) { IntArray(3) }

    println("Ingresa los datos de la Matriz 1 ---")
    for (f in 0..2) {
        for (c in 0..2) {
            print("Matriz 1 coordenada ($f,$c): ")
            matriz1[f][c] = readln().toInt()
        }
    }

    println("\n Ingresa los datos de la Matriz 2:")
    for (f in 0..2) {
        for (c in 0..2) {
            print("Matriz 2 coordenada ($f,$c): ")
            matriz2[f][c] = readln().toInt()
        }
    }

    for (f in 0..2) {
        for (c in 0..2) {
            matriz3[f][c] = matriz1[f][c] + matriz2[f][c]
        }
    }

    println("\nResultado de la matriz: (Matriz 3) ---")
    for (f in 0..2) {
        for (c in 0..2) {
            print("${matriz3[f][c]} ")
        }
        println() 
    }
}
