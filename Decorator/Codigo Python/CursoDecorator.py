import Curso

class CursoDecorator(Curso):

    _curso: Curso = None

    def __init__(self, curso:Curso) -> None:
        self._curso = curso

    @property
    def curso(self) -> Curso:        

        return self._curso

    def operacion(self) -> str:
        return self._curso.operacion()