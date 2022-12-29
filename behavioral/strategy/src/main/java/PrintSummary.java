import java.util.List;

public class PrintSummary implements PrintStrategy{
    @Override
    public void printOrder(List<Order> orders) {
        System.out.println("******** summary *********");
        System.out.println("Id    Date     total");
        for (var order : orders) {
            var total = order.getItems().entrySet().stream().mapToDouble(e -> e.getValue()).sum();
            System.out.println(order.getId() + " " + order.getCreatedDate() + " " + total);
        }
        System.out.println("*****************");
    }
}
