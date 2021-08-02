package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val jean = Gerente(
        nome= "Jean Henrique",
        cpf = "999.999.999",
        salario = 6000.0,
        senha = "senha123"
    )

    ImprimeRelatorioFuncionario.imprime(jean)
    TesteAutenticacao().autentica(jean)

}

