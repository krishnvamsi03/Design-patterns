from abc import ABC, abstractmethod


class ResourceFactory(ABC):

    @abstractmethod
    def create_instance(self):
        raise NotImplementedError

    @abstractmethod
    def create_storage(self, size):
        raise NotImplementedError
