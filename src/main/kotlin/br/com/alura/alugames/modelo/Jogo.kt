package org.example.br.com.alura.alugames.modelo

data class Jogo(val tittulo:String, val capa:String) {

    var descricao:String? = null


    override fun toString(): String {
        return "Meu jogo: '$tittulo', capa='$capa', descricao='$descricao')"
    }

}