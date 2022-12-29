import java.util.LinkedList;
import java.util.List;

public class OrderMain {

    private static List<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrder();
        PrintOrders printOrders = new PrintOrders(new PrintSummary());
        printOrders.printOrders(orders);

        PrintOrders printOrders1 = new PrintOrders(new PrintDetail());
        printOrders1.printOrders(orders);
    }

    private static void createOrder() {
        Order order = new Order("100");
        order.addItem("Chips", 100.0);
        order.addItem("fries", 100.0);

        Order order1 = new Order("200");
        order1.addItem("Dosa", 25);
        order1.addItem("Idly", 30);

        Order order2 = new Order("300");
        order2.addItem("etc", 300);

        orders.add(order1);
        orders.add(order);
        orders.add(order2);

    }
}
