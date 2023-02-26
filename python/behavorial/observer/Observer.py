from abc import ABC


class Observer(ABC):

    def update(self, message: str):
        raise NotImplementedError
