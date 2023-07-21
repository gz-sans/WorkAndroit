fun cycles1() {
    for (i in 1..100) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}

fun cycles2() {
    for (i in 1..100 step 2) {
        println(i)
    }
}

fun cycles3() {
    for (i in 2..100 step 2) {
        println(i)
    }
}

fun cycles4() {
    for (i in 1..30) {
        val cuadrado = i * i
        println("El cuadrado de $i es: $cuadrado")
    }
}

fun cycles5() {
    var suma = 0
    for (i in 1..100) {
        suma += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $suma")
}

fun cycles6() {
    println("Ingrese el primer número: ")
    val inicio = readLine()?.toInt() ?: 0

    println("Ingrese el segundo número (debe ser mayor que el primero): ")
    val fin = readLine()?.toInt() ?: 0

    if (inicio < fin) {
        println("Números comprendidos entre $inicio y $fin en secuencia ascendente:")
        for (i in inicio..fin) {
            println(i)
        }
    } else {
        println("El primer número debe ser menor que el segundo número.")
    }
}

fun cycles7() {
    var suma = 0
    var numero: Int
    do {
        println("Ingrese un número (ingrese 0 para finalizar): ")
        numero = readLine()?.toInt() ?: 0
        suma += numero
    } while (numero != 0)

    println("La suma de los números ingresados es: $suma")
}