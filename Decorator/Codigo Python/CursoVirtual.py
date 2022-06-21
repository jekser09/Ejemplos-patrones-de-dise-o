import CursoDecorator
class CursoVirtual(CursoDecorator):

    def operacion(self) -> str:
        
        return f"CursoVirtual({self.curso.operacion()})"