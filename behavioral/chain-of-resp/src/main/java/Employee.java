import application.LeaveApplication;

public abstract class Employee implements LeaveApprover {
    private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processApplication(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
        if (successor == null) {
            throw new IllegalArgumentException("No successor found for role " + role);
        }
    }

    public abstract boolean processApplication(LeaveApplication leaveApplication);
}
