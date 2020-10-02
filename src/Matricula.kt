import java.time.LocalDateTime

class Matricula(
        val aluno: Aluno,
        val curso: Curso,
        var dataMatricula: LocalDateTime
) {

    init {
        dataMatricula = LocalDateTime.now()
    }
}