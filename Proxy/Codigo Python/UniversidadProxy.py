from Universidad import *
class UniversidadProxy:
    def __init__(self):
        self.tarifa=1000
        self.universidad=None

    def estudiando(self):
        print("Proxy comprobando si el saldo del estudiante es claro o no... ")
        if self.tarifa<=500:
            self.universidad=Universidad()
            self.universidad.estudiando()
        else:
            print("El saldo de su tarifa es mayor a 500,primero pague la tarifa")


if __name__ == "__main__":
    universidadProxy = UniversidadProxy()
    universidadProxy.estudiando()
    universidadProxy.tarifa=100
    universidadProxy.estudiando()