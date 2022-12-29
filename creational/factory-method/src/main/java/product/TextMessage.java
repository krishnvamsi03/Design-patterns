package product;

public class TextMessage implements Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
