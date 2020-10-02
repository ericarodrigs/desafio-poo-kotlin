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

    fun excluirCurso(codigoCurso: Int) {
        cursos.forEach {
            it.codigoDoCurso = codigoCurso
            cursos.remove(it)
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, codigoProfessor)

        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String ,
                                  codigoProfessor: Int, especialidade: String ){
        val professorTitular = ProfessorTitular(especialidade, nome, sobrenome,  codigoProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        professores.forEach {
            it.codigoDoProfessor = codigoProfessor
            professores.remove(it)
        }
    }
}