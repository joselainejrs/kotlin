// 1. Escreva um programa em Kotlin que imprima &#39;Olá, mundo!&#39; na tela.
// 2. Crie uma função em Kotlin que receba dois números inteiros como parâmetros, some-os e retorne o resultado.


// V1
fun main() {
    println("Ola, mundo!")
    println(soma(5, 6))
}

// V2
fun main(args: Array<String>){
    if(args.size == 2){
        try {
            val a: Int = args[0].toInt()
        	val b: Int = args[1].toInt()
        	println("A soma de $a + $b é ${soma(a, b)}")
        }catch (e: NumberFormatException){
            println("Erro: O argumento fornecido não pode ser string ${e.toString().substring(51)}")            
        }       
    }else{
        println("A quantidade ultrapassa os 2 mumeros")
    }

}

fun soma(a: Int, b: Int): Int{
    return a + b
}
