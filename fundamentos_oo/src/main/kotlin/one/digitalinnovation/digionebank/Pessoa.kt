package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "João Vitor" //deixando claro que só pode string para evitar de utilizarem números e etc
    var cpf: String = "123.456.789.10" //usando como string, por conta dos pontos"."
}

fun main() {
    val joao =  Pessoa()

    println(joao.nome)
    println(joao.cpf)
}