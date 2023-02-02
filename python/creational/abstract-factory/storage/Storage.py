from abc import ABC, abstractmethod


class Storage(ABC):

    @abstractmethod
    def get_size(self):
        raise NotImplementedError
