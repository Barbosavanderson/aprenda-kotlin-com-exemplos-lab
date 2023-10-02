// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Aluno (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun matricular(Aluno: Aluno) {
        alunosMatriculados.add(Aluno)
    }

    fun getAlunosMatriculados(): List<Aluno> {
        return alunosMatriculados
    }
}

fun main() {
    val nomesDosAlunos = listOf("João", "Maria", "Pedro", "Ana", "Carlos")
    val conteudo = ConteudoEducacional("Kotlin para iniciantes", 60)
    val formacao = Formacao("Desenvolvimento Android", Nivel.BASICO, listOf(conteudo))

    for (nome in nomesDosAlunos) {
        val aluno = Aluno(nome)
        formacao.matricular(aluno)
    }

    println("Alunos matriculados na formação ${formacao.nome}: ${formacao.getAlunosMatriculados().joinToString { it.nome }}")
}