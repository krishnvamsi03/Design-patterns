public class Paid implements OrderState {
    @Override
    public void handleCancellation() {
        System.out.println("Cancelling in paid state cancellation fee 20Rs");
    }
}
