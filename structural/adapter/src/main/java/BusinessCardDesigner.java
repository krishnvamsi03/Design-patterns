import interfaces.Customer;

public class BusinessCardDesigner {

    public String getCard(Customer customer) {
        return "Name: " + customer.getName() + "\n" +
                "Job Title: " + customer.getJobTitle() + "\n" +
                "Location: " + customer.getAddress();
    }
}
