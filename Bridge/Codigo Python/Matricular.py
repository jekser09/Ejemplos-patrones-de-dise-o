from __future__ import annotations
from abc import ABC, abstractmethod
import Implementador
# CLASE ABSTRACTA

class Matricular:    

    def __init__(self, implementador: Implementador) -> None:
        self.implementador = implementador

    def operacion(self) -> str:
        return (f"operacion")
    