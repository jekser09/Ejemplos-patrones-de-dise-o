import Matricular
from __future__ import annotations
from abc import ABC, abstractmethod
class ExtendedAbstraction(Matricular):

    def operacion(self) -> str:
        return (f"ExtendedAbstractio")