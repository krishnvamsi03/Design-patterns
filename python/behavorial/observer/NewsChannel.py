from Observer import Observer


class NewsChannel(Observer):

    def __init__(self, channel_id: int):
        self.channel_id = channel_id

    def update(self, message: str):
        print(f"{message} received by channel id: {self.channel_id} ")
