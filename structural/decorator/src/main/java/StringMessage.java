public class StringMessage implements Message {
    private String message;

    public StringMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }
}
