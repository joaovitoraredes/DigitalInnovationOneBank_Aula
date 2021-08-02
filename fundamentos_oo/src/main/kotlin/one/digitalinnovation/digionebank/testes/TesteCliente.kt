package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jorge = Cliente(
        nome = "Jorge Augusto",
        cpf = "444.222.000.55",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jorge)

    TesteAutenticacao().autentica(jorge)
}