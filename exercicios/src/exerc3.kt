// 3. Implemente uma função em Kotlin que receba uma lista de números inteiros e retorne a soma de todos os elementos.

// v1 
fun main(){
    val lista = listOf(1,2,3,4)
    println("Soma dos valores são ${soma(lista)}")
    println("Soma dos valores da segunda soma são ${soma2(lista)}")
}

// v2 
fun main(args: Array<String>){
	println("Soma dos valores são ${soma(args.map {it.toInt()} )}")
    println("Soma dos valores da segunda soma são ${soma2(args.map {it.toInt()} )}")
}

fun soma(lista: List<Int>): Int{
    return lista.sum()
}

fun soma2(listas: List<Int>): Int{
    var result = 0
    for (lista in listas) {
      result += lista
    }
   return result
}