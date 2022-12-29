public class New implements OrderState{
    @Override
    public void handleCancellation() {
        System.out.println("cancelling in new state");
    }
}
