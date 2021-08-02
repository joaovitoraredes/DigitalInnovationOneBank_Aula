package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val Jean = Gerente("Jean Henrique", "999.999.999", 6000.0 )

    ImprimeRelatorioFuncionario.imprime(Jean)
    println("")

}

