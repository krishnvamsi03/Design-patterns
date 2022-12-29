import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;
    private Date createdDate;

    private Map<String, Double> items = new HashMap<>();

    public Order(String id) {
        this.id = id;
        createdDate = new Date();
    }

    public void addItem(String name, double rate) {
        items.putIfAbsent(name, rate);
    }

    public String getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Map<String, Double> getItems() {
        return items;
    }
}
