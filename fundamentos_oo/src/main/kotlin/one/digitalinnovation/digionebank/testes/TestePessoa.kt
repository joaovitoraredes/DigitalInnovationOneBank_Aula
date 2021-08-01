package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val joao =  Pessoa(nome = "João Vitor", cpf = "123.456.789.10" )

    println(joao.nome)
    println(joao.cpf)
}