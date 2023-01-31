from abc import ABC, abstractmethod


class Message(ABC):

    @abstractmethod
    def get_content(self):
        raise NotImplementedError
