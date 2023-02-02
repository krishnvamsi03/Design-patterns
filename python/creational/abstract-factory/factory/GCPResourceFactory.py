from ResourceFactory import ResourceFactory
from instance.GoogleCloudInstance import GoogleCloudInstance
from storage.GCPStorage import GCPStorage


class GCPResourceFactory(ResourceFactory):

    def create_instance(self):
        return GoogleCloudInstance()

    def create_storage(self, size):
        return GCPStorage(size)
