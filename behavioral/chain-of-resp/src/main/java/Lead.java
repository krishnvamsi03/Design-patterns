import application.LeaveApplication;

public class Lead extends Employee {
    public Lead(LeaveApprover nextApprover) {
        super("lead", nextApprover);
    }

    @Override
    public boolean processApplication(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == LeaveApplication.Type.SICK) {
            if (leaveApplication.getNoOfDays() <= 2) {
                leaveApplication.updateStatus("lead",
                        LeaveApplication.Status.APPROVED);
                return true;
            }
        }
        return false;
    }
}
