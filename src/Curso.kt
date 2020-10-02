class Curso(
        val nome: String,
        val codigoDoCurso: String,
        val professorTitular: ProfessorTitular,
        val professorAdjunto: ProfessorAdjunto,
        val quantidadeMaxAlunos: Int,
        val alunos: List<Aluno>
) {
}

