package br.com.alura.alugames.util

import br.com.alura.alugames.modelo.InfoJogoJson
import org.example.br.com.alura.alugames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}