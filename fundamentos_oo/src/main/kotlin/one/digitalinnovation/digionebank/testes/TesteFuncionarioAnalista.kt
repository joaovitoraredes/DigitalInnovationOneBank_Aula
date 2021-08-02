package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val Joao = Analista("João Vitor", "123.456.789.10",2000.0)
    val Carlos = Analista("Carlos Junior", "987.654.321.90",2000.0)

    ImprimeRelatorioFuncionario.imprime(Joao)
    println("")
    ImprimeRelatorioFuncionario.imprime(Carlos)

}

