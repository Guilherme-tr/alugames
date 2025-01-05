package br.com.alura.alugames.modelo

import org.example.br.com.alura.alugames.modelo.Jogo

data class Aluguel(val gamer: Gamer, val jogo: Jogo){

    override fun toString(): String {
        return "Aluguel do jogo ${jogo.tittulo} por ${gamer.nome}"
    }
}
