package objectadapter;

import interfaces.Customer;
import twowayadapter.Employee;

public class ObjectAdapter implements Customer {
    private Employee employee;

    public ObjectAdapter(Employee employee) {
        this.employee = employee;
    }
    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public String getJobTitle() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getAddress();
    }
}
