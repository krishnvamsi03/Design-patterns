import java.util.List;

public class PrintDetail implements PrintStrategy {
    @Override
    public void printOrder(List<Order> orders) {
        System.out.println("********* Detail *************");
        for (var order : orders) {
            System.out.println(order.getId() + " " + order.getCreatedDate());
            for (var entry : order.getItems().entrySet()) {
                System.out.println("\t" + entry.getKey() + " " + entry.getValue());
            }
            System.out.println("total " + order.getItems().entrySet().stream().mapToDouble(e -> e.getValue()).sum());
        }
    }
}
