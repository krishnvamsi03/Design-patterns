public class Cancelled implements OrderState{
    @Override
    public void handleCancellation() {
        throw new IllegalStateException();
    }
}
