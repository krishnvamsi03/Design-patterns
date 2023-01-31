from Message import Message
from TextMessage import TextMessage
from MessageCreator import MessageCreator


class TextMessageCreator(MessageCreator):

    def get_creator(self) -> Message:
        return TextMessage()
