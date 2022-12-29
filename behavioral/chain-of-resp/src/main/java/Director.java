import application.LeaveApplication;

public class Director extends Employee {

    public Director(LeaveApprover nextapprover) {
        super("Director", nextapprover);
    }

    @Override
    public boolean processApplication(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case PT0:
                leaveApplication.updateStatus(getRole(), LeaveApplication.Status.APPROVED);
                return true;
            default:
                return false;

        }
    }
}
