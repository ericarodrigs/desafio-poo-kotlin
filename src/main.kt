fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarAluno("erica", "rodrigues", 1)
    digitalHouseManager.registrarCurso("logica" ,1, 5)

    digitalHouseManager.matricularAluno(1, 1)

    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 2)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 3)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 4)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 5)
    digitalHouseManager.registrarAluno("erica2", "rodrigues2", 6)

    digitalHouseManager.matricularAluno(2, 1)
    digitalHouseManager.matricularAluno(3, 1)
    digitalHouseManager.matricularAluno(4, 1)
    digitalHouseManager.matricularAluno(5, 1)
    digitalHouseManager.matricularAluno(6, 1)
}