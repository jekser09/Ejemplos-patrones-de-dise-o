import Curso
import CursoPresencial
import CursoVirtual
import CursoIntersemestral

def client_code(curso: Curso) -> None:
    print(f"Salida: {curso.operacion()}", end="")
    


if __name__ == "__main__":
    
    simple = CursoPresencial()
    print("Cliente: Componente simple")
    client_code(simple)
    print("\n")
    
    decorador1 = CursoVirtual(simple)
    decorador2 = CursoIntersemestral(decorador1)
    print("Cliente: Componente Decorado")
    client_code(decorador2)