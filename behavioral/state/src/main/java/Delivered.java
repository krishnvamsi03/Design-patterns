public class Delivered implements OrderState {
    @Override
    public void handleCancellation() {
        System.out.println("Cancelling in Delivered state");
    }
}
