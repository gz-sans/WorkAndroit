fun conditionals1() {
    println("Ingrese un número: ")
    val numero = readLine()?.toInt() ?: 0

    if (numero > 0) {
        println("El número es positivo.")
    } else if (numero < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}

fun conditionals2() {
    println("Ingrese el primer número: ")
    val numero1 = readLine()?.toDouble() ?: 0.0

    println("Ingrese el segundo número: ")
    val numero2 = readLine()?.toDouble() ?: 0.0

    val mayor = if (numero1 > numero2) numero1 else numero2
    val menor = if (numero1 < numero2) numero1 else numero2

    println("El número mayor es: $mayor")
    println("El número menor es: $menor")
}

fun conditionals3() {
    println("Ingrese el primer número: ")
    val numero1 = readLine()?.toInt() ?: 0

    println("Ingrese el segundo número: ")
    val numero2 = readLine()?.toInt() ?: 0

    println("Ingrese el tercer número: ")
    val numero3 = readLine()?.toInt() ?: 0

    val mayor = maxOf(numero1, numero2, numero3)
    val menor = minOf(numero1, numero2, numero3)

    println("El número mayor es: $mayor")
    println("El número menor es: $menor")
}

fun conditionals4() {
    println("Ingrese el número A: ")
    val a = readLine()?.toDouble() ?: 0.0

    println("Ingrese el número B: ")
    val b = readLine()?.toDouble() ?: 0.0

    val resultado = if (a < b) a + b else a - b

    println("El resultado es: $resultado")
}

fun conditionals5() {
    println("Ingrese el número A: ")
    val a = readLine()?.toDouble() ?: 0.0

    println("Ingrese el número B: ")
    val b = readLine()?.toDouble() ?: 0.0

    if (b != 0.0) {
        val cociente = a / b
        println("El cociente es: $cociente")
    } else {
        println("No es posible dividir entre cero.")
    }
}

fun conditionals6() {
    println("Ingrese el número A: ")
    val a = readLine()?.toDouble() ?: 0.0

    println("Ingrese el número B: ")
    val b = readLine()?.toDouble() ?: 0.0

    val resultado = if (a < 0 || b < 0) a + b else a * b

    println("El resultado es: $resultado")
}

fun conditionals7() {
    println("Ingrese el año: ")
    val year = readLine()?.toInt() ?: 0

    val esBisiesto = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

    if (esBisiesto) {
        println("El año $year es bisiesto.")
    } else {
        println("El año $year no es bisiesto.")
    }
}