from Instance import Instance
from storage.Storage import Storage


class GoogleCloudInstance(Instance):

    def __init__(self):
        self.storage = None

    def start(self):
        print("Starting Google cloud instance")

    def stop(self):
        print("Stopping instance")

    def attach_storage(self, storage: Storage):
        print("Attaching storage")
