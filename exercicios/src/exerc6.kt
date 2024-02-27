// 6. Desenvolva um programa em Kotlin que utilize um loop para
// imprimir os números de 1 a 10.

fun main() {
    var n = 1

    while (n <= 10) {
        println(n)
        n++
    }
}

// ou

fun main() {
    for (n in 1..10) {
        println(n)
    }
}
