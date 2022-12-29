import product.Message;

public abstract class MessageCreator {

    abstract Message createMessage();
    private Message message;
    public Message getMessage() {
        message = createMessage();
        return message;
    }
}
