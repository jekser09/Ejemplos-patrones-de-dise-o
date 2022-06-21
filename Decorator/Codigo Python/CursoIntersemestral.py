from CursoDecorator import *
class CursoIntersemestral(CursoDecorator):
  
      def operacion(self) -> str:
        return f"CursoIntersemestral({self.curso.operacion()})"