public class InTransit implements OrderState {
    @Override
    public void handleCancellation() {
        System.out.println("cancelling in transit state");
    }
}
