class DigitalHouseManager {

    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professro>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAlunos: Int
    ) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        cursos.add(curso)
    }

}