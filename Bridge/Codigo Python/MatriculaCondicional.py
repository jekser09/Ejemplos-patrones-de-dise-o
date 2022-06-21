import Implementador
from __future__ import annotations
from abc import ABC, abstractmethod

class MatriculaCondicional(Implementador):
    def operacion(self) -> str:
        return "operacion"
