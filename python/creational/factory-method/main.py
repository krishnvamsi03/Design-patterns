from JsonMessageCreator import JsonMessageCreator
from TextMessageCreator import TextMessageCreator

if __name__ == "__main__":
    jsonMessage = JsonMessageCreator().get_creator()
    print(jsonMessage.get_content())

    textMessage = TextMessageCreator().get_creator()
    print(textMessage.get_content())
