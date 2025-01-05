package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Periodo
import br.com.alura.alugames.servicos.ConsumoApi
import java.time.LocalDate

fun main(){
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogo = consumo.buscaJogosJson()

    val gamer1 = listaGamers.get(3)
    val jogo1 = listaJogo.get(10)
    val jogo2 = listaJogo.get(13)
    val jogo3 = listaJogo.get(2)

    val periodo1 = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    val periodo2 = Periodo(LocalDate.now(), LocalDate.now().plusDays(3))
    val periodo3 = Periodo(LocalDate.now(), LocalDate.now().plusDays(10))

    gamer1.alugaJogo(jogo1, periodo1)
    gamer1.alugaJogo(jogo2, periodo2)
    gamer1.alugaJogo(jogo3, periodo3)
    println(gamer1.jogosAlugados)
}