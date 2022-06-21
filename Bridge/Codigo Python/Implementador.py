from abc import ABC, abstractmethod
from __future__ import annotations
class Implementation(ABC):
    @abstractmethod
    def operacion(self) -> str:
        pass
