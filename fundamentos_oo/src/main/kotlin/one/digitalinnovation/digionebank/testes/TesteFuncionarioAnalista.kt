package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("João Vitor", "123.456.789.10",2000.0)
    val carlos = Analista("Carlos Junior", "987.654.321.90",2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
    println("")
    ImprimeRelatorioFuncionario.imprime(carlos)

}

