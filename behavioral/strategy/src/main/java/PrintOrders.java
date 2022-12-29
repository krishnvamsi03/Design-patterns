import java.util.List;

public class PrintOrders {
    private PrintStrategy printStrategy;

    public PrintOrders(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void printOrders(List<Order> order) {
        printStrategy.printOrder(order);
    }
}
