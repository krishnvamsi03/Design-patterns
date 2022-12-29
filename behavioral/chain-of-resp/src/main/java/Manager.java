import application.LeaveApplication;

public class Manager extends Employee {
    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override
    public boolean processApplication(LeaveApplication leaveApplication) {

        switch (leaveApplication.getType()) {
            case SICK:
                leaveApplication.updateStatus(getRole(),
                        LeaveApplication.Status.APPROVED);
                return true;
            case PT0:
                if (leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.updateStatus(getRole(),
                            LeaveApplication.Status.APPROVED);
                }
                return true;
            default:
                return false;
        }
    }
}
