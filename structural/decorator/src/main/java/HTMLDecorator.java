import org.apache.commons.lang3.StringEscapeUtils;

public class HTMLDecorator implements Message {
    private Message message;

    public HTMLDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
