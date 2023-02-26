from Observer import Observer
from typing import List


class NewsAgency:

    def __init__(self):
        self.news_channels: List[Observer] = []

    def add_channels(self, new_channel: Observer):
        self.news_channels.append(new_channel)

    def remove_channel(self, channel: Observer):
        self.news_channels.remove(channel)

    def notify_channels(self, message: str):
        for channel in self.news_channels:
            channel.update(message)
