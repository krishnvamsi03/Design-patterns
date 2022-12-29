package product;

public class JsonMessage implements Message{
    @Override
    public String getContent() {
        return "{'jsonMessage':[]}";
    }
}
