from Message import Message


class JsonMessage(Message):

    def get_content(self):
        return "Json content"
