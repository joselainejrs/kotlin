// 5. Crie uma função em Kotlin que receba uma string e retorne a
// mesma string com todas as letras convertidas para maiúsculas.

// v1 
fun main(){
    val frase = "olá pessoas"
    println(conversao(frase))
}

// v2
fun main(args: Array<String>){
    if(args.isNotEmpty()){
        println(conversao(args.joinToString(" ")))
    }else{
        println("Nenhuma frase fornecida.")
    }
}

// ------------------------------

fun conversao(frase: String): String{
    return frase.toUpperCase()
}