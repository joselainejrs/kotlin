// 7. Implemente em Kotlin uma função que receba um array de strings
// e um termo de busca. A função deve imprimir todos os elementos
// do array que sejam iguais ao termo de busca.

fun main(args: Array<String>) {
    val termoDeBusca = args.joinToString(" ")
    val listaDeCompras = listOf("Arroz", "feijao", "Batata", "Frutas", "Legumes")
    val comprasEncontradas = mutableListOf<String>()

    for (compra in listaDeCompras) {
        if (compra == termoDeBusca) {
            comprasEncontradas.add(compra)
        }
    }

    if (comprasEncontradas.isNotEmpty()) {
        val emojiFelicidade = "😊"
        println("Sucesso na busca por: $termoDeBusca $emojiFelicidade")
       
    } else {
        val emojiTriste = "😞"
        println("Nenhuma encontrada com esse nome: '$termoDeBusca $emojiTriste'.")
    }
}




