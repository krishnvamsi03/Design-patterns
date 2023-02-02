from .Instance import Instance
from storage.Storage import Storage
from factory.newfactory.test import Test


class AWSInstance(Instance):

    def __init__(self):
        self.storage = None

    def start(self):
        print("Starting AWSInstance")

    def stop(self):
        print("Stopping AWSInstance")

    def attach_storage(self, storage: Storage):
        self.storage = storage
        print("attaching storage")
        print("Attached storage ", self.storage.__class__.__name__)
