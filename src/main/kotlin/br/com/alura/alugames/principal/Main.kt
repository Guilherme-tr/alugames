package org.example.br.com.alura.alugames.principal

import br.com.alura.alugames.servicos.ConsumoApi
import org.example.br.com.alura.alugames.modelo.Jogo
import java.util.*

fun main() {
    val leitura = Scanner(System.`in`)

    do {
        println("Digite um codigo de jogo para buscar: ")
        val busca = leitura.nextLine()

        val buscaApi = ConsumoApi()

        val informacaoJogo = buscaApi.buscaJogo(busca)

        var meuJogo: Jogo? = null

        val resultado = runCatching {
            meuJogo = Jogo(
                informacaoJogo.info.title,
                informacaoJogo.info.thumb)

            println(meuJogo)
        }

        resultado.onFailure {
            println("Jogo inexistente. Tente outro id")
        }

        resultado.onSuccess {
            println("Deseja inserir uma descrição personalizada? S/N")
            val opcao = leitura.nextLine()

            if(opcao.equals("s", true)){
                println("Insera a descriça2o personalizada para o jogo:")
                val descricaoPersonalizada = leitura.nextLine()
                meuJogo?.descricao = descricaoPersonalizada
            }else {
                meuJogo?.descricao = meuJogo?.tittulo
            }

            println(meuJogo)

        }

        println("Deseja buscar um novo jogo? S/N")
        val resposta = leitura.nextLine()

    } while (resposta.equals("s", true))



}