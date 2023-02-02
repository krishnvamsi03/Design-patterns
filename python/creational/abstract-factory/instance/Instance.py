from abc import ABC, abstractmethod
from storage.Storage import Storage


class Instance(ABC):

    @abstractmethod
    def start(self):
        raise NotImplementedError

    @abstractmethod
    def stop(self):
        raise NotImplementedError

    @abstractmethod
    def attach_storage(self, storage: Storage):
        raise NotImplementedError
