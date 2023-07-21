import kotlin.math.PI

fun main() {
    println("Seleccione una opción:")
    println("1. Calculate")
    println("2. Condicionales")
    println("3. Cyclos")

    val option = readLine()?.toInt() ?: 0

    when (option) {
        1 -> {
            println("Seleccionó Evidencia1")
            println("elija 1 para Calcular el área de un triángulo")
            println("elija 2 para Ingresar dos números por teclado y sumarlos.")
            println("elija 3 para Ingresar un número y visualizar el número elevado al cuadrado")
            println("elija 4 para Escribir un algoritmo que convierta de euros a dólares")
            println(
                "elija 5 para Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n" +
                        "perímetro"
            )
            println("elija 6 para Escribir un algoritmo que determine el área y el volúmen de un cilindro")
            println(
                "elija 7 para Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                        "el área (pi*r)^2 del círculo inscrito."
            )
            println("elija 8  para Calcular el promedio de tres (3) números ingresados por teclado")
            val option1 = readLine()?.toInt() ?: 0
            when (option1) {
                1 -> {
                    println("usted ingreso")
                    calculate1()
                }

                2 -> {
                    println("usted ingreso")
                    calculate2()
                }

                3 -> {
                    println("usted ingreso")
                    calculate3()
                }

                4 -> {
                    println("usted ingreso")
                    calculate4()
                }

                5 -> {
                    println("usted ingreso")
                    calculate5()
                }

                6 -> {
                    println("usted ingreso")
                    calculate6()
                }

                7 -> {
                    println("usted ingreso")
                    calculate7()
                }

                8 -> {
                    println("usted ingreso")
                    calculate8()
                }

                else -> {
                    println("opcion no valida")
                }
            }
            // Aquí puedes llamar a la función correspondiente de evidencia1.kt
            // Por ejemplo, para ejecutar la función conditionals1():
            // conditionals1()
        }

        2 -> {
            println("Seleccionó conditionals")
            println("elija 1 para Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.")
            println("elija 2 para Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el\n" +
                    "menor")
            println("elija 3 para Escriba un programa que lea tres números enteros positivos y que calcule e imprima en\n" +
                    "pantalla el menor y el mayor de ellos")
            println("elija 4 para Dados dos números A y B, sumarlos si A es menor que B o sino restarlos")
            println("elija 5 para Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\n" +
                    "no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es\n" +
                    "posible")
            println("elija 6 para Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario\n" +
                    "multiplicarlos ")
            println("elija 7 para Escribir un algoritmo que determine si un año es bisiesto o no.")
            val option2 = readLine()?.toInt() ?: 0
            when (option2) {
                1 -> {
                    println("usted ingreso")
                    conditionals1()
                }

                2 -> {
                    println("usted ingreso")
                    conditionals2()
                }

                3 -> {
                    println("usted ingreso")
                    conditionals3()
                }

                4 -> {
                    println("usted ingreso")
                    conditionals4()
                }

                5 -> {
                    println("usted ingreso")
                    conditionals5()
                }

                6 -> {
                    println("usted ingreso")
                    conditionals6()
                }

                7 -> {
                    println("usted ingreso")
                    conditionals7()
                }

                else -> {
                    println("opcion no valida")
                }
            }
        }

        3 -> {
            println("Seleccionó Conditionals")
            println("elija 1 para Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
            println("elija 2 para Imprimir los números impares entre 0 y 100.")
            println("elija 3 para Imprimir los números pares del 1 al 100.")
            println("elija 4 para Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.")
            println("elija 5 para Escribir un programa que sume los cuadrados de los cien primeros números naturales,\n" +
                    "mostrando el resultado en pantalla")
            println("elija 6 para Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\n" +
                    "números comprendidos entre ellos en secuencia ascendente.")
            println("elija 7 para Sumar todos los números que se digitan por teclado mientras no sea cero")

            println("Seleccionó conditionals")
            val option3 = readLine()?.toInt() ?: 0
            when (option3) {
                1 -> {
                    println("usted ingreso")
                    cycles1()
                }

                2 -> {
                    println("usted ingreso")
                    cycles2()
                }

                3 -> {
                    println("usted ingreso")
                    cycles3()
                }

                4 -> {
                    println("usted ingreso")
                    cycles4()
                }

                5 -> {
                    println("usted ingreso")
                    cycles5()
                }

                6 -> {
                    println("usted ingreso")
                    cycles6()
                }

                7 -> {
                    println("usted ingreso")
                    cycles7()
                }

                else -> {
                    println("opcion no valida")
                }
            }
        }
    }
}

