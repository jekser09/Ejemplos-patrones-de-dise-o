from unicodedata import name
from Curso import *
from Grupo import *
from Materia import *

class Matricula:
    def __init__(self):
        self.curso = Curso()
        self.grupo = Grupo()
        self.materia = Materia()

    def realizarMatricula(self):
        self.curso.curso()
        self.grupo.grupo()
        self.materia.materia()

if __name__ == "__main__":
    matricula = Matricula()
    matricula.realizarMatricula()


