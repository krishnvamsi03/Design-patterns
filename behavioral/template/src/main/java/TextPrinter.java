import java.util.Map;

public class TextPrinter extends PrintOrder{
    @Override
    protected String start() {
        return "Start";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "order id " + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        var res = "";
        for (Map.Entry<String, Double> entry: order.getItems().entrySet()) {
            res += "item " + entry.getKey() + " value " + entry.getValue() + "\n";
        }
        return res;
    }

    @Override
    protected String end() {
        return "end";
    }
}
