import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BaseEncoderDecorator implements Message {
    private Message message;

    public BaseEncoderDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes(StandardCharsets.UTF_8));
    }
}
