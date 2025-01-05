package br.com.alura.alugames.principal

import br.com.alura.alugames.servicos.ConsumoApi

fun main(){
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogo = consumo.buscaJogosJson()

    val gamer1 = listaGamers.get(3)
    val jogo1 = listaJogo.get(10)

    println(gamer1)
    println(jogo1)

    val aluguel = gamer1.alugaJogo(jogo1)
    println(aluguel)
}