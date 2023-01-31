from Message import Message
from JsonMessage import JsonMessage
from MessageCreator import MessageCreator


class JsonMessageCreator(MessageCreator):

    def get_creator(self) -> Message:
        return JsonMessage()
