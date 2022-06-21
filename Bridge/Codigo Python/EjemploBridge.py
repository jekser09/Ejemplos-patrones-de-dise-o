import Matricular
import Implementador
import MatriculaBeca
import MatriculaCondicional


def client_code(matricular: Matricular):
    print(matricular.operacion(), end="")


if __name__ == "__main__":
    
    matriculaBeca = MatriculaBeca()
    matricular = Matricular(Implementador)
    client_code(Matricular)

    print("\n")

    matriculaCondicional = MatriculaCondicional()
    matricular = Matricular(Implementador)
    client_code(matricular)