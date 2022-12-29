public class DecoratorMain {
    public static void main(String[] args) {
        Message message = new StringMessage("<Html/>");
        Message htmlMessage = new HTMLDecorator(message);
        Message baseMessage = new BaseEncoderDecorator(message);
        System.out.println(htmlMessage.getContent());
        System.out.println(baseMessage.getContent());
    }
}
