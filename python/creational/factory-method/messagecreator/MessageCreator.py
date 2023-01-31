from Message import Message
from abc import ABC, abstractmethod


class MessageCreator(ABC):

    @abstractmethod
    def get_creator(self) -> Message:
        raise NotImplementedError
