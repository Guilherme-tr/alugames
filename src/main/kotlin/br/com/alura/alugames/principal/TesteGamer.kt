package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer


fun main(){
    val gamer1 = Gamer("Gui", "Gui@gui.com")
    println(gamer1)

    val gamer2 = Gamer("   ", "Gabi@gabi.com", "20/08/1998", "GabiGamer")
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "31/01/1999"
        it.usuario = "GGgamer"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
}