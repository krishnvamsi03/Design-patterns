from .Storage import Storage


class S3Storage(Storage):

    def __init__(self, size):
        self.size = size

    def get_size(self):
        return self.size
