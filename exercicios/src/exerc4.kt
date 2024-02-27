// 4. Escreva um programa em Kotlin que receba uma sequencia de
// números como parâmetro e diga para cada um deles se ele é par ou ímpar.

// v1
fun main(){
    val numeros = listOf(1,2,3,4)
    verificaNumero(numeros)
}

// v2
fun main(args: Array<String>){
    if(args.isNotEmpty()){
        verificaNumero(args.map {it.toInt()})
    }else{
        println("Nenhuma numero fornecida.")
    }
}

// ------------------------------

fun verificaNumero(numeros: List<Int>){
    var countPar = 0
    var countImpar = 0
    for (numero in numeros){
        if (numero % 2 == 0){     
            countPar += 1 
            println("o numero $numero é par")
        }else{
            countImpar += 1
            println("O número $numero é ímpar")
        }
    }
    println("Foram encontrados $countPar pares e $countImpar impares")
}