from factory.ResourceFactory import ResourceFactory
from factory.AWSResourceFactory import AWSResourceFactory
from instance.Instance import Instance


class Client:
    def __init__(self, factory: ResourceFactory):
        self.factory = factory

    def get_instance(self, size) -> Instance:
        instance = self.factory.create_instance()
        storage = self.factory.create_storage(size)
        instance.attach_storage(storage)
        return instance


if __name__ == "__main__":
    client = Client(AWSResourceFactory())
    inst = client.get_instance(100)
    inst.start()
    inst.stop()
