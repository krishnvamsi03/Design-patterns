import interfaces.Customer;
import objectadapter.ObjectAdapter;
import twowayadapter.Employee;
import twowayadapter.EmployeeAdapter;

public class Main {
    public static void main(String[] args) {
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        EmployeeAdapter employeeAdapter = new EmployeeAdapter();
        populateEmployee(employeeAdapter);
        var card = cardDesigner.getCard(employeeAdapter);
        System.out.println(card);

        Employee newEmployee = new Employee();
        Customer cus1 = new ObjectAdapter(newEmployee);
        populateEmployee(newEmployee);
        System.out.println(cardDesigner.getCard(cus1));
    }

    public static void populateEmployee(Employee employee) {
        employee.setName("TestUser 1");
        employee.setJobTitle("Test Job");
        employee.setAddress("Test address");
    }
}
