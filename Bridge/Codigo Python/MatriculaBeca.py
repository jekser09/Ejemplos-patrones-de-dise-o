import Implementador
from __future__ import annotations
from abc import ABC, abstractmethod

class MatriculaBeca(Implementador):
    def operacion(self) -> str:
        return "MatriculaBeca"