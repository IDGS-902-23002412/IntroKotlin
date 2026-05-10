fun main(){
    var x = 1
    while (x <= 10){
        println(x)
        x+=1
    }
    //do- .while
    var cant = 0
    var suma = 0
    do{
        print("Ingresa un valor ( 0 para finalizar)")
        val valor =readln().toInt()
        if(valor != 0 ){
            suma += valor
            cant++
        }
    }while(valor != 0)
    if (cant != 0){
        val promedio = suma / cant
        print("El promedio es : $promedio")
    }else
        println("No se ingresaron valores")
}

/*
Problema 1: Un programa solicita al usuario ingresar el diametro de una tuberia.
No se permiten valores negativos o cero. El programa debe pedir el dato rapidamente
hasta que el usuario ingrese un valor.

Problema 2: Una batería comienza con \(0\%\) de carga. Un cargador añade \(15\%\)
cada minuto. Se debe detener el ciclo cuando la carga llegue o supere el \(100\%\).

Problema 3: Un controlador PLC bloquea el acceso tras 3 intentos fallisdo de ingresar
una clave de seguridad. 
*/