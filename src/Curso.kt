class Curso(
        val nome: String,
        var codigoDoCurso: Int,
        val quantidadeMaxAlunos: Int,
) {

    val professorTitular: ProfessorTitular? = null
    val professorAdjunto: ProfessorAdjunto? = null
    val alunos = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (alunos.size >= quantidadeMaxAlunos){
             false
        } else {
            alunos.add(umAluno)
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        alunos.remove(umAluno)
    }
}

