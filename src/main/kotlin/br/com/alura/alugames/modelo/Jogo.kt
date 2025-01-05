package org.example.br.com.alura.alugames.modelo

data class Jogo(val tittulo: String, val capa: String) {
    var descricao: String? = null
    var preco = 0.0

    constructor(titulo: String, capa:String, preco:Double, descricao:String): this(titulo, capa){
        this.preco
        this.descricao = descricao
    }

    override fun toString(): String {
        return "Meu jogo: \n + " +
                "Titulo: $tittulo \n" +
                "Capa: $capa \n" +
                "Descrição: $descricao \n" +
                "Preço: $preco"
    }

}