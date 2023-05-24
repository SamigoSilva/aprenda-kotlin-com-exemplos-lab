// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Level)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscricao.add(usuario)
    }

    fun RetornaUsuarios():List<Usuario>{
        return inscricao
    }
}



fun main() {
    
    val user1 = Usuario("Ricardo")
    val user2 = Usuario("Olivia")
    val user3 = Usuario("Anne")
    val user4 = Usuario("Claudio")

    val conEd1 = ConteudoEducacional("Dominando Linguagem de Programção Kotlin", 13, Level.BASICO)
    val conEd2 = ConteudoEducacional("Refinando Técnicas com Desafios em Kotlin",5, Level.INTERMEDIARIO)
    val conEd3 = ConteudoEducacional("Dominando Linguagem de Programção Java", 24, Level.INTERMEDIARIO)
    val conEd4 = ConteudoEducacional("Refinando Técnicas com Desafios em Java", 5, Level.DIFICIL)

    val formacaoemKotlin = Formacao("Formação Kotlin", listOf(conEd1, conEd2))
    formacaoKotlin.matricular(user1)
    formacaoKotlin.matricular(user2)


    val formacaoemJava = Formacao("Formação Java", listOf(conEd3, conEd4))
    formacaoJava.matricular(user3)
    formacaoJava.matricular(user4)


    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    println("Formação em Kotlin")
    for (conteudo in formacaoemKotlin.ConteudoEducacional){
        println("Conteudo: ${ConteudoEducacional.nome}  Duração:  ${ConteudoEducacional.duracao} horas  Level: ${ConteudoEducacional.nivel}")
    }

    println( "Inscrições")
    for (usuario in formacaoemKotlin.RetornaUsuarios()){
        println("Nome: ${usuario.nome}")
    }

    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

    println("Formação em Java")
    for (conteudo in formacaoemJava.ConteudoEducacional){
        println("Conteudo: ${ConteudoEducacional.nome}  Duração:  ${ConteudoEducacional.duracao} horas  Level: ${ConteudoEducacional.nivel}")
    }

    println( "Inscrições")
    for (usuario in formacaoemJava.RetornaUsuarios()){
        println("Nome: ${usuario.nome}")
    }
    
}
