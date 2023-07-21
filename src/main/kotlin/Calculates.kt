import kotlin.math.PI

fun calculate1(){
    print("ingrese base: ")
    var base = readLine()?.toInt() ?:0
    print("ingrese altura: ")
    var altura = readLine()?.toInt() ?:0
    val resul = (base * altura)/2
    println(resul)
}

fun calculate2(){
    print("numero 1: ")
    var num1 = readLine()?.toInt() ?:0

    print("ingrese 2: ")
    var num2 = readLine()?.toInt() ?:0
    val resul = num1 + num2
    println(resul)
}

fun calculate3(){
    print("numero 1: ")
    var num1 = readLine()?.toInt() ?:0

    var exp:Int = 2

    val resul = Math.pow(num1.toDouble() , exp.toDouble())
    println("el resultado es $resul")
}

fun calculate4(){
    print("ingrese euros: ")
    var euros = readLine()?.toInt() ?:0
    var dolares:Float = 1.12f
    val resul = euros * dolares
    println("resulatdo: $resul")
}

fun calculate5() {
    print("Ingrese la longitud del lado del cubo: ")
    val lado = readLine()?.toInt() ?: 0

    val area = 6 * lado * lado
    val volumen = lado * lado * lado

    println("El área del cubo es: $area")
    println("El volumen del cubo es: $volumen")
}

fun calculate6() {
    println("Ingrese el radio de la base del cilindro: ")
    val radio = readLine()?.toDouble() ?: 0.0

    println("Ingrese la altura del cilindro: ")
    val altura = readLine()?.toDouble() ?: 0.0

    val areaLateral = 2 * PI * radio * altura
    val areaTotal = 2 * PI * radio * (radio + altura)
    val volumen = PI * radio * radio * altura

    println("El área lateral del cilindro es: $areaLateral")
    println("El área total del cilindro es: $areaTotal")
    println("El volumen del cilindro es: $volumen")
}

fun calculate7(){
    println("Ingrese el radio de la circunferencia: ")
    val radio = readLine()?.toDouble() ?: 0.0

    val longitudCircunferencia = 2 * PI * radio
    val areaCirculoInscrito = PI * radio * radio

    println("La longitud de la circunferencia es: $longitudCircunferencia")
    println("El área del círculo inscrito es: $areaCirculoInscrito")
}

fun calculate8(){
    println("Ingrese el primer número: ")
    val numero1 = readLine()?.toDouble() ?: 0.0

    println("Ingrese el segundo número: ")
    val numero2 = readLine()?.toDouble() ?: 0.0

    println("Ingrese el tercer número: ")
    val numero3 = readLine()?.toDouble() ?: 0.0

    val promedio = (numero1 + numero2 + numero3) / 3

    println("El promedio de los tres números es: $promedio")
}