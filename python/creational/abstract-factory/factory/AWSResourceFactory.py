from .ResourceFactory import ResourceFactory
from instance.AWSInstance import AWSInstance
from storage.S3Storage import S3Storage


class AWSResourceFactory(ResourceFactory):

    def create_instance(self):
        return AWSInstance()

    def create_storage(self, size):
        return S3Storage(size)
