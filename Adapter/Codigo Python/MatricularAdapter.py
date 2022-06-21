import Solicitud
import Matricular
class MatricularAdapter(Solicitud):

    def __init__(self) -> None:
        self.__Matricular=Matricular()
    
    def Solicitud(self):
        self.__Matricular.inscripcion()