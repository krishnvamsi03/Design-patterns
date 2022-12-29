import product.Message;

public class Main {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator().getMessage());
        printMessage(new TextMessageCreator().getMessage());
    }

    private static void printMessage(Message message) {
        System.out.println(message.getContent());
    }
}
