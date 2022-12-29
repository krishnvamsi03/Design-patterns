public class Order {

    private OrderState currentState;

    public Order() {
        currentState = new New();
    }

    public void paymentSuccessful() {
        currentState = new Paid();
    }

    public void dispatch() {
        currentState = new InTransit();
    }

    public void delivered() {
        currentState = new Delivered();
    }

    public void cancel() {
        currentState.handleCancellation();
        currentState = new Cancelled();
    }
}
